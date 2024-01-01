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

    Copyright 2018-2024 by Marcel Bokhorst (M66B)
*/

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelSelected extends ViewModel {
    private final MutableLiveData<Long> selectedItem = new MutableLiveData<>();

    public void select(Long selected) {
        selectedItem.setValue(selected);
    }

    public LiveData<Long> liveSelected() {
        return selectedItem;
    }

    public boolean isSelected(long id) {
        return Long.valueOf(id).equals(selectedItem.getValue());
    }
}
