package eu.faircode.email;

/*
    This file is part of FairEmail.

    FairEmail is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FairEmail is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with FairEmail.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2018-2022 by Marcel Bokhorst (M66B)
*/

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;

import androidx.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Date;
import java.util.Objects;

public class GmailState {
    private String token;
    private long acquired;

    static final String TYPE_GOOGLE = "com.google";
    private static final long TOKEN_LIFETIME = 60 * 60 * 1000L; // milliseconds

    private GmailState(String token, long acquired) {
        this.token = token;
        this.acquired = acquired;
    }

    @NonNull
    String getAccessToken() throws AuthenticatorException {
        if (token == null)
            throw new AuthenticatorException("no token");
        return token;
    }

    Long getAccessTokenExpirationTime() {
        if (token == null || acquired == 0)
            return null;
        else
            return acquired + TOKEN_LIFETIME;
    }

    void refresh(@NonNull Context context, String id, @NonNull String user, boolean forceRefresh)
            throws AuthenticatorException, OperationCanceledException, IOException {
        long now = new Date().getTime();
        Long expiration = getAccessTokenExpirationTime();
        boolean needsRefresh = (expiration != null && expiration < now);

        if (!needsRefresh && forceRefresh &&
                expiration != null &&
                expiration - ServiceAuthenticator.MIN_FORCE_REFRESH_INTERVAL < now)
            needsRefresh = true;


        EntityLog.log(context, EntityLog.Type.Debug, "Token user=" + id + ":" + user +
                " expiration=" + (expiration == null ? null : new Date(expiration)) +
                " need=" + needsRefresh +
                " force=" + forceRefresh);

        if (needsRefresh)
            try {
                if (token != null) {
                    EntityLog.log(context, "Invalidating token user=" + id + ":" + user);
                    AccountManager am = AccountManager.get(context);
                    am.invalidateAuthToken(TYPE_GOOGLE, token);
                }
                token = null;
                acquired = 0;
            } catch (Throwable ex) {
                Log.e(ex);
            }

        Account account = getAccount(context, user.replace("recent:", ""));
        if (account == null)
            throw new AuthenticatorException("Account not found for " + id + ":" + user);

        EntityLog.log(context, "Getting token user=" + id + ":" + user);
        AccountManager am = AccountManager.get(context);
        String newToken = am.blockingGetAuthToken(
                account,
                ServiceAuthenticator.getAuthTokenType(TYPE_GOOGLE),
                true);

        if (newToken != null && !newToken.equals(token)) {
            token = newToken;
            acquired = new Date().getTime();
        }

        if (token == null)
            throw new AuthenticatorException("No token for " + id + ":" + user);
    }

    static Account getAccount(Context context, String user) {
        AccountManager am = AccountManager.get(context);
        if (am == null)
            return null;
        Account[] accounts = am.getAccountsByType(TYPE_GOOGLE);
        for (Account account : accounts)
            if (Objects.equals(account.name, user))
                return account;
        return null;
    }

    public String jsonSerializeString() {
        try {
            JSONObject jobject = new JSONObject();
            jobject.put("token", token);
            jobject.put("acquired", acquired);
            return jobject.toString();
        } catch (JSONException ex) {
            Log.e(ex);
            return null;
        }
    }

    static GmailState jsonDeserialize(@NonNull String password) {
        try {
            JSONObject jobject = new JSONObject(password);
            String token = jobject.getString("token");
            long acquired = jobject.getLong("acquired");
            return new GmailState(token, acquired);
        } catch (JSONException ex) {
            return new GmailState(password, new Date().getTime());
        }
    }
}
