# Supporto FairEmail

Se hai una domanda, controlla prima le domande frequenti qui sotto. In fondo puoi trovare come porre altre domande, richiedere funzionalità e segnalare errori.

## Indice

* [Autorizzare account](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-authorizing-accounts)
* [Come fare per ...?](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-howto)
* [Problemi noti](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-known-problems)
* [Funzionalità pianificate](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-planned-features)
* [Funzionalità richieste di frequente](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-frequently-requested-features)
* [Domande frequenti](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-frequently-asked-questions)
* [Ricevi supporto](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-get-support)

## Autorizzare account

Nella maggior parte dei casi, la configurazione rapida sarà in grado di identificare automaticamente la configurazione giusta.

Se la configurazione rapida fallisce, dovrai configurare manualmente un account (per ricevere email) e un'identità (per inviare email). Per farlo avrai bisogno degli indirizzi dei server IMAP e SMTP e dei numeri delle porte, di sapere se SSL/TLS o STARTTLS devono essere usati e conoscere il tuo nome utente (solitamente, ma non sempre, il tuo indirizzo email) e la password.

Cercare *IMAP* e il nome del fornitore di solito è sufficiente per trovare la documentazione giusta.

In alcuni casi, dovrai abilitare l'accesso esterno al tuo account e/o utilizzare una password speciale (app), per esempio quando l'autenticazione a due fattori è attiva.

Per autorizzare:

* Gmail / G suite, vedi la [domanda 6](#user-content-faq6)
* Outlook / Live / Hotmail, vedi la [domanda 14](#user-content-faq14)
* Office 365, vedi [la domanda 14](#user-content-faq156)
* Microsoft Exchange, vedi [la domanda 8](#user-content-faq8)
* Yahoo, AOL e Sky, vedi la [domanda 88](#user-content-faq88)
* Apple iCloud, vedi la [domanda 148](#user-content-faq148)
* Free.fr, vedi la [domanda 157](#user-content-faq157)

Si prega di vedere [qui](#user-content-faq22) per messaggi di errore e soluzioni comuni.

Domande correlate:

* [OAuth è supportato?](#user-content-faq111)
* [Perché ActiveSync non è supportato?](#user-content-faq133)

<a name="howto">

## Come fare per ...?

* Cambiare il nome dell'account: Impostazioni, passo 1, Gestisci, tocca l'account
* Cambiare l'azione di scorrimento a sinistra/destra: Impostazioni, Comportamento, Imposta azioni di scorrimento
* Cambiare password: Impostazioni, passo 1, Gestisci, tocca l'account, cambia la password
* Impostare una firma: Impostazioni, passo 2, Gestisci, tocca l'identità, Modifica firma.
* Aggiungere indirizzi CC e CCN: tocca l'icona persone alla fine dell'oggetto dell'email
* Andare al messaggio successivo/precedente all'archiviazione/eliminazione: nelle impostazioni di comportamento disattiva *Chiudi automaticamente le conversazioni* e seleziona *Vai alla conversazione precedente/successiva* sotto *Alla chiusura di una conversazione*
* Aggiungere una cartella nella casella di posta unificata: premi a lungo la cartella nell'elenco delle cartelle e spunta *Mostra nella casella di posta unificata*
* Aggiungere una cartella al menu di navigazione: premi a lungo la cartella nell'elenco delle cartelle e spunta *Mostra nel menu di navigazione*
* Caricare più messaggi: premi a lungo una cartella nell'elenco delle cartelle, seleziona *Sincronizza più messaggi*
* Eliminare un messaggio, evitando il cestino: nel menu a 3 punti appena sopra il testo del messaggio *Elimina* o, in alternativa, deseleziona la cartella cestino nelle impostazioni dell'account
* Eliminare un account/identità: Impostazioni, passi 1/2, Gestisci, tocca account/identità, menu a tre punti, Elimina
* Eliminare una cartella: premi a lungo la cartella nell'elenco delle cartelle, Modifica le proprietà, menu a tre punti, Elimina
* Annullare l'invio: posta In uscita, tocca il messaggio, tocca l'icona Annulla
* Conservare i messaggi inviati nella posta in arrivo: [vedi queste domande frequenti](#user-content-faq142)
* Cambiare cartelle di sistema: Impostazioni, passo 1, Gestisci, tocca l'account, in fondo
* Impostazioni di esportazione/importazione: Impostazioni, menu di navigazione/menu hamburger

## Problemi noti

* ~~Un [errore in Android 5.1 e 6](https://issuetracker.google.com/issues/37054851) causa la visualizzazione di un formato sbagliato delle ore. Attivando/disattivando l'impostazione di Android *Usa il formato 24 ore* potrebbe risolvere temporaneamente il problema. È stato aggiunto un espediente.~~
* ~~Un [errore in Google Drive](https://issuetracker.google.com/issues/126362828) fa sì che i file esportati su Google Drive siano vuoti. Google lo ha corretto.~~
* ~~Un [errore in AndroidX](https://issuetracker.google.com/issues/78495471) provoca un crash occasionale di FairEmail durante la pressione a lungo o lo scorrimento. Google lo ha corretto.~~
* ~~Un [errore in AndroidX ROOM](https://issuetracker.google.com/issues/138441698) causa a volte un crash con "*... Eccezione durante il calcolo dei dati live del database ... Impossibile leggere la riga ...*". È stato aggiunto un espediente.~~
* Un [errore in Android](https://issuetracker.google.com/issues/119872129) causa un crash di FairEmail con "*... Notifica errata postata ...*" su alcuni dispositivi dopo l'aggiornamento di FairEmail e toccando su una notifica.
* Un [errore in Android](https://issuetracker.google.com/issues/62427912) a volte provoca un crash con "*... ActivityRecord non trovato per ...*" dopo l'aggiornamento FairEmail. La reinstallazione ([source](https://stackoverflow.com/questions/46309428/android-activitythread-reportsizeconfigurations-causes-app-to-freeze-with-black)) potrebbe risolvere il problema.
* Un [errore in Android](https://issuetracker.google.com/issues/37018931) a volte provoca un crash con *... InputChannel non è inizializzato ...* su alcuni dispositivi.
* ~~Un [errore in LineageOS](https://review.lineageos.org/c/LineageOS/android_frameworks_base/+/265273) a volte provoca un crash con *... java.lang.ArrayIndexOutOfBoundsException: length=...; index=... ...*.~~
* Un errore in Nova Launcher su Android 5.x causa il crash di FairEmail con un *java.lang.StackOverflowError* quando Nova Launcher ha accesso al servizio di accessibilità.
* ~~Il selettore di cartelle a volte non mostra cartelle per motivi ancora sconosciuti. Sembra essere risolto.~~
* ~~Un [errore in AndroidX](https://issuetracker.google.com/issues/64729576) rende difficile toccare lo scroller rapido. È stato aggiunto un espediente.~~
* ~~La crittografia con YubiKey risulta in un ciclo infinito. Ciò sembra essere causato da un [errore in OpenKeychain](https://github.com/open-keychain/open-keychain/issues/2507).~~
* Lo scorrimento verso una posizione collegata internamente nei messaggi originali non funziona. Ciò non può essere risolto perché la vista originale dei messaggi è contenuta in una vista a scorrimento.
* Un'anteprima di un testo di un messaggio non (sempre) appare negli orologi Samsung perché [setLocalOnly](https://developer.android.com/reference/androidx/core/app/NotificationCompat.Builder.html#setLocalOnly(boolean)) sembra venga ignorato. I testi di anteprima del messaggio sono noti per essere visualizzati correttamente sugli indossabili Pebble 2, Fitbit Charge 3, Mi band 3 e Xiaomi Amazfit BIP. Vedi anche [queste domande frequenti](#user-content-faq126).
* Un [errore in Android](https://issuetracker.google.com/issues/37068143) a volte provoca un crash con *... Spostamento non valido: ... L'intervallo valido è ... quando il testo è selezionato e tocca all'esterno del testo selezionato. Questo bug è stato risolto in Android 6.0.1.</li>
* I collegamenti interni (ancoraggi) non funzioneranno perché i messaggi originali sono mostrati in una WebView incorporata in una vista a scorrimento (l'elenco delle conversazioni). Questa è una limitazione di Android che non può essere fissata o lavorata.
* Il rilevamento della lingua [non funziona più](https://issuetracker.google.com/issues/173337263) su dispositivi Pixel con (aggiornato a?) Android 11</ul>

## Funzionalità pianificate

* ~~Sicronizzazione su richiesta (manuale)~~
* ~~Cifratura semi-automatica~~
* ~~Copia messaggio~~
* ~~Stelle colorate~~
* ~~Impostazioni di notifica per cartella~~
* ~~Selezione immagini locali per le firme~~ (non verrà aggiunto perchè richiede la gestione dei file e quasi tutti i client email non mostrano le immagini per impostazione predefinita)
* ~~Mostra messaggi che soddisfano un criterio~~
* ~~[ManageSieve](https://tools.ietf.org/html/rfc5804)~~ (non ci sono librerie Java mantenute con licenza adeguata e senza dipendenze, inoltre FairEmail ha le proprie regole di filtraggio)
* ~~Cerca messaggi con/senza allegati~~ (non può essere implementata perchè IMAP non supporta la ricerca degli allegati)
* ~~Cerca una cartella~~ (il filtro su cartelle gerarchiche è problematico)
* ~~Suggerimenti di ricerca~~
* ~~[Messaggio di configurazione Autocrypt](https://autocrypt.org/autocrypt-spec-1.0.0.pdf) (section 4.4)~~ (Secondo me non è una buona idea permette ad un client di posta elettronica di gestire le chiavi di crittografia solo per casi d'uso rari se OpenKeychain può esportare anche le chiavi)
* ~~Cartelle unificate generiche~~
* ~~Programmazione notifiche nuovo messaggio per account~~ (implementato aggiungendo regole di orario in modo che i messaggi possano essere silenziati durante periodi scelti)
* ~~Copiare account e identità~~
* ~~Zoom con selezione~~ (non è possibile in modo affidabile in una lista scorrevole; si può invece ingrandire l'intero messaggio)
* ~~Visualizzazione delle cartelle più compatta~~
* ~~Creare liste e tabelle~~ (richiede un rich text editor, vedi [questa FAQ](#user-content-faq99))
* ~~Pizzica ingrandimento della dimensione del testo~~
* ~~Mostra GIF~~
* ~~Temi~~ (un tema grigio chiaro e scuro è stato aggiunto perché questo è ciò che gran parte delle persone sembrano di volere)
* ~~Ogni condizione dell'ora del giorno~~ (ogni giorno non si adatta davvero nella condizione da/alla data/orario)
* ~~Invia come allegato~~
* ~~Widget per il profilo selezionato~~
* ~~Ricorda di allegare i file~~
* ~~Seleziona i domini per cui mostrare le immagini~~ (questo sarà troppo complicato da usare)
* ~~Visualizzazione messaggi preferiti unificati~~ (c'è già una ricerca speciale per questo)
* ~~Sposta azione di notifica~~
* ~~Supporto S/MIME~~
* ~~Cerca impostazioni~~

Qualsiasi cosa su questa lista è in ordine casuale e *potrebbe* essere aggiunto nel vicino futuro.

## Funzionalità richieste di frequente

Il design è basato su molte discussioni e se vuoi puoi discuterne anche tu [in questo forum](https://forum.xda-developers.com/android/apps-games/source-email-t3824168). L'obiettivo del design è quello di essere minimalista (senza menu inutili, pulsanti, ecc.) e di non distrarre (senza colori fantasiosi, animazioni, ecc). Tutte le cose visualizzate devono essere utili in un modo o nell'altro e devono essere posizionate con attenzione per un facile utilizzo. Caratteri, dimensioni, colori, ecc devono essere in material design quando possibile.

## Domande frequenti

* [(1) Quali autorizzazioni sono necessarie e perché?](#user-content-faq1)
* [(2) Perché viene mostrata una notifica permanente?](#user-content-faq2)
* [(3) Cosa sono le operazioni e perché sono in sospeso?](#user-content-faq3)
* [(4) Come posso usare un certificato di sicurezza non valido / password vuota / connessione di testo semplice?](#user-content-faq4)
* [(5) Come posso personalizzare la visualizzazione dei messaggi?](#user-content-faq5)
* [(6) Come posso accedere a Gmail / G suite?](#user-content-faq6)
* [(7) Perché i messaggi inviati non appaiono (direttamente) nella cartella inviata?](#user-content-faq7)
* [(8) Posso usare un account Microsoft Exchange?](#user-content-faq8)
* [(9) Cosa sono le identità / come faccio ad aggiungere un alias?](#user-content-faq9)
* [~~(11) Perché POP non è supportato?~~](#user-content-faq11)
* [~~(10) Cosa significa 'UIDPLUS non supportato'?~~](#user-content-faq10)
* [(12) Come funziona la crittografia/decifrazione?](#user-content-faq12)
* [(13) Come funziona la ricerca su dispositivo/server?](#user-content-faq13)
* [(14) Come posso impostare un account Outlook / Live / Hotmail?](#user-content-faq14)
* [(15) Perché il testo del messaggio continua a caricare?](#user-content-faq15)
* [(16) Perché i messaggi non vengono sincronizzati?](#user-content-faq16)
* [~~(17) Perché la sincronizzazione manuale non funziona?~~](#user-content-faq17)
* [(18) Perché l'anteprima del messaggio non viene sempre mostrata?](#user-content-faq18)
* [(19) Perché le funzionalità pro sono così costose?](#user-content-faq19)
* [(20) Posso ottenere un rimborso?](#user-content-faq20)
* [(21) Come abilitare la luce delle notifiche?](#user-content-faq21)
* [(22) Cosa significa errore dell' account/cartella ... ?](#user-content-faq22)
* [(23) Perché mi arriva una segnalazione.. ?](#user-content-faq23)
* [(24) Cos'è la navigazione dei messaggi sul server?](#user-content-faq24)
* [(25) Perché non posso selezionare/aprire/salvare un'immagine, allegato o file?](#user-content-faq25)
* [(26) Posso aiutarvi a tradurre FairEmail nella mia lingua?](#user-content-faq26)
* [(27) Come posso distinguere le immagini integrate da quelle esterne?](#user-content-faq27)
* [(28) Come posso gestire le notifiche della barra di stato?](#user-content-faq28)
* [(29) Come posso ricevere notifiche di messaggi per altre cartelle?](#user-content-faq29)
* [(30) Come posso usare le impostazioni rapide previste?](#user-content-faq30)
* [(31) Come posso usare i collegamenti rapidi previsti?](#user-content-faq31)
* [(32) Come posso controllare se leggere un'email è davvero sicuro?](#user-content-faq32)
* [(33) Perché gli indirizzi modificati dei mittenti non funzionano?](#user-content-faq33)
* [(34) Come vengono abbinate le identità?](#user-content-faq34)
* [(35) Perché dovrei fare attenzione alla visualizzazione di immagini, allegati, il messaggio originale e ad aprire collegamenti?](#user-content-faq35)
* [(36) Come sono crittografati i file delle impostazioni?](#user-content-faq36)
* [(37) Come vengono memorizzate le password?](#user-content-faq37)
* [(39) Come posso ridurre l'uso della batteria di FairEmail?](#user-content-faq39)
* [(40) Come posso ridurre l'uso dei dati di FairEmail?](#user-content-faq40)
* [(41) Come posso correggere l'errore 'Handshake non riuscito'?](#user-content-faq41)
* [(42) È possibile aggiungere un nuovo provider all'elenco dei provider?](#user-content-faq42)
* [(43) Riesci a mostrare l'originale ... ?](#user-content-faq43)
* [(44) È possibile mostrare le foto dei contatti/ identicon nella cartella 'messaggi inviati'?](#user-content-faq44)
* [(45) Come posso risolvere 'Questa chiave non è disponibile. Per usarla, devi importarla come una delle tue!' ?](#user-content-faq45)
* [(46) Perché la lista dei messaggi continua ad aggiornarsi?](#user-content-faq46)
* [(47) Come risolvo l'errore 'Nessun account primario o nessuna cartella bozze'?](#user-content-faq47)
* [~~(48) Come posso risolvere l'errore 'Nessun account primario o nessuna cartella di archivio' ?~~](#user-content-faq48)
* [(49) Come faccio a risolvere 'Un'app obsoleta ha inviato un percorso di file invece di un flusso di file'?](#user-content-faq49)
* [(50) È possibile aggiungere un'opzione per sincronizzare tutti i messaggi?](#user-content-faq50)
* [(51) Come vengono ordinate le cartelle?](#user-content-faq51)
* [(52) Perché ci vuole tempo per riconnettersi a un account?](#user-content-faq52)
* [(53) Si può attaccare la barra d'azione del messaggio in alto/in basso?](#user-content-faq53)
* [~~(54) Come uso un prefisso dello spazio del nome?~~](#user-content-faq54)
* [(55) Come posso contrassegnare tutti i messaggi come letti / spostati o eliminare tutti i messaggi?](#user-content-faq55)
* [(56) Puoi aggiungere il supporto per JMAP?](#user-content-faq56)
* [(57) Posso usare HTML nelle firme?](#user-content-faq57)
* [(58) Cosa significa un'icona dell'email aperta/chiusa?](#user-content-faq58)
* [(59) I messaggi originali possono essere aperti nel browser?](#user-content-faq59)
* [(60) Lo sapevi ...?](#user-content-faq60)
* [(61) Perché alcuni messaggi sono mostrati oscurati?](#user-content-faq61)
* [(62) Quali metodi di autenticazione sono supportati?](#user-content-faq62)
* [(63) Come sono ridimensionate le immagini per la visualizzazione su schermi?](#user-content-faq63)
* [~~(64) Puoi aggiungere azioni personalizzate per lo scorrimento a sinistra/destra?~~](#user-content-faq64)
* [(65) Perché alcuni allegati sono mostrati oscurati?](#user-content-faq65)
* [(66) FairEmail è disponibile nella Libreria di Google Play Family?](#user-content-faq66)
* [(67) Come posso posticipare le conversazioni?](#user-content-faq67)
* [~~(68) Perché Adobe Acrobat reader non apre gli allegati PDF / le app di Microsoft non aprono i documenti allegati?~~](#user-content-faq68)
* [(69) Puoi aggiungere lo scorrimento in su su un messaggio nuovo?](#user-content-faq69)
* [(70) Quando saranno auto-espansi i messaggi?](#user-content-faq70)
* [(71) Come uso le regole del filtro?](#user-content-faq71)
* [(72) Cosa sono le identità/i profili principali?](#user-content-faq72)
* [(73) È sicuro/efficiente spostare i messaggi attraverso i profili?](#user-content-faq73)
* [(74) Perché vedo messaggi duplicati?](#user-content-faq74)
* [(75) Puoi creare una versione iOS, Windows, Linux, etc?](#user-content-faq75)
* [(76) Cosa fa 'Cancella messaggi locali'?](#user-content-faq76)
* [(77) Perché a volte i messaggi sono mostrati con un piccolo ritardo?](#user-content-faq77)
* [(78) Come uso i programmi?](#user-content-faq78)
* [(79) Come uso la sincronizzazione su richiesta (manuale)?](#user-content-faq79)
* [~~(80) Come risolvo l'errore 'Impossibile caricare BODYSTRUCTURE'?~~](#user-content-faq80)
* [~~(81) Puoi rendere scuro lo sfondo del messaggio originale nel tema scuro?~~](#user-content-faq81)
* [(82) Cos'è un'immagine di tracciamento?](#user-content-faq82)
* [(84) A che servono i contatti locali?](#user-content-faq84)
* [(85) Perché un'identità non è disponibile?](#user-content-faq85)
* [~~(86) Cosa sono le 'caratteristiche di privacy extra'?~~](#user-content-faq86)
* [(87) Cosa significa 'credenziali non valide'?](#user-content-faq87)
* [(88) Come posso usare un account Yahoo, AOL o Sky?](#user-content-faq88)
* [(89) Come invio messaggi di solo testo semplice?](#user-content-faq89)
* [(90) Perché alcuni testi sono collegati senza essere un collegamento?](#user-content-faq90)
* [~~(91) Puoi aggiungere la sincronizzazione periodica per risparmiare energia della batteria?~~](#user-content-faq91)
* [(92) Puoi aggiungere il filtro dello spam, la verifica della firma DKIM e l'autorizzazione SPF?](#user-content-faq92)
* [(93) Puoi consentire l'installazione/archiviazione dei dati su supporti di archiviazione esterna (sdcard)?](#user-content-faq93)
* [(94) Cosa significa la striscia rossa/arancione alla fine dell'intestazione?](#user-content-faq94)
* [(95) Perché non tutte le app sono mostrate durante la selezione di un allegato o immagine?](#user-content-faq95)
* [(96) Dove posso trovare le impostazioni IMAP e SMTP?](#user-content-faq96)
* [(97) Cos'è 'pulizia'?](#user-content-faq97)
* [(98) Perché posso ancora scegliere i contatti dopo aver revocato i permessi dei contatti?](#user-content-faq98)
* [(99) Puoi aggiungere un editor ricco di testo o markdown?](#user-content-faq99)
* [(100) Come posso sincronizzare le categorie di Gmail?](#user-content-faq100)
* [(101) Cosa significa il punto blu/arancione in fondo alle conversazioni?](#user-content-faq101)
* [(102) Come posso abilitare la rotazione automatica delle immagini?](#user-content-faq102)
* [(103) Come registro l'audio?](#user-content-faq158)
* [(104) Cosa devo sapere sulla segnalazione degli errori?](#user-content-faq104)
* [(105) Come funziona l'opzione roam-like-at-home?](#user-content-faq105)
* [(106) Quali launcher possono mostrare un distintivo di conteggio con il numero di messaggi non letti?](#user-content-faq106)
* [(107) Come uso le stelle colorate?](#user-content-faq107)
* [~~(108) Puoi aggiungere permanentemente l'eliminazione dei messaggi da ogni cartella?~~](#user-content-faq108)
* [~~(109) Perché 'seleziona profilo' è disponibile solo nelle versioni ufficiali?~~](#user-content-faq109)
* [(110) Perché (alcuni) messaggi vuoti e/o allegati sono corrotti?](#user-content-faq110)
* [(111) OAuth è supportato?](#user-content-faq111)
* [(112) Quale provider di posta elettronica consigliate?](#user-content-faq112)
* [(113) Come funziona l'autenticazione biometrica?](#user-content-faq113)
* [(114) Puoi aggiungere un'importazione per le impostazioni di altre app d'email?](#user-content-faq114)
* [(115) Puoi aggiungere i chip dell'indirizzo e-mail?](#user-content-faq115)
* [~~(116) Come posso mostrare le immagini nei messaggi da mittenti fidati di default?~~](#user-content-faq116)
* [(117) Puoi aiutarmi a ripristinare il mio acquisto?](#user-content-faq117)
* [(118) Cosa fa 'Rimuovi parametri di tracciamento' esattamente?](#user-content-faq118)
* [~~(119) Puoi aggiungere i colori al widget di posta in arrivo unificato?~~](#user-content-faq119)
* [(120) Perché le notifiche dei nuovi messaggi non sono rimosse all'apertura dell'app?](#user-content-faq120)
* [(121) Come sono raggruppati i messaggi in una conversazione?](#user-content-faq121)
* [~~(122) Perché il nome/indirizzo email del destinatario viene mostrato come un colore d'avviso?~~](#user-content-faq122)
* [(123) Cosa succederà quando FairEmail non potrà connettersi ad un server d'email?](#user-content-faq123)
* [(124) Perché ricevo 'Messaggio troppo grande o troppo complesso da mostrare'?](#user-content-faq124)
* [(125) Quali sono le caratteristiche sperimentali correnti?](#user-content-faq125)
* [(126) Possono le anteprime del messaggio essere inviate al mio indossabile?](#user-content-faq126)
* [(127) Come posso risolvere 'Argomento/i di HELO Sintatticamente non validi'? ](#user-content-faq127)
* [(128) Come posso reimpostare le domande chieste, ad esempio per mostrare le immagini?](#user-content-faq128)
* [(129) Sono ProtonMail e Tutanota supportati?](#user-content-faq129)
* [(130) Cosa significa messaggio d'errore ?](#user-content-faq130)
* [(131) Puoi modificare la direzione per lo scorrimento al messaggio precedente/successivo?](#user-content-faq131)
* [(132) Perché le notifiche dei nuovi messaggi sono silenziate?](#user-content-faq132)
* [(133) Perché ActiveSync non è supportato?](#user-content-faq133)
* [(134) Puoi aggiungere l'eliminazione dei messaggi locali?](#user-content-faq134)
* [(135) Perché i messaggi cestinati e le bozze sono mostrati nelle conversazioni?](#user-content-faq135)
* [(135) Come posso eliminare un profilo/un'identità/una cartella?](#user-content-faq136)
* [(137) Come posso reimpostare 'Non chiedere più'?](#user-content-faq137)
* [(138) Puoi aggiungere la gestione/sincronizzazione del calendario/contatto?](#user-content-faq138)
* [(139) Come risolvo 'L'utente è autenticato ma non connesso'?](#user-content-faq139)
* [(140) Perché il testo del massaggio contiene caratteri strani?](#user-content-faq140)
* [(141) Come posso correggere 'Una cartella delle bozze è necessaria per inviare i messaggi'?](#user-content-faq141)
* [(142) Come posso memorizzare i messaggi inviati nella posta in arrivo?](#user-content-faq142)
* [~~(143) Puoi aggiungere una cartella del cestino per i profili POP3?~~](#user-content-faq143)
* [(144) Come posso registrare le note vocali?](#user-content-faq144)
* [(145) Come posso impostare un suono di notifica per un profilo, una cartella o un mittente?](#user-content-faq145)
* [(146) Come posso risolvere gli orari non corretti dei messaggi?](#user-content-faq146)
* [(147) Cosa dovrei sapere delle versioni di terze parti?](#user-content-faq147)
* [(148) Come posso usare un profilo di Apple iCloud?](#user-content-faq148)
* [(149) Come funziona il widget di conteggio dei messaggi non letti?](#user-content-faq149)
* [(150) Puoi aggiungere l'annullamento degli inviti al calendario?](#user-content-faq150)
* [(151) Puoi aggiungere il backup/ripristino dei messaggi?](#user-content-faq151)
* [(152) Come posso inserire un gruppo di contatto?](#user-content-faq152)
* [(153) Perché non funziona l'eliminazione permanente dei messaggi di Gmail?](#user-content-faq153)
* [~~(154) Puoi aggiungere i favicon come foto di contatto?~~](#user-content-faq154)
* [(155) Cos'è un file winmail.dat?](#user-content-faq155)
* [(156) Come posso configurare un profilo di Office 365?](#user-content-faq156)
* [(157) Come posso configurare un profilo di Free.fr?](#user-content-faq157)
* [(158) Quale registratore audio / videocamera consigliate?](#user-content-faq158)
* [(159) Cosa sono gli elenchi di protezione del monitoraggio di Disconnect?](#user-content-faq159)
* [(160) Puoi aggiungere l'eliminazione permanente dei messaggi senza conferma?](#user-content-faq160)
* [(161) Puoi aggiungere un'impostazione per modificare il colore primario e di cadenza?](#user-content-faq161)
* [(162) IMAP NOTIFY è supportato?](#user-content-faq162)
* [(163) Cos'è la classificazione dei messaggi?](#user-content-faq163)

[Ho un'altra domanda.](#user-content-support)

<a name="faq1"></a>
**(1) Quali permessi sono necessari e perché?**

I permessi di Android seguenti sono necessari:

* *avere accesso completo alla rete* (INTERNET): per inviare e ricevere le email
* *visualizza le connessioni di rete* (ACCESS_NETWORK_STATE): per monitorare le modifiche alla connettività di internet
* *esegui all'avvio* (RECEIVE_BOOT_COMPLETED): per avviare il monitoraggio all'avvio del dispositivo
* *servizio in primo piano* (FOREGROUND_SERVICE): per eseguire un servizio in primo piano su Android 9 Pie e successive, vedi anche la prossima domanda
* *prevenire che il dispositivo vada in riposo* (WAKE_LOCK): per mantenere attivo il dispositivo durante la sincronizzazione dei messaggi
* *fatturazione in-app* (BILLING): per consentire gli acquisti in-app
* Opzionale: *leggi i tuoi contatti* (READ_CONTACTS): per completare automaticamente gli indirizzi e mostrare le foto
* Opzionale: *leggere i contenuti della tua scheda SD* (READ_EXTERNAL_STORAGE): per accettare i file da altre app obsolete, vedi anche [questa FAQ](#user-content-faq49)
* Opzionale: *usa l'hardware delle impronte digitali* (USE_FINGERPRINT) e usa *l'hardware biometrico* (USE_BIOMETRIC): per usare l'autenticazione biometrica
* Opzionale: *trova profili sul dispositivo* (GET_ACCOUNTS): per selezionare un profilo quando si utilizza la configurazione rapida di Gmail
* Android 5.1 e precedenti: *usa profili sul dispositivo* (USE_CREDENTIALS): per selezionare un profilo quando usi la configurazione rapida di Gmail (non necessario sulle versioni di Android successive)
* Android 5.1 Lollipop e precedenti: *Leggi profilo* (READ_PROFILE): per leggere il tuo nome quando usi la configurazione rapida di Gmail (non necessario sulle versioni di Android successive)

[I permessi opzionali](https://developer.android.com/training/permissions/requesting) sono supportati solo su Android 6 Marshmallow e successive. Sulle versioni precedenti di Android ti sarà chiesto di garantire i permessi opzionali per l'installazione di FairEmail.

I permessi seguenti sono necessari per mostrare il conteggio dei messaggi non letti come un distintivo (vedi anche [questa FAQ](#user-content-faq106)):

* *com.sec.android.provider.badge.permission.READ*
* *com.sec.android.provider.badge.permission.WRITE*
* *com.htc.launcher.permission.READ_SETTINGS*
* *com.htc.launcher.permission.UPDATE_SHORTCUT*
* *com.sonyericsson.home.permission.BROADCAST_BADGE*
* *com.sonymobile.home.permission.PROVIDER_INSERT_BADGE*
* *com.anddoes.launcher.permission.UPDATE_COUNT*
* *com.majeur.launcher.permission.UPDATE_BADGE*
* *com.huawei.android.launcher.permission.CHANGE_BADGE*
* *com.huawei.android.launcher.permission.READ_SETTINGS*
* *com.huawei.android.launcher.permission.WRITE_SETTINGS*
* *android.permission.READ_APP_BADGE*
* *com.oppo.launcher.permission.READ_SETTINGS*
* *com.oppo.launcher.permission.WRITE_SETTINGS*
* *me.everything.badger.permission.BADGE_COUNT_READ*
* *me.everything.badger.permission.BADGE_COUNT_WRITE*

FairEmail manterrà un elenco di indirizzi da cui ricevi e invii messaggi e userà questa lista per i suggerimenti di contatto quando non viene concesso alcun permesso di contatti a FairEmail. Ciò significa che puoi usare FairEmail senza il fornitore di contatti di Android (rubrica indirizzi). Nota che puoi ancora selezionare i contatti senza concedere i permessi dei contatti a FairEmail, solo suggerendo contatti non funzionerà senza i permessi dei contatti.

<br />

<a name="faq2"></a>
**(2) Perché è mostrata una notifica permanente?**

Una notifica della barra dello stato permanente a bassa priorità con il numero di profili monitorati e il numero di operazioni in attesa (vedi prossima domanda) è mostrata per prevenire che Android termini il servizio che si occupa della ricezione continua delle email. Questo era [già necessario](https://developer.android.com/reference/android/app/Service.html#startForeground(int,%20android.app.Notification)), ma con l'introduzione della [doze mode](https://developer.android.com/training/monitoring-device-state/doze-standby) in Android 6 Marshmallow questo è necessario più che mai. La modalità Doze interromperà tutte le app quando lo schermo è spento per un po' di tempo, a meno che l'app non abbia avviato un servizio in primo piano, che richiede la visualizzazione di una notifica della barra di stato.

La maggior parte, se non tutte, le altre app d'email non mostrano una notifica, con "effetto collaterale" che i nuovi messaggi sono spesso non segnalati o segnalati tardi e che i messaggi non sono inviati o inviati tardi.

Android mostra prima le icone delle notifiche della barra di stato di alta priorità e nasconderà l'icona della notifica di FairEmail se non c'è più spazio per mostrare le icone. In pratica ciò significa che la notifica della barra di stato non prende spazio nella barra di stato, a meno che non ci sia spazio disponibile.

La notifica della barra di stato può essere disabilitata tramite le impostazioni di notifica di FairEmail:

* Android 8 Oreo e successive: tocca il pulsante *Ricevi canale* e disabilita il canale tramite le impostazioni di Android (questo non disabiliterà le notifiche dei messaggi)
* Android 7 Nougat e precedenti: abilitato l'*Uso del servizio in background per sincronizzare i messaggi*, ma assicurati di leggere l'osservazione sotto l'impostazione

Puoi passare alla sincronizzazione dei messaggi periodicamente nelle impostazioni di ricezione per rimuovere la notifica, ma sii consapevole che ciò potrebbe usare maggiore energia della batteria. Vedi [qui](#user-content-faq39) per ulteriori dettagli sull'uso della batteria.

Android 8 Oreo potrebbe anche mostrare una notifica della barra di stato con il testo *Le app sono in esecuzione in background*. Sei pregato di vedere [qui](https://www.reddit.com/r/Android/comments/7vw7l4/psa_turn_off_background_apps_notification/) su come puoi disabilitare questa notifica.

Alcune persone hanno suggerito di usare [Firebase Cloud Messaging](https://firebase.google.com/docs/cloud-messaging/) (FCM) invece di un servizio Android con una notifica della barra dello stato, ma questo richiederebbe ai fornitori dell'email di inviare messaggi FCM ad o ad un server centrale dove sono raccolti tutti i messaggi di inviare messaggi FCM. La prima non si verificherà è l'ultima avrà significative implicazioni sulla privacy.

Se sei venuto/a qui cliccando sulla notifica, dovresti sapere che il prossimo clic aprirà la casella di posta unificata.

<br />

<a name="faq3"></a>
**(3) Cosa sono le operazioni e perché sono in sospeso?**

La notifica della barra dello stato a bassa priorità mostra il numero di operazioni in sospeso, che possono essere:

* *add*: aggiungi messaggio alla cartella remota
* *move*: sposta messaggio ad un'altra cartella remota
* *copy*: copia messaggio in un'altra cartella remota
* *fetch*: preleva il messaggio modificato (spinto)
* *delete*: elimina il messaggio dalla cartella remota
* *seen*: contrassegna il messaggio come letto/non letto nella cartella remota
* *answered*: contrassegna il messaggio come risposto nella cartella remota
* *flag*: aggiunge/rimuove la stella nella cartella remota
* *keyword*: aggiunge/rimuove il flag IMAP nella cartella remota
* *label*: imposta/ripristina l'etichetta di Gmail nella cartella remota
* *headers*: scarica le intestazioni dei messaggi
* *raw*: scarica il messaggio grezzo
* *body*: scarica il testo del messaggio
* *attachment*: scarica l'allegato
* *sync*: sincronizza i messaggi locali e remoti
* *subscribe*: si iscrive alla cartella remota
* *purge*: elimina tutti i messaggi dalla cartella remota
* *send*: invia messaggio
* *exists*: controlla se il messaggio esiste
* *rule*: esegui regola sul corpo del testo

Le operazioni sono elaborate solo quando esiste una connessione al server email o quando sincronizza manualmente. Vedi anche [questa FAQ](#user-content-faq16).

<br />

<a name="faq4"></a>
**(4) Come posso usare un certificato di sicurezza non / password vuota / connessione di testo semplice?**

*... Non affidabile ... non nel certificato ...*
<br />
*... Certificato di sicurezza non valido (Impossibile verificare l'identità del server) ...*

Dovresti provare a risolvere ciò contattando il tuo fornitore o ottenendo un certificato di sicurezza valido perché i certificati di sicurezza non validi non sono sicuri e consente gli [attacchi man-in-the-middle](https://en.wikipedia.org/wiki/Man-in-the-middle_attack). Se il denaro è un ostacolo, puoi ottenere dei certificati di sicurezza gratuiti da [Let's Encrypt](https://letsencrypt.org).

In alternativa, puoi accettare la fingerprint dei certificati server non validi in questo modo:

1. Assicurati di star usando una connessione internet affidabile (nessuna rete Wi-Fi pubblica, etc)
1. Vai alla schermata di configurazione tramite il menu di navigazione (scorri verso l'interno dal lato sinistro)
1. Nella fase 1 e 2 tocca *Gestisci* e tocca il profilo e l'identità difettosi
1. Seleziona/salva il profilo e l'identità
1. Seleziona la casella sotto al messaggio di errore e salva di nuovo

Questo "fisserà" il certificato del server per prevenire attacchi dell'uomo di mezzo.

Nota che le versioni più vecchie di Android potrebbero non riconoscere le autorità di certificazione più nuove come Let's Encrypt causando alle connessioni di essere considerate non sicure, vedi anche [qui](https://developer.android.com/training/articles/security-ssl).

*Ancoraggio di fiducia per il percorso di certificazione non trovato*

*... java.security.cert.CertPathValidatorException: Ancoraggio di fiducia per il percorso di certificazione non trovato ...* significa che il gestore di fiducia di Android predefinito non è stato capace di verificare la catena di certificati del server.

Dovresti correggere la configurazione del server o accettare l'impronta digitale mostrata sotto al messaggio di errore.

Nota che questo problema può essere anche causato dal mancato invio dal server di tutti i certificati intermedi.

*Password vuota*

Il tuo nome utente è probabilmente facile da indovinare, quindi non è sicuro.

*Connessione del testo semplice*

Il tuo nome utente e la password e tutti i messaggi saranno inviati e ricevuti non crittografati, il che è **molto insicuro** perché un[attacco man-in-the-middle](https://en.wikipedia.org/wiki/Man-in-the-middle_attack) è molto semplice su una connessione non crittografata.

Se vuoi ancora usare un certificato di sicurezza non valido, una password vuota o una connessione di testo semplice, dovrai abilitare le connessioni non sicure nelle impostazioni del profilo e/o identità. STARTTLS dovrebbe essere selezionato per le connessioni in testo semplice. Se abiliti le connessioni non sicure, dovresti connetterti tramite reti affidabili e private soltanto e mai tramite reti pubbliche, come quelle offerte negli hotel, aeroporti, etc.

<br />

<a name="faq5"></a>
**(5) Come posso personalizzare la visualizzazione dei messaggi?**

Nel menu di trabocco a tre puntini puoi abilitare o disabilitare o selezionare:

* *dimensione del testo*: per tre differenti dimensioni del font
* *vista compatta*: per altri elementi di messaggio compressi e un font di testo del messaggio più piccolo

Nella sezione di visualizzazione delle impostazioni puoi attivare o disattivare ad esempio:

* *Casella unificata*: per disabilitare la casella della posta in arrivo unificata ed elencare le cartelle selezionate invece per la casella di posta in arrivo unificata
* *Stile tabulare*: per mostrare un elenco lineare invece delle schede
* *Raggruppa per data*: mostra l'intestazione della data sui messaggi con la stessa data
* *Filettatura di conversazione*: per disabilitare la filettatura della conversazione e mostrare messaggi singoli piuttosto
* *Barra d'azione della conversazione*: per disabilitare la barra di navigazione in basso
* *Evidenzia colore*: per selezionare un colore per il mittente dei messaggi non letti
* *Mostra foto di contatto*: per nascondere le foto di contatto
* *Mostra nomi e indirizzi email*: per mostrare nomi o nomi e indirizzi email
* *Mostra oggetto corsivo*: per mostrare l'oggetto del messaggio come testo normale
* *Mostra stelle*: per nascondere le stelle (preferiti)
* *Mostra anteprima del messaggio*: per mostrare 1-4 linee del testo del messaggio
* *Mostra dettagli dell'indirizzo di default*: per espandere la sezione degli indirizzi di default
* *Mostra automaticamente il messaggio originale per i contatti noti*: per mostrare automaticamente i messaggi originali per i contatti sul tuo dispositivo, sei pregato di leggere [questa FAQ](#user-content-faq35)
* *Mostra automaticamente le immagini per i contatti noti*: per mostrare automaticamente le immagini per i contatti sul tuo dispositivo, sei pregato di leggere [questa FAQ](#user-content-faq35)

Nota che i messaggi sono visibili in anteprima solo quando il testo del messaggio è stato scaricato. I testi del messaggio più grandi non sono scaricati di default su reti misurate (generalmente mobili). Puoi modificare questa cosa nelle impostazioni di connessione.

Alcune persone chiedono:

* di mostrare il soggetto in grassetto, ma il grassetto è già usato per evidenziare i messaggi non letti
* di spostare la stella a sinistra, ma è molto più facile azionarla sul lato destro

<br />

<a name="faq6"></a>
**(6) Come posso accedere a Gmail / G suite?**

Puoi usare la procedura guidata rapida per configurare facilmente un profilo e un'identità Gmail.

Se non vuoi usare un profilo sul dispositivo di Gmail, puoi abilitare l'accesso per le "app meno sicure" e usare la password del tuo profilo (sconsigliato) o abilitare l'autenticazione a due fattori e usare una password specifica dell'app. Per usare una password dovrai configurare un profilo e identità tramite i passaggi 1 e 2 della configurazione invece che tramite la procedura guidata rapida.

Sei pregato di vedere [questa FAQ](#user-content-faq111) sul perché sono utilizzabili i profili su dispositivo.

Nota che una password specifica dell'app è necessario quando l'autenticazione a due fattori è abilitata.

<br />

*Password specifica dell'app*

Vedi [qui](https://support.google.com/accounts/answer/185833) come generare una password specifica dell'app.

<br />

*Abilita "App meno sicure"*

**Importante**: usare questo metodo è sconsigliato perché meno affidabile.

**Importante**: I profili Gsuite autorizzati con un nome utente/password smetteranno di funzionare [nel futuro prossimo](https://gsuiteupdates.googleblog.com/2019/12/less-secure-apps-oauth-google-username-password-incorrect.html).

Vedi [qui](https://support.google.com/accounts/answer/6010255) su come abilitare le "app meno sicure" o vai [direttamente all'impostazione](https://www.google.com/settings/security/lesssecureapps).

Se usi profili Gmail multipli, assicurati di modificare l'impostazione delle "app meno sicure" dei profili corretti.

Sappi che devi lasciare la schermata delle impostazioni delle "app meno sicure" usando la freccia indietro per applicarle.

Se usi questo metodo, dovresti usare una [password forte](https://en.wikipedia.org/wiki/Password_strength) per il tuo profilo Gmail, il che è comunque una buona idea. Nota che usare il protocollo IMAP [standard](https://tools.ietf.org/html/rfc3501) non è di per sé meno sicuro.

Quando "app meno sicure" non è abilitato, otterrai l'errore *Autenticazione fallita - credenziali non valide* per i profili (IMAP) e *Nome utente e Password non accettate* per le identità (SMTP).

<br />

*Generale*

Potresti ottenere l'avviso "*Sei pregato di accedere tramite il tuo browser web*". Questo si verifica quando Google considera la rete che ti connette a internet (potrebbe essere un VPN) come insicura. Questo si può prevenire usando la procedura guidata rapida di Gmail su una password specifica dell'app.

Vedi [qui](https://support.google.com/mail/answer/7126229) per le istruzioni di Google e [qui](https://support.google.com/mail/accounts/answer/78754) per la risoluzione dei problemi.

<br />

<a name="faq7"></a>
**(7) Perché i messaggi inviati non compaiono (direttamente) nella cartella inviati?**

I messaggi inviati sono normalmente spostati dalla posta in uscita alla cartella inviata appena il tuo provider aggiunge i messaggi inviati alla cartella degli inviati. Questo richiede la selezione di una cartella inviati nelle impostazioni del profilo e la cartella inviati da impostare per la sincronizzazione.

Alcuni provider non tengono traccia dei messaggi inviati o il server SMTP usato potrebbe non essere correlato al provider. In questi casi FairEmail, aggiungerà automaticamente i messaggi inviati alla cartella inviati sulla sincronizzazione della cartella inviati, che succederà dopo l'invio di un messaggio. Nota che questo risulterà in traffico internet extra.

~~Se non succede, il tuo provider potrebbe non tenere traccia dei messaggi inviati o potresti star usando un server SMTP non correlato al provider.~~ ~~In questi casi puoi abilitare le identità avanzate impostando *Archivia messaggi inviati* per far aggiungere i messaggi inviati a FairEmail alla cartella inviati dopo l'invio di un messaggio.~~ ~~Nota che abilitare quest'impostazione potrebbe risultare in messaggi duplicati se il tuo provider aggiunge anche i messaggi inviati alla cartella inviati.~~ ~~Stai anche attento al fatto che abilitare quest'impostazione risulterà in uso dei dati extra, specialmente inviando i messaggi con grandi allegati.~~

~~Se i messaggi inviati nella posta in uscita non si trovano nella cartella inviati alla sincronizzazione completa, saranno anche spostati dalla posta in uscita alla cartella inviati.~~ ~~Una sincronizzazione completa si verifica riconnettendosi al server o sincronizzando periodicamente o manualmente.~~ ~~Potresti voler abilitare l'impostazione avanzata *Archivia messaggi inviati* invece di spostare i messaggi prima alla cartella degli inviati.~~

<br />

<a name="faq8"></a>
**(8) Posso usare un profilo di Microsoft Exchange?**

Puoi usare un profilo di Microsoft Exchange se è accessibile via IMAP; che è principalmente del caso. Vedi [qui](https://support.office.com/en-us/article/what-is-a-microsoft-exchange-account-47f000aa-c2bf-48ac-9bc2-83e5c6036793) per ulteriori informazioni.

Sei pregato di vedere [qui](https://support.office.com/en-us/article/pop-imap-and-smtp-settings-for-outlook-com-d088b986-291d-42b8-9564-9c414e2aa040) per la documentazione di Microsoft sulla configurazione di un client email. Esiste anche una sezione sugli errori di connessione comune e le soluzioni.

Alcune versioni del server di Exchange più vecchie hanno un bug che causa un messaggio vuoto e allegati corrotti. Sei pregato di vedere [questa FAQ](#user-content-faq110) per una soluzione.

Sei pregato di vedere [questa FAQ](#user-content-faq133) sul supporto di ActiveSync.

Sei pregato di vedere [questa FAQ](#user-content-faq111) sul supporto di OAuth.

<br />

<a name="faq9"></a>
**(9) Cosa sono le identità / come aggiungo un alias</p>

Le identità rappresentano gli indirizzi email *da* cui invii tramite un server (SMTP) email.

Alcuni provider ti consentono di avere alias multipli. Puoi configurarli impostando il campo dell'indirizzo email di un'identità aggiuntiva all'indirizzo dell'alias e impostando il campo del nome utente al tuo indirizzo email principale.

Nota che puoi copiare un'identità tenendola premuta a lungo.

In alternativa, puoi abilitare *Consenti la modifica dell'indirizzo del mittente* nelle impostazioni avanzate di un'identità esistente per modificare il nome utente componendo un nuovo messaggio, se il tuo provider lo consente.

FairEmaiò aggiornerà automaticamente le password delle identità correlate quando aggiorni la password del profilo associato o un'identità correlata.

Vedi [questa FAQ](#user-content-faq33) sulla modifica del nome utente di indirizzi email.

<br />

<a name="faq10"></a>
**~~(10) Cosa significa 'UIDPLUS non supportato'?~~**

~~Il messaggio di errore *UIDPLUS non supportato* significa che il tuo provider email non fornisce l'[estensione UIDPLUS](https://tools.ietf.org/html/rfc4315) di IMAP. Quest'estensione IMAP è richiesta per implementare la sincronizzazione a due passaggi, che non è una funzionalità opzionale. Quindi, a meno che il tuo provider non possa abilitarla, non puoi usare FairEmail per questo provider.~~

<br />

<a name="faq11"></a>
**~~(11) Perché POP non è supportato?~~**

~~Oltre ciò ogni provider email decente supporta [IMAP](https://en.wikipedia.org/wiki/Internet_Message_Access_Protocol) di questi giorni,~~ ~~usare [POP](https://en.wikipedia.org/wiki/Post_Office_Protocol) risulterà in uso della batteria extra non necessari e notifiche dei nuovi messaggi ritardati.~~ ~~Inoltre, POP è inadatto alla sincronizzazione a due passaggi e più spesso che mai le persone leggono e scrivono messaggi su diversi dispositivi di questi giorni.~~

~~Fondamentalmente, POP supporta solo lo scaricamento e l'eliminazione dei messaggi dalla posta in arrivo.~~ ~~Quindi, le operazioni comuni come impostare gli attributi del messaggio (letto, preferito, risposto, etc.), aggiungere (backup) e spostare messaggi non è possibile.~~

~~Vedi anche [cosa scrive a riguardo Google](https://support.google.com/mail/answer/7104828).~~

~~Per esempio [Gmail può importare i messaggi](https://support.google.com/mail/answer/21289) da un altro profilo POP,~~ ~~che si può usare come soluzione per quando il tuo provider non supporta IMAP.~~

~~tl;dr; considera di passare a IMAP.~~

<br />

<a name="faq12"></a>
**(12) Come funziona la crittografia/decrittografia?**

La comunicazione con i server email è sempre crittografata, a meno che tu non lo disattivi esplicitamente. Questa domanda riguarda la crittografia opzionale end-to-end con PGP o S/MIME. Il mittente e il destinatario dovrebbero prima acconsentire a riguardo e scambiarsi messaggi firmati per trasferire la loro chiave pubblica per poter inviare i messaggi crittografati.

*Generale*

Sei pregato di [vedere qui](https://en.wikipedia.org/wiki/Public-key_cryptography) come funziona la crittografia della chiave pubblica/privata.

Crittografia in breve:

* I messaggi **in uscita** sono crittografati con la **chiave pubblica** del destinatario
* I messaggi **in arrivo** sono decrittografati con la **chiave privata** del destinatario

Iscrizione breve:

* I messaggi **In Uscita** sono firmati con la **chiave privata** del mittente
* I messaggi **In Entrata** sono verificati con la **chiave pubblica** del mittente

Per firmare/crittografare un messaggio, basta selezionare il metodo appropriato nella finestra di invio. Puoi sempre aprire la finestra di invio usando il menu di trabocco a tre puntini nel caso tu abbia selezionato *Non mostrare più* prima.

Per verificare una firma o decrittografare un messaggio ricevuto, apri il messaggio e tocca solo il gesto o l'icona del lucchetto proprio sotto la barra d'azione del messaggio.

La prima volta che invii un messaggio crittografato/decrittografato ti potrebbe esser chiesta una chiave di firma. FairEmail archivierà automaticamente la chiave di firma selezionata nell'identità usata per la prossima volta. Se devi ripristinare la chiave di firma, salva solo l'identità o premila a lungo nell'elenco delle identità e seleziona *Ripristina la chiave di firma*. La chiave di firma selezionata è visibile nell'elenco delle identità. Se devi selezionare una chiave su base del caso, puoi creare le identità multiple per lo stesso profilo con lo stesso indirizzo email.

Nelle impostazioni della privacy puoi selezionare il metodo di crittografia predefinito (PGP o S/MIME), abilita *Firma di default*, *Crittografa di default* e *Decrittografa automaticamente i messaggi*, ma sappi che la decrittografia automatica è impossibile se l'interazione dell'utente è necessaria, come selezionare una chiave o leggere un token di sicurezza.

Il testo/gli allegati del messaggio da crittografare e quelli del messaggio decrittografato sono archiviati solo localmente e non saranno mai aggiunti al server remoto. Se vuoi annullare la decrittografia, puoi usare l'elemento del menu di *resincronizza* nel menu a tre puntini della barra d'azione del messaggio.

*PGP*

Dovrai installare e configurare [OpenKeychain](https://f-droid.org/en/packages/org.sufficientlysecure.keychain/) prima. FairEmail è stato testato con la versione 5.4 di OpenKeychain. Le ultime versioni saranno più probabilmente compatibili, quelle precedenti no.

**Importante**: l'app di OpenKeychain è nota per crashare (improvvisamente) quando l'app chiamante (FairEmail) non è ancora autorizzata e riceve una chiave pubblica esistente. Puoi risolverlo provando a inviare un messaggio firmato/crittografato a un mittente con una chiave pubblica sconosciuta.

**Importante**: se l'app di OpenKeychain non può trovare (più) una chiave, potresti dover ripristinare una chiave selezionata precedentemente. Questo si può fare premendo a lungo un'identità nell'elenco delle identità (Configurazione, passaggio 2, Gestione).

**Importante**: per connettere affidabilmente app come FairEmail al servizio di OpenKeychain per crittografare/decrittografare i messaggi, potrebbe essere necessario disabilitare le ottimizzazioni della batteria per l'app di OpenKeychain.

**Importante**: l'app di OpenKeychain necessita del permesso di contatti per funzionare correttamente.

**Importante**: su alcuni dispositivi / versioni di Android è necessario abilitare *Mostra popup con l'esecuzione in background* nei permessi aggiuntivi delle impostazioni dell'app di Android dell'app di OpenKeychain. Senza questo permesso la bozza sarà salvata, ma il popup di OpenKeychain per confermare/selezionare potrebbe non comparire.

FairEmail invierà l'intestazione di [Autocrypt](https://autocrypt.org/) per l'uso da altri client email, ma solo per i messaggi firmati e crittografati perché troppi server email hanno problemi con le intestazioni spesso lunghe di Autocrypt. Nota che il modo più sicuro per avviare uno scambio di email crittografate è inviando messaggi firmati prima. Le intestazioni ricevute di Autocrypt saranno inviate all'app di OpenKeychain per l'archiviazione alla verifica di una firma o decrittografando un messaggio.

Tutta la gestione delle chiavi è delegata all'app OpenKeychain per motivi di sicurezza. Questo significa anche che FairEmail non memorizza le chiavi PGP.

Il PGP crittografato in linea nei messaggi ricevuti è supportato, ma le firme e i messaggi in uscita PGP in linea non sono supportati, vedi [qui](https://josefsson.org/inline-openpgp-considered-harmful.html) sul perché no.

I messaggi di sola firma o sola crittografia non sono una buona idea, sei pregato di vedere qui perché no:

* [Considerazioni di OpenPGP Parte I](https://k9mail.github.io/2016/11/24/OpenPGP-Considerations-Part-I.html)
* [Considerazioni di OpenPGP Parte II](https://k9mail.github.io/2017/01/30/OpenPGP-Considerations-Part-II.html)
* [Considerazioni di OpenPGP Parte III Autocrypt](https://k9mail.github.io/2018/02/26/OpenPGP-Considerations-Part-III-Autocrypt.html)

I messaggi di sola firma sono supportati, i messaggi di sola crittografia no.

Errori comuni:

* *Nessuna chiave*: non c'è nessuna chiave PGP disponibile per uno degli indirizzi e-mail elencati
* *Chiave mancante per la crittografia*: c'è probabilmente una chiave selezionata in FairEmail che non esiste più nell'applicazione OpenKeychain. Resettare la chiave (vedi sopra) probabilmente risolverà questo problema.

*S/MIME*

Crittografare un messaggio richiede le chiavi pubbliche dei destinatari. Firmare un messaggio richiede la tua chiave privata.

Le chiavi private sono memorizzate da Android e sono importabili tramite le impostazioni di sicurezza avanzate di Android. Esiste una scorciatoia (pulsante) per questo nelle impostazioni sulla privacy. Android ti chiederà di impostare un PIN, schema o password se non lo hai fatto prima. Se hai un dispositivo Nokia con Android 9, sei pregato di [leggere questo prima](https://nokiamob.net/2019/08/10/a-bug-prevents-nokia-1-owners-from-unlocking-their-screen-even-with-right-pin-pattern/).

Nota che i certificati possono contenere chiavi multiple per scopi multipli, ad esempio l'autenticazione, la crittografia e la firma. Android importa solo la prima chiave, quindi per importarle tutte, il certificato va prima diviso. Questo non è molto banale e ti si consiglia di chiedere supporto al fornitore del certificato.

Nota che la firma S/MIME con altri algoritmi oltre RSA è supportata, ma sappi che altri client email potrebbero non supportarlo. La crittografia S/MIME è possibile solo con algoritmi simmetrici, il che significa in pratica usando RSA.

Il metodo predefinito di crittografia è PGP, ma l'ultimo metodo di crittografia usato sarà ricordato per l'identità selezionata per la prossima volta. Potresti dover abilitare di nuovo le opzioni di invio nel menu a tre puntini per poter selezionare il metodo di crittografia.

Per consentire chiavi private differenti per lo stesso indirizzo email, FairEmail ti fa sempre selezionare una chiave quando ci sono identità multiple con lo stesso indirizzo email per lo stesso profilo.

Le chiavi pubbliche sono memorizzate da FairEmail e sono importabili verificando una firma per la prima volta o tramite le impostazioni sulla privacy (formato PEM o DER).

FairEmail verifica sia la firma che l'intera catena di certificati.

Errori comuni:

* *Nessun certificato corrispondente a targetContraints trovato*: questo potrebbe significare che stai usando una versione vecchia di FairEmail
* *Impossibile trovare il percorso di certificazione valido al target richiesto*: fondamentalmente ciò significa che uno o più certificati intermedi o di root non sono stati trovati
* *La chiave privata non corrisponde a quelle di crittografia*: la chiave selezionata non è utilizzabile per decrittografare il messaggio, probabilmente perché errata
* *Nessuna chiave privata*: nessun certificato selezionato o disponibile nel keystore di Android

Nel caso in cui la catena del certificato sia errata, puoi toccare sul piccolo pulsante di informazioni per mostrare tutti i certificati. Dopo i dettagli del certificato è mostrato l'emittente o "selfSign". Un certificato è autofirmato quando l'oggetto e l'emittente corrispondono. I certificati da un'autorità di certificazione (CA) sono contrassegnati con "[keyCertSign](https://tools.ietf.org/html/rfc5280#section-4.2.1.3)". I certificati trovati nel negozio di chiavi di Android sono contrassegnate con "Android".

Una catena valida somiglia a questa:

```
Il tuo certificato > zero o più certificati intermedi > certificato CA (root) contrassegnato con "Android"
```

Nota che una catena di certificati sarà sempre invalida quando nessun certificato di ancoraggio è trovato nel negozio di chiavi di Android, il che è fondamentale per la convalida del certificato S/MIME.

Sei pregato di vedere [qui](https://support.google.com/pixelphone/answer/2844832?hl=en) come puoi importare i certificati nel negozio di chiavi di Android.

L'uso di chiavi scadute, messaggi crittografati/firmati in linea e token di sicurezza hardware non è supportato.

Se stai cercando un certificato S/MIME gratuito (di prova), vedi [qui](http://kb.mozillazine.org/Getting_an_SMIME_certificate) per le opzioni. Sei pregato di assicurarti di [leggere questo prima](https://davidroessli.com/logs/2019/09/free-smime-certificates-in-2019/#update20191219) se vuoi richiedere un certificato S/MIME Actalis. Se cerchi un certificato S/MIME economico, ho avuto una buona esperienza con [Certum](https://www.certum.eu/en/smime-certificates/).

Come estrarre una chiave pubblica da un certificato S/MIME:

```
openssl pkcs12 -in filename.pfx/p12 -clcerts -nokeys -out cert.pem
```

Puoi decrittografare le firme di S/MIME, etc., [qui](https://lapo.it/asn1js/).

La firma/crittografia di S/MIME è una funzionalità pro, ma tutte le altre operazioni PGP e S/MIME sono gratuite.

<br />

<a name="faq13"></a>
**(13) Come funziona la ricerca sul dispositivo/server?**

Puoi avviare la ricerca di messaggi sul testo del mittente (da), destinatario (a, cc, bcc), oggetto, parole chiave o del messaggio usando la lente di ingrandimento nella barra di azione di una cartella. Puoi anche cercare da ogni app selezionando *Cerca email* nel menu popup copia/incolla.

Ricercare nella casella di posta in entrata unificata cercherà in tutte le cartelle di tutti i profili, nell'elenco delle cartelle solo nel profilo associato e in una cartella solo in quella.

I messaggi saranno ricercati prima sul dispositivo. Ci sarà un pulsante di azione con un'icona di ricerca ancora in fondo per continuare la ricerca sul server. Puoi selezionare in quale cartella continuare la ricerca.

Il protocollo IMAP non supporta la ricerca in più di una cartella in contemporanea. La ricerca sul server è un'operazione costosa, dunque è impossibile selezionare cartelle multiple.

La ricerca dei messaggi locali è insensibile alle maiuscole e al testo parziale. Il testo del messaggio dei messaggi locali non sarà ricercato se questo non è ancora stato scaricato. La ricerca sul server potrebbe essere o no insensibile alle maiuscole e potrebbe essere su testo parziale o parole intere, in base al provider.

Alcuni server non possono gestire la ricerca nel testo del messaggio quando c'è un numero grande di messaggi. In questo caso esiste un'opzione per disabilitare la ricerca nel testo del messaggio.

Gli operatori di ricerca di Gmail sono utilizzabili prefissando un comando di ricerca con *raw:*. Se hai configurato solo un profilo di Gmail, puoi avviare una ricerca grezza direttamente sul server ricercando dalla casella di posta in entrata unificata. Se hai configurato più profili di Gmail, dovrai prima navigare all'elenco di cartelle o la cartella dell'archivio (tutti i messaggi) del profilo Gmail in cui vuoi cercare. Sei pregato di [vedere qui](https://support.google.com/mail/answer/7190) per gli operatori di ricerca possibili. Per esempio:

`
raw:larger:10M`

Cercare in un gran numero di messaggi sul dispositivo non è molto veloce per due limitazioni:

* [sqlite](https://www.sqlite.org/), il motore del database di Android ha un limite di dimensione del registro, prevenendo che i testi del messaggio siano memorizzati nel database
* Le app di Android hanno memoria limitata per funzionare, anche se il dispositivo ha molta memoria disponibile

Questo significa che cercare il testo di un messaggio richiede che i file contenenti i testi del messaggio devono essere aperti uno per uno per controllare se il testo cercato è contenuto nel file, che è un processo relativamente costoso.

Nelle *impostazioni miste* puoi abilitare *Costruisci indice di ricerca* per aumentare significativamente la velocità di ricerca sul dispositivo, ma sappi che questo aumenterà l'uso della batteria e dello spazio di archiviazione. L'indice di ricerca si basa sulle parole, quindi cercare il testo parziale è impossibile. Ricercare usando l'indice di ricerca è di default E, quindi cercare *mela arancia* cercherà mela E arancia. Le parole separate da virgole risulteranno in ricerche per O, quindi per esempio *mela, arancia* cercherà mela O arancia. Entrambi sono combinabili, quindi cercare *mela, arancia banana* cercherà mela O (arancia E banana). Usare l'indice di ricerca è una funzionalità pro.

Dalla versione 1.1315 è possibile usare le espressioni di ricerca come questa:

```
mela +banana -ciliegia ?noci
```

Questo risulterà nel cercare come in questo modo:

```
("mela" E "banana" E NON "ciliegia") O "noci"
```

Le espressioni di ricerca sono utilizzabili per ricercare sul dispositivo tramite l'indice di ricerca e per cercare sul server dell'email, ma non per cercare sul dispositivo senza l'indice di ricerca per motivi di prestazioni.

Cercare sul dispositivo è una funzionalità gratuita, usando l'indice di ricerca e cercare sul server è una funzionalità pro.

<br />

<a name="faq14"></a>
**(14) Come posso configurare un profilo di Outlook / Live / Hotmail?**

Un profilo Outlook / Live / Hotmail può essere configurato tramite la procedura guidata rapida e selezionando *Outlook*.

Per usare un profilo di Outlook, Live o Hotmail con l'autenticazione a due fattori abilitata, devi creare una password dell'app. Vedi [qui](https://support.microsoft.com/en-us/help/12409/microsoft-account-app-passwords-two-step-verification) per i dettagli.

Vedi [qui](https://support.office.com/en-us/article/pop-imap-and-smtp-settings-for-outlook-com-d088b986-291d-42b8-9564-9c414e2aa040) per le istruzioni di Microsoft.

Per configurare un profilo di Office 365, sei pregato di vedere [questa FAQ](#user-content-faq156).

<br />

<a name="faq15"></a>
**(15) Perché il testo del messaggio continua a caricare?**

L'intestazione e il corpo del messaggio sono recuperati separatamente dal server. Il testo del messaggio di messaggi più grandi non è pre-recuperato su connessioni misurate e sarà recuperato su domanda all'espansione di un messaggio. Il testo del messaggio continuerà a caricare se non c'è alcuna connessione al profilo, vedi anche la prossima domanda, o se ci sono altre operazioni, come la sincronizzazione dei messaggi, sono eseguite.

Puoi controllare il profilo e l'elenco delle cartelle per il profilo e lo stato della cartella (vedi la legenda per il significato delle icone) e l'elenco delle operazioni accessibile tramite il menu di navigazione principale per le operazioni in attesa (vedi [questa FAQ](#user-content-faq3) per il significato delle operazioni).

Se FairEmail si sta bloccando per problemi di connettività precedenti, sei pregato di vedere [questa FAQ](#user-content-faq123), puoi forzare la sincronizzazione tramite il menu a tre puntini.

Nelle impostazioni di ricezione puoi impostare la dimensione massima per scaricare automaticamente i messaggi su connessioni misurate.

Le connessioni mobili sono quasi sempre misurate e alcuni hotspot Wi-Fi (pagati) anche.

<br />

<a name="faq16"></a>
**(16) Perché i messaggi non sono sincronizzati?**

Cause possibili di messaggi non sincronizzati (inviati o ricevuti) sono:

* Il profilo o le cartelle non sono impostate per la sincronizzazione
* Il numero di giorni per sincronizzare i messaggi è impostato troppo basso
* Non c'è alcuna connessione internet utilizzabile
* Il server email è temporaneamente non disponibile
* Android ha interrotto il servizio di sincronizzazione

Quindi, controlla le impostazioni del tuo profilo e della cartella e controlla se i profili/le cartelle sono connesse (vedi la leggenda nel menu di navigazione per il significato delle icone).

Se ci sono messaggi di errore, sei pregato di vedere [questa FAQ](#user-content-faq22).

Su alcuni dispositivi, dove ci sono molte applicazioni che competono per la memoria, Android potrebbe interrompere il servizio di sincronizzazione come ultima risorsa.

Alcune versioni di Android interrompono le app e i servizi troppo aggressivamente. Vedi [questo sito web dedicato](https://dontkillmyapp.com/) e [questo problema Android](https://issuetracker.google.com/issues/122098785) per ulteriori informazioni.

Disabilitare le ottimizzazioni della batteria (passaggio 4 di configurazione) riduce la possibilità che Android interromperà il servizio di sincronizzazione.

In caso di errori di connessione consecutivi, FairEmail manterrà sempre di più per non drenare la batteria del tuo dispositivo. Questo è descritto in [questa FAQ](#user-content-faq123).

<br />

<a name="faq17"></a>
**~~(17) Perché la sincronizzazione manuale non funziona?~~**

~~Se il menu *Sincronizza ora* è attenuata, non esiste alcuna connessione al profilo.~~

~~Vedi la domanda precedente per ulteriori informazioni.~~

<br />

<a name="faq18"></a>
**(18) Perché l'anteprima del messaggio non è sempre mostrata?**

L'anteprima del testo del messaggio non è mostrabile se il corpo del messaggio non è ancora stato scaricato. Vedi anche [questa FAQ](#user-content-faq15).

<br />

<a name="faq19"></a>
**(19) Perché le funzionalità pro sono così costose?**

La domanda giusta è "*perché ci sono così tante tasse e commissioni?*":

* IVA: 25% (in base al tuo paese)
* Commissione di Google: 30 %
* Tassa sul reddito: 50 %
* <sub>Commissione di Paypal: 5-10 % in base al paese/importo</sub>

Quindi, cosa rimane per lo sviluppatore è solo una frazione di ciò che paghi.

Nota che solo alcune funzionalità di convenienza e avanzate devono essere acquistate il che significa che FairEmail è fondamentalmente libero all'uso.

Nota anche che gran parte delle app gratuite compariranno come non sostenibili alla fine, mentre FairEmail è propriamente mantenuto e supportato, e che le app gratuite potrebbero avere una cattura, come inviare informazioni sensibili alla privacy su internet.

Ho lavorato a FairEmail quasi ogni giorno per oltre due anni, quindi penso che il prezzo sia più che ragionevole. Per questo motivo non ci saranno nemmeno sconti.

<br />

<a name="faq20"></a>
**(20) Posso ottenere un rimborso?**

Se una funzionalità pro acquistata non funziona come intesa e non è causata da un problema nelle funzionalità gratuite e non posso risolvere il problema tempestivamente, puoi ottenere un rimborso. In tutti gli altri casi non è possibile alcun rimborso. In nessuna circostanza c'è la possibilità di rimborso per alcun problema correlato alle funzionalità gratuite, non essendo stato pagato nulla per essi e perché sono valutabili senza alcuna limitazione. Mi assumo la mia responsabilità come venditore per consegnare quanto promesso e prevedo di prendere la responsabilità per avervi informati su ciò che state acquistando.

<a name="faq21"></a>
**(21) Come abilito il Led di notifica?**

Prima di Android 8 Oreo: esiste un'opzione avanzata nella configurazione per questo.

Android 8 Oreo e successive: vedi [qui](https://developer.android.com/training/notify-user/channels) come configurare i canali di notifica. Puoi usare il pulsante *Gestione notifiche* nella configurazione per andare direttamente alle impostazioni di notifica di Android. Nota che le app non possono modificare le impostazioni di notifica, inclusa l'impostazione del Led di notifica, su Android 8 Oreo e successive. Le app progettate e mirate a versioni più vecchie di Android potrebbero essere capaci di controllare i contenuti delle notifiche, ma tali app non possono essere più aggiornate e quelle recenti mostreranno un avviso che tali app sono obsolete.

A volte serve disabilitare l'impostazione *Mostra anteprima di messaggio nelle notifiche* o per abilitare le impostazioni *Mostra solo le notifiche con un testo di anteprima* per risolvere un bug in Android. Questo potrebbe applicarsi anche ai suoni di notifica e le vibrazioni.

L'impostazione di un colore chiaro prima di Android 8 non è supportato e impossibile su Android 8 e successive.

<br />

<a name="faq22"></a>
**(22) Cosa significa l'errore profilo/cartella ...?**

FairEmail non nasconde gli errori come le app simili fanno spesso, quindi è più facile diagnosticare i problemi.

FairEmail proverà automaticamente a connettersi di nuovo dopo un ritardo. Questo ritardo sarà raddoppiato dopo ogni tentativo fallito di prevenire il drenaggio della batteria e prevenire che si blocchi permanentemente.

Ci sono errori generali e specifici ai profili Gmail (vedi sotto).

**Errori generali**

L'errore *... Autenticazione fallita ...* o *... AUTHENTICATE fallita ...* potrebbe significare che il tuo nome utente o password fossero scorretti. Alcuni provider prevedono come nome utente solo *il nome utente* e altri il tuo indirizzo email completo *username@example.com*. Quando copi/incolli per inserire un nome utente o una password, i caratteri invisibili potrebbero essere copiati, il che potrebbe anche causare questo problema. Alcuni manager di password sono anche noti per farlo erroneamente. Il nome utente potrebbe essere sensibile alle maiuscole, quindi prova con soli caratteri minuscoli. La password è quasi sempre sensibile alle maiuscole. Alcuni provider richiedono l'uso di una password dell'app invece della password del profilo, quindi sei pregato di controllare la documentazione del provider. A volte è necessario per abilitare l'accesso esterno (IMAP/SMTP) sul sito web del provider per primo. Altre possibili cause sono che il profilo sia bloccato o che l'accesso sia stato limitato amministrativamente in qualche modo, per esempio consentendo di accedere solo da certe reti / indirizzi IP.

L'errore *... Troppi tentativi errati di autenticazione ...* potrebbero significare che tu stia usando una password del profilo di Yahoo invece di una password dell'app. Sei pregato di vedere [questa FAQ](#user-content-faq88) su come configurare un profilo di Yahoo.

Il messaggio *... +OK ...* potrebbe significare che una porta POP3 (solitamente la porta numero 995) sia usata per un profilo IMAP (solitamente la porta numero 993).

Gli errori *... non validi ...*, *... richiede indirizzo valido ...* e *... Il parametro di HELO non è conforme alla sintassi RFC ...* potrebbe essere risolto cambiando l'impostazione dell'identità avanzata *Usa l'indirizzo IP locale invece del nome dell'host*.

L'errore *... Impossibile connettersi all'host ...* significa che non c'è stata alcuna risposta dal server email entro un tempo ragionevole (20 secondi di default). Principalmente indica problemi di connettività a internet, possibilmente causati da una VPN o da un'app del firewall. Puoi provare ad aumentare il timeout di connessione nelle impostazioni di connessione di FairEmail, per quando il server dell'email è molto lento.

L'errore *... Connessione rifiutata ...* significa che il server email o qualcosa tra esso e l'app, come un firewall, ha rifiutato attivamente la connessione.

L'errore *... Rete irraggiungibile ...* significa che il server dell'email era irraggiungibile tramite la connessione internet corrente, ad esempio perché il traffico di internet è limitato solo al traffico locale.

L'errore *... L'host è irrisolto ...*, *... Impossibile risolvere l'host ...* o *... Nessun indirizzo associato all'hostname ...* significa che l'indirizzo del server dell'email non è stato risolto in un indirizzo IP. Questo potrebbe essere causato da una VPN, blocco annunci o un server [DNS](https://en.wikipedia.org/wiki/Domain_Name_System) (locale) irraggiungibile o non funzionante propriamente.

L'errore *... Il software ha causato l'annullamento ...* significa che il server email o qualcosa tra esso e FairEmail ha terminato la connessione esistente. Questo può verificarsi ad esempio alla perdita brusca di connettività. Un esempio tipico è l'attivazione della modalità aereo.

Gli errori *... BYE Logging out ...*, *... Connection reset by peer ...* mean that the email server actively terminated an existing connection.

L'errore *... Connection closed by peer ...* might be caused by a not updated Exchange server, see [here](https://blogs.technet.microsoft.com/pki/2010/09/30/sha2-and-windows/) for more information.

Gli errori *... Errore di lettura ...*, *... Errore di scrittura ...*, *... Lettura scaduta ...*, *... Broken pipe ...* mean that the email server is not responding anymore or that the internet connection is bad.

L'errore *... Unexpected end of zlib input stream ...* means that not all data was received, possibly due to a bad or interrupted connection.

L'errore *... connessione fallita ...* potrebbe indicare [Troppe connessioni simultanee](#user-content-faq23).

L'avviso *... Crittografia non supportata ...* significa che i caratteri del messaggio sono sconosciuti o non supportati. FairEmail presumerà ISO-8859-1 (Latin1), che in gran parte dei casi risulterà nella visualizzazione corretta del messaggio.

Sei pregato di [vedere qui](#user-content-faq4) per gli errori *... Inaffidabile ... non nel certificato ...*, *... Certificato di sicurezza non valido (Impossibile verificare l'identità del server) ...* o *... Ancoraggio di fiducia per il percorso del certificato non trovato ...*

Sei pregato di [vedere qui](#user-content-faq127) per l'errore *... Argomenti HELO sintatticamente non validi ...*.

Sei pregato di [vedere qui](#user-content-faq41) per l'errore *... Handshake failed ...*.

Vedi [qui](https://linux.die.net/man/3/connect) per cosa significano codici di errore come EHOSTUNREACH e ETIMEDOUT.

Possibili cause sono:

* Un firewall o router sta bloccando le connessioni al server
* Il nome dell'host o numero di porta non è valido
* Ci sono problemi con la connessione a internet
* Ci sono problemi con la risoluzione dei nomi di dominio (Yandex: prova a disabilitare il DNS privato nelle impostazioni di Android)
* Il server email si rifiuta di accettare le connessioni (esterne)
* Il server dell'email rifiuta di accettare un messaggio, ad esempio perché troppo grande o contenente collegamenti inaccettabili
* Ci sono troppe connessioni al server, vedi anche la prossima domanda

Molte reti Wi-Fi pubbliche bloccano l'email in uscita per prevenire lo spam. A volte puoi risolverlo usando un'altra porta SMTP. Vedi la documentazione del provider per i numeri di porta inutilizzabili.

Se stai usando una [VPN](https://en.wikipedia.org/wiki/Virtual_private_network), il provider del VPN potrebbe bloccare la connessione perché sta provando troppo aggressivamente a prevenire lo spam. Nota anche che [Google Fi](https://fi.google.com/) sta usando una VPN.

**Errori di invio**

I server SMTP possono rifiutare i messaggi per [diversi motivi](https://en.wikipedia.org/wiki/List_of_SMTP_server_return_codes). I messaggi troppo grandi e l'innesco del filtro dello spam di un server email sono le motivazioni più comuni.

* Il limite della dimensione dell'allegato per Gmail [è 25 MB](https://support.google.com/mail/answer/6584)
* Il limite delle dimensioni dell'allegato per Outlook e Office 365 [è 20 MB](https://support.microsoft.com/en-us/help/2813269/attachment-size-exceeds-the-allowable-limit-error-when-you-add-a-large)
* Il limite della dimensione dell'allegato per Yahoo [è 25 MB](https://help.yahoo.com/kb/SLN5673.html)
* *554 5.7.1 Servizio non disponibile; Host del client xxx.xxx.xxx.xxx bloccato*, sei pregato [di vedere qui](https://docs.gandi.net/en/gandimail/faq/error_types/554_5_7_1_service_unavailable.html)
* *501 Errore di sintassi – linea troppo lunga* è spesso causata dall'utilizzo di una lunga intestazione Autocrypt
* *503 5.5.0 Destinatario già specificato* significa principalmente che un indirizzo è in uso sia come indirizzo TO che CC
* *554 5.7.1 ... non è consentito trasmettere* significa che il server di posta elettronica non riconosce il nome utente/indirizzo email. Si prega di controllare il nome host e il nome utente/indirizzo email nelle impostazioni di identità.
* *550 Messaggio di spam rifiutato perché l'IP è elencato per ...* significa che il server dell'email ha rifiutato di inviare un messaggio dall'indirizzo di rete attuale (pubblico) perché usato erroneamente per inviare spam da qualcun altro (si spera) in precedenza. Sei pregato di provare ad abilitare la modalità aereo per 10 minuti per acquisire un nuovo indirizzo di rete.
* *571 5.7.1 Il messaggio contiene spam o virus o il mittente è bloccato ...* significa che il server dell'email ha considerato un messaggio come spam. Questo significa probabilmente che i filtri spam del server email sono troppo rigidi. Dovrai contattare il provider di posta elettronica per avere supporto a riguardo.

Se vuoi usare il server SMTP di Gmail per risolvere un filtro anti-spam in uscita troppo severo o per migliorare la consegna dei messaggi:

* Verifica il tuo indirizzo email [qui](https://mail.google.com/mail/u/0/#settings/accounts) (dovrai usare un browser desktop)
* Cambia le impostazioni di identità come queste (configurazione, fase 2, tocca Gestisci, tocca identità):

&emsp;&emsp;Nome utente: *il tuo indirizzo Gmail*<br /> &emsp;&emsp;Password: *[la password di un'app](#user-content-faq6)*<br /> &emsp;&emsp;Host: *smtp.gmail.com*<br /> &emsp;&emsp;Porta: *465*<br /> &emsp;&emsp;Crittografia: *SSL/TLS*<br /> &emsp;&emsp;Risposta all'indirizzo: *il tuo indirizzo email* (impostazioni avanzate di identità)<br />

<br />

**Errori di Gmail**

L'autorizzazione della configurazione dei profili di Gmail con la procedura guidata rapida deve essere aggiornata periodicamente tramite il [Manager dei profili di Android](https://developer.android.com/reference/android/accounts/AccountManager). Questo richiede permessi di contatto/profilo e connettività a internet.

L'errore *... Autenticazione fallita ... Profilo non trovato ...* significa che un profilo di Gmail autorizzato precedentemente è stato rimosso dal dispositivo.

Gli errori *... Autenticazione fallita ... Nessun token ...* significa che il manager del profilo di Android non è riuscito a ricaricare l'autorizzazione di un profilo di Gmail.

L'errore *... Autenticazione fallita ... errore di rete ...* significa che il manager del profilo di Android non è riuscito a ricaricare l'autorizzazione di un profilo di Gmail a causa di problemi con la connessione a internet

L'errore *... Autenticazione fallita ... Credenziali non valide ...* potrebbe esser causato dalla modifica della password del profilo o dall'aver revocato i permessi necessari del profilo/contatti. Nel caso in cui la password del profilo sia stata cambiata, dovrai autenticare di nuovo il profilo di Google nelle impostazioni del profilo di Android. Nel caso in cui i permessi fossero revocati, puoi avviare la procedura guidata rapida di Gmail per garantire di nuovo i permessi necessari (non devi riconfigurare il profilo).

L'errore *... ServiceDisabled ...* potrebbe essere causato dall'iscrizione nel [Programma di Protezione Avanzata](https://landing.google.com/advancedprotection/): "<em x-id"3">Per leggere la tua email, puoi (devi) usare Gmail - Non potrai usare il tuo Profilo di Google con alcune app (tutte) e servizi che richiedono l'accesso a dati sensibili come le tue email</em>", vedi [qui](https://support.google.com/accounts/answer/7519408?hl=en&ref_topic=9264881).

Quando in dubbio, puoi richiedere [supporto](#user-content-support).

<br />

<a name="faq23"></a>
**(23) Perché ottengo l'avviso ... ?**

*Generale*

Gli avvisi sono messaggi di avviso inviati dai server dell'email.

*Troppe connessioni simultanee* o *Numero massimo di connessioni superate*

Questo avviso sarà inviato quando ci sono troppe connessioni di cartelle per lo stesso profilo email allo stesso tempo.

Cause possibili sono:

* Ci sono client email multipli connessi allo stesso profilo
* Lo stesso client email è connesso diverse volte allo stesso profilo
* Le connessioni precedenti sono state terminate bruscamente per esempio perdendo bruscamente la connettività internet

Prima prova ad attendere un po' di tempo per vedere se il problema si risolve da solo, altrimenti:

* o passa alla verifica periodica dei messaggi nelle impostazioni di ricezione, che risulterà nell'apertura delle cartelle una per volta
* o imposta alcune cartelle a sondaggio invece di sincronizzare (tenere premuto a lungo la cartella nell'elenco della cartella, modificare le proprietà)

Un modo facile per configurare periodicamente la verifica dei messaggi per tutte le cartelle tranne quella della posta in arrivo è usare *Applica a tutti ...* nel menu a tre puntini dell'elenco delle cartelle per spuntare le due caselle avanzate in fondo.

Il numero massimo di connessioni delle cartelle simultanee per Gmail è 15, quindi puoi sincronizzare massimo 15 cartelle in simultanea su *tutti* i tuoi dispositivi allo stesso tempo. Per questo motivo le cartelle dell'*utente* di Gmail sono impostate per sondare di default invece che sincronizzare sempre. Quando necessario o desiderato, puoi cambiarlo premendo a lungo una cartella nell'elenco delle cartelle e selezionando *Modifica proprietà*. Vedi [qui](https://support.google.com/mail/answer/7126229) per i dettagli.

Quando usi un server Dovecot, potresti voler cambiare l'impostazione [mail_max_userip_connections](https://doc.dovecot.org/settings/dovecot_core_settings/#mail-max-userip-connections).

Nota che ci vorrà un po' perché il server dell'email scopra le connessioni rotte, ad esempio per l'uscita dal raggio di una rete, il che significa che efficientemente solo metà delle connessioni della cartella sono disponibili. Per Gmail queste saranno solo 7 connessioni.

<br />

<a name="faq24"></a>
**(24) Cosa sono i messaggi di navigazione sul server?**

Sfogliare i messaggi sul server li recupererà dal server dell'email in tempo reale al raggiungimento della fine dell'elenco dei messaggi sincronizzati, anche quando la cartella è impostata per non sincronizzare. Puoi disabilitare questa funzionalità nelle impostazioni del profilo avanzate.

<br />

<a name="faq25"></a>
**(25) Perché non posso selezionare/aprire/salvare un'immagine, allegato o file?**

Quando l'elemento di un menu per selezionare/aprire/salvare un file è disabilitato (attenuato) o quando ottieni il messaggio *Framework di accesso all'archiviazione non disponibile*, il [framework di accesso all'archiviazione](https://developer.android.com/guide/topics/providers/document-provider), un componente Android standard, è probabilmente non presente. Questo potrebbe dipendere dalla tua ROM personalizzata non lo include o perché è stata rimossa attivamente (sgonfiato).

FairEmail non richiede i permessi di archiviazione, quindi questo framework è necessario ai file e le cartelle selezionati. Nessun'app, eccetto forse i manager di file, indirizzati ad Android 4.4 KitKat o successivo dovrebbe chiedere i permessi di archiviazione perché consentirebbe l'accesso a *tutti* i file.

Il framework di accesso all'archiviazione è fornito dal pacchetto *com.android.documentsui*, visibile come app *File* su alcune versioni di Android (notevole OxygenOS).

Puoi abilitare (di nuovo) il framework di accesso all'archiviazione con questo comando adb:

```
pm install -k --user 0 com.android.documentsui
```

In alternativa, potresti riabilitare l'app *File* usando le impostazioni dell'app di Android.

<br />

<a name="faq26"></a>
**(26) Posso aiutare a tradurre FairEmail nella mia lingua?**

Sì, puoi tradurre i testi di FairEmail nella tua lingua [su Crowdin](https://crowdin.com/project/open-source-email). La registrazione è gratuita.

Se vorresti che il tuo nome o alias fosse incluso nell'elenco dei collaboratori in *Info* nell'app, sei pregato di [contattarmi](https://contact.faircode.eu/?product=fairemailsupport).

<br />

<a name="faq27"></a>
**(27) Come posso distinguere tra immagini incorporate ed esterne?**

Immagine esterna:

![Immagine esterna](https://github.com/M66B/FairEmail/blob/master/images/baseline_image_black_48dp.png)

Immagine incorporata:

![Immagine incorporata](https://github.com/M66B/FairEmail/blob/master/images/baseline_photo_library_black_48dp.png)

Immagine danneggiata:

![Immagine danneggiata](https://github.com/M66B/FairEmail/blob/master/images/baseline_broken_image_black_48dp.png)

Nota che lo scaricamento di immagini esterne da un server remoto è utilizzabile per registrare di aver visto un messaggio, cosa che probabilmente non faresti se questo fosse spam o malevolo.

<br />

<a name="faq28"></a>
**(28) Come posso gestire le notifiche della barra di stato?**

Nella configurazione troverai il pulsante *Gestione notifiche* per navigare direttamente alle impostazioni di notifica di Android per FairEmail.

Su Android 8.0 Oreo e successive puoi gestire le proprietà dei canali di notifica individuali, ad esempio per configurare un suono di notifica specifico o mostrare le notifiche sul blocco schermo.

FairEmail ha i seguenti canali di notifica:

* Servizio: usato per la notifica del servizio di sincronizzazione, vedi anche [questa FAQ](#user-content-faq2)
* Invio: usato per le notifiche del servizio di invio
* Notifiche: usato per le notifiche dei nuovi messaggi
* Avviso: usato per le notifiche di avviso
* Errore: usato per le notifiche di errore

Vedi [qui](https://developer.android.com/guide/topics/ui/notifiers/notifications#ManageChannels) per i dettagli sui canali di notifica. In breve: tocca sul nome del canale di notifica per accedere alle impostazioni del canale.

Su Android prima di Android 8 Oreo puoi impostare il suono di notifica nelle impostazioni.

Vedi [questa FAQ](#user-content-faq21) se il tuo dispositivo ha un LED di notifica.

<br />

<a name="faq29"></a>
**(29) Come posso ottenere le notifiche dei messaggi nuovi per le altre cartelle?**

Basta premere a lungo su una cartella, selezionare *Modifica proprietà*, e abilitare *Mostra nella cartella di posta in entrata unificata* o *Notifica nuovi messaggi* (disponibile solo su Android 7 Nougat e successive) e tocca *Salva*.

<br />

<a name="faq30"></a>
**(30) Come posso usare le impostazioni rapide fornite?**

Ci sono impostazioni rapide (impostazione tile) disponibili per:

* abilitare/disabilitare globalmente la sincronizzazione
* mostrare il numero di nuovi messaggi e contrassegnarli come visti (non letti)

Le impostazioni rapide richiedono Android 7.0 Nougat o successive. L'uso delle tile delle impostazioni è spiegato [qui](https://support.google.com/android/answer/9083864).

<br />

<a name="faq31"></a>
**(31) Come posso usare le scorciatoie fornite?**

Esistono scorciatoie disponibili per:

* comporre un nuovo messaggio a un contatto preferito
* configura profili, identità, etc

Le scorciatoie richiedono Android 7.1 Nougat o successive. L'uso di scorciatoie è spiegato [qui](https://support.google.com/android/answer/2781850).

<br />

<a name="faq32"></a>
**(32) Come posso controllare se la lettura dell'email sia davvero sicura?**

Puoi usare il [Tester della Privacy dell'Email](https://www.emailprivacytester.com/) per questo.

<br />

<a name="faq33"></a>
**(33) Perché gli indirizzi del mittente modificati non funzionano?**

Gran parte dei provider accettano indirizzi convalidati solo inviando messaggi per prevenire lo spam.

Per esempio Google modifica le intestazioni del messaggio come questo per gli indirizzi *non verificati*:

```
Da: Qualcuno <somebody@example.org>
X-Google-Original-From: Qualcuno <somebody+extra@example.org>
```

Questo significa che l'indirizzo del mittente modificato è stato sostituito automaticamente da un indirizzo verificato prima di inviare il messaggio.

Nota che questo è indipendente dalla ricezione di messaggi.

<br />

<a name="faq34"></a>
**(34) Come sono abbinate le identità?**

Le identità sono come previsto abbinate dal profilo. Per i messaggi in arrivo gli indirizzi *a*, *cc*, *bcc*, *da* e *(X-)delivered/envelope/original-to* saranno controllati (in quest'ordine) e per i messaggi in uscita (bozze, in uscita e inviate) solo gli indirizzi *da* saranno controllati. Gli indirizzi uguali hanno la precedenza su quelli parzialmente corrispondenti, eccetto per gli indirizzi *delivered-to*.

L'indirizzo abbinato sarà mostrato come *tramite* nella sezione degli indirizzi dei messaggi ricevuti (tra l'intestazione e il testo del messaggio).

Nota che le identità devono essere abilitate per poter essere abbinate e che le identità di altri profili non saranno considerate.

L'abbinamento sarà fatto solo una volta alla ricezione di un messaggio, quindi cambiare la configurazione non cambierà i messaggi esistenti. Però, potresti cancellare i messaggi locali tenendo premuta a lungo una cartella nell'elenco delle cartelle e risincronizzarli.

È possibile configurare un [regex](https://en.wikipedia.org/wiki/Regular_expression) nelle impostazioni d'identità per abbinare **il nome utente** di un indirizzo email (la parte prima della firma @).

Nota che il nome di dominio (le parti dopo la firma @) necessita sempre di essere uguale al nome di dominio dell'identità.

Se vuoi abbinare un indirizzo email tutto sommato, questo regex è principalmente buono:

```
.*
```

Se vuoi abbinare gli indirizzi email a scopo speciale abc@example.com e xyz@example.com e vorresti avere anche l'indirizzo email di ripiego main@example.com, potresti fare qualcosa come:

* Identità: abc@example.com; regex: **(?i)abc**
* Identità: xyz@example.com; regex: **(?i)xyz**
* Identità: main@example.com; regex: **^(?i)((?!abc|xyz).)\*$**

Le identità abbinate sono utilizzabili per colorare i messaggi del codice. Il colore dell'identità prende la precedenza sul colore secondario. Impostare i colori di identità è una funzionalità pro.

<br />

<a name="faq35"></a>
**(35) Perché dovrei stare attento alla visualizzazione di immagini, allegati, messaggio originale e ad aprire collegamenti?**

Visualizzare le immagini archiviate remotamente (vedi anche [questa FAQ](#user-content-faq27)) e aprire collegamenti potrebbe non solo dire al mittente che hai visto il messaggio, ma potrebbe anche far rilevare il tuo indirizzo IP. Vedi anche questa domanda: [Perché il collegamento dell'email è più pericoloso del collegamento di ricerca web?](https://security.stackexchange.com/questions/241139/why-emails-link-is-more-dangerous-than-web-searchs-link).

Aprire allegati o visualizzare un messaggio originale potrebbe caricare contenuti remoti ed eseguire script, che potrebbero non solo causare la rilevazione di informazioni sulla privacy sensibili, ma anche un rischio di sicurezza.

Nota che i tuoi contatti potrebbero inconsapevolmente inviare messaggi malevoli se infettati da malware.

FairEmail riformatta i messaggi rendendoli diversi dall'originale, ma scoprendo anche i collegamenti di phishing.

Nota che i messaggi riformattati sono spesso più leggibili di quelli originali perché i margini sono rimossi e i colori del font e le dimensioni sono standardizzati.

L'app di Gmail mostra le immagini di default scaricandole tramite un server proxy di Google. Poiché le immagini sono scaricate dal server sorgente [in tempo reale](https://blog.filippo.io/how-the-new-gmail-image-proxy-works-and-what-this-means-for-you/), è anche meno sicuro perché Google è anche coinvolto senza fornire maggiori benefici.

Puoi visualizzare immagini e messaggi originali di default per i mittenti fidati su base di un caso, spuntando *Non chiedere di nuovo per ...*.

Se vuoi ripristinare le app predefinite di *Apri con*, sei pregato di [vedere qui](https://www.androidauthority.com/how-to-set-default-apps-android-clear-621269/).

<br />

<a name="faq36"></a>
**(36) Come sono crittografati i file di impostazioni?**

Versione breve: AES 256 bit

Versione lunga:

* La chiave a 256 bit è generata con *PBKDF2WithHmacSHA1* usando un sale casuale sicuro a 128 bit e 65536 iterazioni
* La cifra è *AES/CBC/PKCS5Padding*

<br />

<a name="faq37"></a>
**(37) Come sono archiviate le password?**

Tutte le versioni supportate di Android [crittografano tutti i dati dell'utente](https://source.android.com/security/encryption), quindi tutti i dati, inclusi nomi utenti, password, messaggi, etc. sono archiviati crittografati.

Se il dispositivo è in sicurezza con un PIN, uno schema o una password, puoi rendere visibili le password del profilo e dell'identità. Se questo è un problema perché stai condividendo il dispositivo con altre persone, considera di usare i [profili utente](https://www.howtogeek.com/333484/how-to-set-up-multiple-user-profiles-on-android/).

<br />

<a name="faq39"></a>
**(39) Come posso ridurre l'uso della batteria di FairEmail?**

Le versioni Android recenti di default segnalano l'*uso dell'app* come una percentuale nella schermata delle impostazioni della batteria di Android. **In modo confusionario, *l'uso dell'app* non equivale all'*uso della batteria* e non è nemmeno correlato direttamente all'uso della batteria!** L'uso dell'app (mentre in uso) sarà molto alto perché FairEmail sta usando il servizio in primo piano, considerato come l'uso costante dell'app di Android. Tuttavia, questo non significa che FairEmail stia usando costantemente l'energia della batteria. Il vero uso della batteria è visibile navigando a questa schermata:

*Impostazioni di Android*, *Batteria*, menu a tre puntini *Uso della batteria*, menu a tre puntini*Mostra usi completi del dispositivo*

Come regola generale, l'uso della batteria dovrebbe essere inferiore o in ogni caso non molto maggiore dello *Standby della rete mobile*. Se non è il caso, sei pregato di attivare *Ottimizzazione automatica* nelle impostazioni di ricezione. Se questo non aiuta, sei pregato di [chiedere supporto](https://contact.faircode.eu/?product=fairemailsupport).

È inevitabile che la sincronizzazione dei messaggi userà energia della batteria perché richiede accesso alla rete e l'accesso al database dei messaggi.

Se stai comparando l'uso della batteria di FairEmail con un altro client email, sei pregato di assicurarti che l'altro client email sia configurato similmente. Per esempio, comparare la sincronizzazione continua (messaggi push) e il controllo periodico (raro) per i nuovi messaggi non è un confronto equo.

La riconnessione al server email userà energia extra della batteria, quindi una connessione internet instabile risulterà in uso extra della batteria. Inoltre, alcuni server email terminano prematuramente le connessioni inattive, mentre [lo standard](https://tools.ietf.org/html/rfc2177) dice che una connessione inattiva dovrebbe essere mantenuta aperta per 29 minuti. In questi casi potresti voler sincronizzare periodicamente, ad esempio ogni ora, invece che continuamente. Nota che sondare frequentemente (più di ogni 30-60 minuti) potrebbe usare maggiore energia della batteria rispetto alla sincronizzazione continua perché la connessione al server e il confronto di messaggi locali e remoti sono operazioni costose.

[Su alcuni dispositivi](https://dontkillmyapp.com/) è necessario *disabilitare* le ottimizzazioni della batteria (configurazione, passaggio 4) per mantenere le connessioni ai server email aperti. Difatti, lasciare abilitate le ottimizzazioni della batteria può risultare nell'uso extra di batteria per tutti i dispositivi, per quanto sembri contraddittorio!

Gran parte dell'uso della batteria, senza considerare la visualizzazione dei messaggi, è dovuto alla sincronizzazione dei messaggi (ricezione e invio). Quindi, per ridurre l'uso della batteria, imposta il numero di giorni per sincronizzare i messaggi a un valore inferiore, specialmente se ci sono molti messaggi recenti in una cartella. Premi a lungo il nome di una cartella nell'elenco delle cartelle e seleziona *Modifica proprietà* per accedere a quest'impostazione.

Se hai connettività a internet almeno una volta al giorno, è sufficiente sincronizzare i messaggi solo per un giorno.

Nota che puoi impostare il numero di giorni per *mantenere* i messaggi per un numero maggiore piuttosto che per *sincronizzarne* i messaggi. Potresti ad esempio sincronizzare inizialmente i messaggi per un gran numero di giorni e dopo il completamento di ciò ridurre il numero di giorni in cui sincronizzare i messaggi, lasciando il numero di giorni per cui mantenerli. Dopo aver diminuito il numero di giorni per cui mantenere i messaggi, potresti voler eseguire la pulizia nelle impostazioni miste per rimuovere i vecchi file.

Nelle impostazioni di ricezione puoi abilitare la sincronizzazione continua dei messaggi preferiti, che consentirà di mantenere messaggi più vecchi in giro sincronizzandoli per un numero limitato di giorni.

Disabilitare l'opzione della cartella *Scarica automaticamente testi e allegati del messaggio* risulterà in minore traffico di rete e dunque minore uso della batteria. Potresti disabilitare quest'opzione per esempio per la cartella degli inviati e l'archivio.

Sincronizzare i messaggi di notte è principalmente inutile, quindi puoi risparmiare sull'uso della batteria non sincronizzando di notte. Nelle impostazioni puoi selezionare un piano per la sincronizzazione del messaggio (questa è una funzionalità pro).

FairEmail sincronizzerà di default l'elenco delle cartelle su ogni connessione. Poiché le cartelle sono per lo più create, rinominate ed eliminate molto spesso, puoi risparmiare uso della rete e della batteria disabilitandolo nelle impostazioni di ricezione.

FairEmail verificherà di default se i vecchi messaggi sono stati eliminati dal server su ogni connessione. Se non ti dispiace che i vecchi messaggi eliminati dal server siano ancora visibili in FairEmail, puoi risparmiare uso di batteria e rete disabilitandolo nelle impostazioni di ricezione.

Alcuni provider non seguono lo standard IMAP e non mantengono le connessioni aperte abbastanza a lungo, forzando spesso la riconnessione di FairEmail, causando uso extra della batteria. Puoi ispezionare il *Registro* tramite il menu di navigazione principale per verificare se ci sono riconnessioni frequenti (connessione chiusa/ripristinata, errore di lettura/scrittura/timeout, etc.). Puoi risolverlo abbassando l'intervallo di mantenimento in vita nelle impostazioni avanzate del profilo ad esempio per 9 o 15 minuti. Nota che le ottimizzazioni della batteria devono essere disabilitate nel passaggio 4 della configurazione per mantenere in vita le connessioni in modo affidabile.

Alcuni provider inviano qualcosa ogni due minuti del tipo di '*Ancora qui*' risultando in traffico di rete e nell'attivazione del tuo dispositivo e causando uso extra non necessario della batteria. Puoi ispezionare il *Registro* tramite il menu di navigazione principale per controllare se il tuo provider lo stia facendo. Se il tuo provider usa [Dovecot](https://www.dovecot.org/) come server IMAP, potresti chiedere al tuo provider di cambiare l'impostazione [imap_idle_notify_interval](https://wiki.dovecot.org/Timeouts) a un valore maggiore o anche meglio, disabilitarla. Se il tuo provider non è capace o desideroso di cambiarlo/disabilitarlo, dovresti considerare di passare alla sincronizzazione periodica invece che continua. Puoi modificarlo nelle impostazioni di ricezione.

Se ottieni il messaggio *Questo provider non supporta i messaggi push* configurando un profilo, considera di passare a un provider moderno che supporta messaggi push (IMAP IDLE) per ridurre l'uso della batteria.

Se il tuo dispositivo ha uno schermo [AMOLED](https://en.wikipedia.org/wiki/AMOLED), puoi risparmiare l'uso della batteria visualizzando i messaggi passando al tema scuro.

Se l'ottimizzazione automatica nelle impostazioni di ricezione è abilitato, un profilo sarà cambiato automaticamente per controllare periodicamente per nuovi messaggi quando il server email:

* Dice '*Ancora qui*' entro 3 minuti
* Il server email non supporta i messaggi push
* L'intervallo di mantenimento in vita è inferiore a 12 minuti

Inoltre, le cartelle del cestino e dello spam saranno impostate automaticamente per verificare la presenza di nuovi messaggi dopo tre errori di [troppe connessioni simultanee](#user-content-faq23) consecutive.

<br />

<a name="faq40"></a>
**(40) Come posso ridurre l'uso di dati di FairEmail?**

Puoi ridurre l'uso dei dati allo stesso modo che riducendo l'uso della batteria, vedi la domanda precedente per i suggerimenti.

È inevitabile che i dati saranno usati per sincronizzare i messaggi.

Se la connessione al server email è persa, FairEmail risincronizzerà sempre i messaggi per assicurarsi che non ne siano mancati alcuni. Se la connessione è instabile, questo può risultare in un uso extra dei dati. In questo caso, è una buona idea ridurre il numero di giorni per sincronizzare i messaggi a un minimo (vedi la domanda precedente) o passare alla sincronizzazione periodica dei messaggi (impostazioni di ricezione).

Per ridurre l'uso dei dati, potresti cambiare queste impostazioni avanzate di ricevimento:

* Controlla che i messaggi vecchi siano stati rimossi dal server: disabilitato
* Sincronizzazione (condivisa) dell'elenco delle cartelle: disabilitato

Di default FairEmail non scarica i testi e gli allegati del messaggio più grandi di 256 KiB quando c'è una connessione a internet misurata (mobile o Wi-Fi a pagamento). Puoi cambiarlo nelle impostazioni di connessione.

<br />

<a name="faq41"></a>
**(41) How can I fix the error 'Handshake failed' ?**

There are several possible causes, so please read to the end of this answer.

The error '*Handshake failed ... WRONG_VERSION_NUMBER ...*' might mean that you are trying to connect to an IMAP or SMTP server without an encrypted connection, typically using port 143 (IMAP) and port 25 (SMTP), or that a wrong protocol (SSL/TLS or STARTTLS) is being used.

Most providers provide encrypted connections using different ports, typically port 993 (IMAP) and port 465/587 (SMTP).

If your provider doesn't support encrypted connections, you should ask to make this possible. If this isn't an option, you could enable *Allow insecure connections* both in the advanced settings AND the account/identity settings.

See also [this FAQ](#user-content-faq4).

The error '*Handshake failed ... SSLV3_ALERT_ILLEGAL_PARAMETER ...*' is either caused by a bug in the SSL protocol implementation or by a too short DH key on the email server and can unfortunately not be fixed by FairEmail.

The error '*Handshake failed ... HANDSHAKE_FAILURE_ON_CLIENT_HELLO ...*' might be caused by the provider still using RC4, which isn't supported since [Android 7](https://developer.android.com/about/versions/nougat/android-7.0-changes.html#tls-ssl) anymore.

The error '*Handshake failed ... UNSUPPORTED_PROTOCOL or TLSV1_ALERT_PROTOCOL_VERSION ...*' might be caused by enabling hardening connections in the connection settings or by Android not supporting older protocols anymore, like SSLv3.

Android 8 Oreo and later [do not support](https://developer.android.com/about/versions/oreo/android-8.0-changes#security-all) SSLv3 anymore. There is no way to workaround lacking RC4 and SSLv3 support because it has completely been removed from Android (which should say something).

You can use [this website](https://ssl-tools.net/mailservers) or [this website](https://www.immuniweb.com/ssl/) to check for SSL/TLS problems of email servers.

<br />

<a name="faq42"></a>
**(42) Puoi aggiungere un nuovo provider all'elenco dei provider?**

Se il provider è usato da più che poche persone, sì, con piacere.

Le seguenti informazioni sono necessarie:

```
<provider
    name="Gmail"
    link="https://support.google.com/mail/answer/7126229" // link to the instructions of the provider
    type="com.google"> // questo non è necessario
    <imap
        host="imap.gmail.com"
        port="993"
        starttls="false" />
    <smtp
        host="smtp.gmail.com"
        port="465"
        starttls="false" />
</provider>
```

L'EFF [scrive](https://www.eff.org/nl/deeplinks/2018/06/announcing-starttls-everywhere-securing-hop-hop-email-delivery): "*Inoltre, anche se configuri perfettamente STARTTLS e usi un certificato valido, non c'è ancora garanzia alcuna che le tue comunicazioni saranno crittografate.*"

Quindi, le connessioni SSL pure sono più sicure che usare [STARTTLS](https://en.wikipedia.org/wiki/Opportunistic_TLS) e dunque preferite.

Sei pregato di assicurarti che la ricezione e l'invio dei messaggi funzionino propriamente prima di contattarmi per aggiungere un provider.

Vedi sotto come contattarmi.

<br />

<a name="faq43"></a>
**(43) Muoi mostrare l'originale ... ?**

Mostra l'originale, mostra il messaggio originale come inviato dal mittente, includendo font, colori, margini, etc. originali. FairEmail non li altererà in alcun modo, eccetto che richiedendo [TEXT_AUTOSIZING](https://developer.android.com/reference/android/webkit/WebSettings.LayoutAlgorithm), che *tenterà* di rendere più leggibili i testi piccoli.

<br />

<a name="faq44"></a>
**~~(44) Puoi mostrare foto / identicon di contatto nella cartella inviati?~~**

~~Le foto di contatto e gli identicon sono sempre mostrati per il mittente perché necessari per i thread di conversazione.~~ ~~Ottenere le foto di contatto sia per il mittente che per il destinatario non è propriamente un'opzione perché ottenere le foto di contatto è un'operazione costosa.~~

<br />

<a name="faq45"></a>
**(45) Come posso risolvere 'Questa chiave non è disponibile. **Per usarla, devi importarla come tua!'</em> ?**</p>

Otterrai il messaggio *Questa chiave non è disponibile. Per usarla, devi importarla come tua!* provando a decrittografare un messaggio con una chiave pubblica. Per risolverlo devi importare la chiave privata.

<br />

<a name="faq46"></a>
**(46) Perché l'elenco dei messaggi continua ad aggiornarsi?**

Se vedi uno 'snipper' sull'elenco dei messaggi, la cartella è ancora sincronizzata con il server remoto. Puoi vedere il progresso della sincronizzazione nell'elenco delle cartelle. Vedi la legenda su cosa significano le icone e i numeri.

La velocità del tuo dispositivo e della connessione internet e il numero di giorni per sincronizzare i messaggi per determinare quanto durerà la sincronizzazione. Nota che non dovresti impostare il numero di giorni per sincronizzare i messaggi a oltre un giorno in gran parte dei casi, vedi anche [questa FAQ](#user-content-faq39).

<br />

<a name="faq47"></a>
**(47) Come risolvo l'errore 'Nessun colore primario o nessuna cartella delle bozze' ?**

Otterrai il messaggio di errore *Nessun profilo primario o nessuna cartella delle bozze* provando a comporre un messaggio mentre non esiste alcun profilo impostato come primario o quando non ci sono cartelle di bozze selezionate per il profilo primario. Questo può succedere ad esempio avviando FairEmail per comporre un messaggio da un'altra app. FairEmail deve sapere dove archiviare le bozze, quindi dovrai selezionare un profilo come principale e/o dovrai selezionare una cartella di bozze per il profilo principale.

Questo può succedere anche provando a rispondere a un messaggio o a inoltrarne uno da un profilo senza cartella delle bozze, mentre non esiste alcun profilo principale o quando questo non ha una cartella di bozze.

Sei pregato di vedere [questa FAQ](#user-content-faq141) per ulteriori informazioni.

<br />

<a name="faq48"></a>
**~~(48) Come risolvo l'errore 'Nessun profilo principale o nessuna cartella d'archivio?~~**

~~Otterrai il messaggio di errore *Nessun profilo principale o nessuna cartella di archivio* cercando messaggi da un'altra app. Fair Email deve sapere dove cercare, quindi dovrai selezionare un profilo come principale e/o una cartella di archivio per il profilo principale.~~

<br />

<a name="faq49"></a>
**(49) Come risolvo 'Un'app obsoleta ha inviato un percorso del file invece di un flusso di file' ?**

Potresti aver selezionato o inviato un allegato o un'immagine con un gestore di file obsoleto o un'app obsoleta che presume che tutte le app abbiano ancora permessi di archiviazione. Per motivi di sicurezza e privacy le app moderne come FairEmail non hanno più alcun accesso completo a tutti i file. Questo può risultare nel messaggio di errore *Un'app obsoleta ha inviato un percorso del file invece di un flusso di file* se un nome del file invece che un flusso di file è in condivisione con FairEmail perché questo non può aprire casualmente i file.

Puoi correggerlo passando a un gestore di file aggiornato o un'app progettata per le versioni recenti di Android. In alternativa, puoi garantire l'accesso di lettura di FairEmail allo spazio di archiviazione sul tuo dispositivo nelle impostazioni dell'app di Android. Nota che questa soluzione [non funzionerà più su Android Q](https://developer.android.com/preview/privacy/scoped-storage).

Vedi anche la [domanda 25](#user-content-faq25) e [cosa scrive a riguardo Google](https://developer.android.com/training/secure-file-sharing/share-file#RespondToRequest).

<br />

<a name="faq50"></a>
**(50) Puoi aggiungere un'opzione per sincronizzare tutti i messaggi?**

Puoi sincronizzare più messaggi o persino tutti tenendo premuto a lungo una cartella (posta in entrata) nell'elenco delle cartelle di un profilo (tocca il nome di un profilo nel menu di navigazione) e selezionando *Sincronizza di più* nel menu a popup.

<br />

<a name="faq51"></a>
**(51) Come sono ordinate le cartelle?**

Le cartelle sono prima ordinate su ordine del profilo (di default sul nome del profilo) e entro un profilo con cartelle speciali di sistema in alto, seguite da quelle impostate per la sincronizzazione. Entro ogni categoria le cartelle sono ordinate per nome (su schermo). Puoi impostare il nome mostrato premendo a lungo una cartella nell'elenco delle cartelle e selezionando *Modifica proprietà*.

L'elemento del menu di navigazione (hamburger) *Ordine cartelle* nella configurazione è utilizzabile per ordinare manualmente le cartelle.

<br />

<a name="faq52"></a>
**(52) Perché ci vuole del tempo per riconnettersi a un profilo?**

Non c'è modo affidabile per sapere se una connessione del profilo è stata terminata con grazia o con forza. Provare a riconnettersi a un profilo mentre la connessione del profilo è stata terminata forzatamente troppo spesso può risultare in problemi come [troppe connessioni simultanee](#user-content-faq23) o persino il blocco del profilo. Per prevenire tali problemi, FairEmail attende 90 secondi fino a provare a riconnettersi.

Puoi tenere premuto a lungo le *Impostazioni* nel menu di navigazione per riconnettersi immediatamente.

<br />

<a name="faq53"></a>
**(53) Puoi mettere la barra d'azione del messaggio in alto/in basso?**

La barra di azione del messaggio funziona su un messaggio singolo e la barra di azione in fondo funziona su tutti i messaggi nella cconversazione. Essendoci sempre più di un messaggio in una conversazione, questo è impossibile. Inoltre, ci sono alcune azioni specifiche del messaggio, come l'inoltro.

Spostare la barra d'azione del messaggio in fondo al messaggio è visivamente non attraente perché c'è già una barra di azione della conversazione in fondo alla schermata.

Nota che non ci sono molte app di email (se presenti) che mostrano una conversazione come elenco di messaggi espandibili. Questo ha molti vantaggi, ma causa anche il bisogno di azioni specifiche del messaggio.

<br />

<a name="faq54"></a>
**~~(54) Come uso il prefisso di uno spazio del nome?~~**

~~Il prefisso di uno spazio del nome è usato per rimuovere automaticamente il prefisso, i provider talvolta aggiungo i nomi delle cartelle.~~

~~Per esempio la cartella di spam di Gmail è chiamata:~~

```
[Gmail]/Spam
```

~~Impostando il prefisso dello spazio del nome a *[Gmail]*, FairEmail rimuoverà automaticamente *[Gmail]* dai nomi di tutte le cartelle.~~

<br />

<a name="faq55"></a>
**(55) Come posso contrassegnare tutti i messaggi come letti / spostati o eliminarli tutti?**

Puoi usare la selezione multipla per questo. Premi a lungo il primo messaggio, non sollevare il dito e scorri in giù all'ultimo messaggio. Quindi usa il pulsante di azione a tre puntini per eseguire l'azione desiderata.

<br />

<a name="faq56"></a>
**(56) Puoi aggiungere il supporto per JMAP?**

Quasi nessun provider offre il protocollo [JMAP](https://jmap.io/), quindi non vale la pena sforzarsi molto per aggiungere supporto a questo a FairEmail.

<br />

<a name="faq57"></a>
**(57) Posso usare HTML nelle firme?**

Sì, puoi usare [HTML](https://en.wikipedia.org/wiki/HTML). Nell'editor della firma puoi passare alla modalità HTML tramite il menu a tre puntini.

Nota che se torni all'editor di testo non tutto lo HTML potrebbe essere renderizzato così com'è perché l'editor di testo di Android non è capace di renderizzarlo tutto. Similmente, se usi l'editor di testo, lo HTML potrebbe essere alterato in modi inaspettati.

Se vuoi usare il testo pre-formattato, come [ASCII art](https://en.wikipedia.org/wiki/ASCII_art), dovresti avvolgere il testo in un elemento *pre* come questo:

```
<pre>
  |\_/|
 / @ @ \
( > º < )
 `>>x<<´
 /  O  \
 </pre>
```

<br />

<a name="faq58"></a>
**(58) Cosa significa l'icona dell'email aperta/chiusa?**

L'icona dell'email nell'elenco delle cartelle può essere aperta (delineata) o chiusa (solida):

![External image](https://github.com/M66B/FairEmail/blob/master/images/baseline_mail_outline_black_48dp.png)

I corpi del messaggio e gli allegati non sono scaricati di default.

![External image](https://github.com/M66B/FairEmail/blob/master/images/baseline_email_black_48dp.png)

I corpi e gli allegati del messaggio sono scaricati di default.

<br />

<a name="faq59"></a>
**(59) I messaggi originali possono essere aperti nel browser?**

Per ragioni di sicurezza con il messaggio originale, i testi non sono accessibili ad altre app, quindi questo è impossibile. In teoria il [Framework di Accesso all'Archiviazione](https://developer.android.com/guide/topics/providers/document-provider) potrebbe essere usato per condividere questi file, ma persino Google Chrome non può gestirlo.

<br />

<a name="faq60"></a>
**(60) Sapevi che ... ?**

* Sapevi che i messaggi stellati possono essere sincronizzati/mantenuti sempre? (abilitabile nelle impostazioni di ricezione)
* Sapevi che puoi premere a lungo l'icona 'scrivi messaggio' per andare alla cartella delle bozze?
* Sapevi che esiste un'opzione avanzata per contrassegnare i messaggi come letti quando sono spostati? (anche archiviare e cestinare è spostare)
* Sapevi che puoi selezionare il testo (o un indirizzo email) in ogni app sulle versioni recenti di Android e farle cercare a FairEmail?
* Sapevi che FairEmail ha una modalità tablet? Ruota il tuo dispositivo in modalità orizzontale e le conversazioni saranno aperte in una seconda colonna in caso di abbastanza spazio su schermo.
* Sapevi che puoi premere a lungo un modello di risposta per creare una bozza dal modello?
* Sapevi che puoi tenere premuto a lungo, trattenere e scorrere per selezionare un intervallo di messaggi?
* Sapevi che puoi provare a inviare i messaggi usando tira in basso per ricaricare nella casella della posta in uscita?
* Sapevi che puoi scorrere a sinistra o destra una conversazione per andare alla successiva o precedente?
* Sapevi che puoi toccare su un'immagine per vedere da dove verrà scaricata?
* Sapevi che puoi tenere premuto a lungo l'icona della cartella nella barra di azione per selezionare un profilo?
* Sapevi che puoi tenere premuto a lungo l'icona della stella nel thread della conversazione per impostare una stella colorata?
* Sapevi che puoi aprire il pannello di navigazione scorrendo da sinistra, anche visualizzando una conversazione?
* Sapevi che puoi tenere premuto a lungo l'icona della persona per mostrare/nascondere i campi CC/BCC e ricordare lo stato di visibilità per la prossima volta?
* Sapevi che puoi inserire gli indirizzi email di un gruppo di contatti di Android tramite il menu di trabocco a tre puntini?
* Sapevi che se selezioni il testo e clicchi rispondi, solo il testo selezionato sarà citato?
* Sapevi che puoi tenere premuto a lungo le icone del cestino (sia nella barra di azione in fondo che nel messaggio) per eliminare permanentemente un messaggio o una conversazione? (versione 1.1368+)
* Sapevi che puoi tenere premuto a lungo l'azione di invio per mostrare la finestra di invio, anche se è disabilitata?
* Sapevi che puoi tenere premuto a lungo l'icona di schermo intero per mostrare solo il testo originale del messaggio?

<br />

<a name="faq61"></a>
**(61) Perché alcuni messaggi sono mostrati attenuati?**

I messaggi mostrati attenuati (ingrigiti) sono messaggi spostati localmente per cui lo spostamento non è ancora stato confermato dal server. Questo può succedere quando non c'è alcuna connessione al server o al profilo (ancora). Questi messaggi saranno sincronizzati dopo una connessione al server e la creazione del profilo o, se non succede mai, saranno eliminati se troppo vecchi da sincronizzare.

Potresti dover sincronizzare manualmente la cartella, ad esempio tirando in giù.

Puoi visualizzare questi messaggi, ma non puoi spostarli di nuovo fino alla conferma dello spostamento precedente.

Le [operazioni](#user-content-faq3) in attesa sono mostrate come accessibili nella vista delle operazioni dal menu di navigazione principale.

<br />

<a name="faq62"></a>
**(62) Che metodi di autenticazione sono supportati?**

I seguenti metodi di autenticazione sono supportati e usati in quest'ordine:

* LOGIN
* PLAIN
* CRAM-MD5
* XOAUTH2 ([Gmail](https://developers.google.com/gmail/imap/xoauth2-protocol), [Yandex](https://tech.yandex.com/oauth/))
* NTLM (non testato)

I metodi di autenticazione SASL, oltre CRAM-MD5, non sono supportati perché [JavaMail per Android](https://javaee.github.io/javamail/Android) non supporta l'autenticazione SASL.

Se il provider richiede un metodo di autenticazione non supportato, potresti ottenere il messaggio di errore *autenticazione fallita*.

L'[Indicazione del Nome del Server](https://en.wikipedia.org/wiki/Server_Name_Indication) è supportata da [tutte le versioni Android supportate](https://developer.android.com/training/articles/security-ssl).

<br />

<a name="faq63"></a>
**(63) Come sono ridimensionate le immagini per la visualizzazione sugli schermi?**

Le immagini in linea grandi o allegate [PNG](https://en.wikipedia.org/wiki/Portable_Network_Graphics) e [JPEG](https://en.wikipedia.org/wiki/JPEG) saranno ridimensionate automaticamente per la visualizzazione sugli schermi. Questo perché i messaggi email sono limitati in dimensioni, in base al provider, principalmente tra 10 e 50 MB. Le immagini saranno ridimensionate di default a una larghezza e altezza massima di circa 140 pixel e salvate con un rapporto di compressione del 90%. Le immagini sono ridimensionate usando fattori interi per ridurre l'uso della memoria e mantenere la qualità dell'immagine. Il ridimensionamento automatico di immagini in linea e/o allegate e la dimensione massima di destinazione dell'immagine è configurabile nelle impostazioni di invio.

Se vuoi ridimensionare le immagini su base del caso, puoi usare [Send Reduced](https://f-droid.org/en/packages/mobi.omegacentauri.SendReduced/) o un'app simile.

<br />

<a name="faq64"></a>
**~~(64) Puoi aggiungere le azioni personalizzate per lo scorrimento a sinistra/destra?~~**

~~La cosa più naturale da fare quando scorri a sinistra o destra in una voce dell'elenco è rimuoverla dall'elenco.~~ ~~L'azione più naturale nel contesto di un'app di email è spostare il messaggio al di fuori della cartella verso un'altra.~~ ~~Puoi selezionare la cartella in cui spostare nelle impostazioni del profilo.~~

~~Altre azioni, come contrassegnare i messaggi come letti e posticiparli sono disponibili tramite la selezione multipla.~~ ~~Puoi premere un messaggio a lungo per avviare la selezione multipla. Vedi anche [questa domanda](#user-content-faq55).~~

~~Scorrere a sinistra o destra per contrassegnare un messaggio come letto o non letto non è naturale perché il messaggio prima se ne va e poi torna in una forma differente.~~ ~~Nota che esiste un'opzione avanzata per contrassegnare automaticamente i messaggi letti allo spostamento,~~ ~~che in gran parte dei casi è una sostituzione perfetta per contrassegnare la sequenza come letta e spostarla a qualche cartella.~~ ~~Puoi anche contrassegnare i messaggi come letti dalle notifiche dei nuovi messaggi.~~

~~Se vuoi leggere più tardi un messaggio, puoi nasconderlo fino a un orario specifico usando il menu *posticipa*.~~

<br />

<a name="faq65"></a>
**(65) Perché alcuni allegati sono mostrati come attenuati?**

Gli allegati in linea (immagine) sono mostrati come attenuati. [Gli allegati in linea](https://tools.ietf.org/html/rfc2183) dovrebbero essere scaricati e mostrati automaticamente, ma poiché FairEmail non scarica sempre automaticamente gli allegati, vedi anche [questa FAQ](#user-content-faq40), FairEmail mostra tutti i tipi di allegati. Per distinguere gli allegati in linea e regolari, i primi sono mostrati attenuati.

<br />

<a name="faq66"></a>
**(66) FairEmail è disponibile nella Libreria di Famiglia di Google Play?**

Il prezzo di alcune funzionalità pro è troppo basso, inferiore al prezzo di gran parte delle app simili, e ci sono [troppe commissioni e tasse](#user-content-faq19), per giustifica la resa di FairEmail disponibile nella [Libreria di Famiglia di Google Play](https://support.google.com/googleone/answer/7007852). Nota che Google promuove la libreria di Famiglia, ma la fa pagare agli sviluppatori.

<br />

<a name="faq67"></a>
**(67) Come posso posticipare le conversazioni?**

Seleziona più di una conversazione (premi a lungo per avviare la selezione multipla), tocca il pulsante a tre punti e seleziona *Posticipa ...*. In alternativa, nella vista espansa del messaggio usa *Posticipa ...* nel menu 'altro' a tre puntini del messaggio o l'azione di timelapse nella barra di azione in basso. Seleziona l'orario di posticipazione delle conversazioni e conferma toccando OK. Le conversazioni saranno nascoste per il tempo selezionato e mostrate nuovamente in seguito. Riceverai la notifica di un nuovo messaggio come promemoria.

Puoi anche posticipare i messaggi con [una regola](#user-content-faq71).

Puoi mostrare i messaggi posticipati deselezionando *Filtra* > *Nascosti* nel menu di trabocco a tre puntini.

Puoi toccare sulla piccola icona di posticipazione per vedere fin quando è posticipata una conversazione.

Selezionando una durata di posticipazione di zero, puoi annullare la posticipazione.

<br />

<a name="faq68"></a>
**~~(68) Perché Adobe Acrobat Reader non può aprire gli allegati PDF / app di Microsoft e i documenti allegati?~~**

~~Adobe Acrobat Reader e le app di Microsoft prevedono ancora l'accesso completo a tutti i file archiviati,~~ ~~mentre le app dovrebbero usare il [Framework di Accesso all'Archiviazione](https://developer.android.com/guide/topics/providers/document-provider) da Android KitKat (2013)~~ ~~per avere accesso ai soli file condivisi attivamente. Questo è per motivi di sicurezza e privacy.~~

~~Puoi risolverlo salvando l'allegato e aprendolo dall'app di Adobe Acrobat Reader / Microsoft,~~ ~~ma si consiglia di installare un visualizzatore di documenti / PDF reader aggiornato e preferibilmente open-source,~~ ~~per esempio quelle elencate [qui](https://github.com/offa/android-foss#-document--pdf-viewer).~~

<br />

<a name="faq69"></a>
**(69) Puoi aggiungere lo scorrimento automatico in su sui nuovi messaggi?**

L'elenco dei messaggi viene scorso in su automaticamente navigando dalla notifica di un messaggio nuovo o dopo un aggiornamento manuale. Scorrere sempre in su automaticamente all'arrivo dei nuovi messaggi interferirebbe con il tuo scorrimento, ma se vuoi puoi abilitarlo nelle impostazioni.

<br />

<a name="faq70"></a>
**(70) Quando saranno espansi automaticamente i messaggi?**

Quando la navigazione al messaggio di una conversazione sarà espansa se:

* C'è solo un messaggio nella conversazione
* C'è esattamente un messaggio non letto nella conversazione

Esiste un'eccezione: il messaggio non è ancora stato scaricato ed è troppo grande per il download automatico su una connessione misurata (mobile). Puoi impostare o disabilitare la dimensione massima del messaggio sulla scheda delle impostazioni di 'connessione'.

I messaggi duplicati (archiviati), cestinati e le bozze non sono contate.

I messaggi saranno automaticamente contrassegnati come letti all'espansione, a meno che non sia disabilitato nelle impostazioni del singolo profilo.

<br />

<a name="faq71"></a>
**(71) Come uso le regole di filtraggio?**

Puoi modificare le regole del filtro premendo a lungo una cartella nell'elenco delle cartelle di un profilo (tocca il nome del profilo nel menu laterale/di navigazione).

Le nuove regole saranno applicate ai nuovi messaggi ricevuti nella cartella, non ai messaggi esistenti. Puoi controllare la regole a applicarla ai messaggi esistenti, o in alternativa, premendo a lungo la regola nell'elenco della regola e selezionare *Esegui ora*.

Dovrai dare un nome alla regola e dovrai definire l'ordine in cui una regola dovrebbe essere eseguita in relazione ad altre regole.

Puoi disabilitare una regola e puoi interrompere l'elaborazione delle altre dopo l'esecuzione di una.

Le seguenti condizioni della regola sono disponibili:

* Mittente contiene
* Destinatario contiene
* Oggetto contiene
* Ha allegati
* Intestazione contiene
* Giorno/ora tra

Tutte le condizioni di una regola devono essere vere per l'esecuzione dell'azione della regola. Tutte le condizioni sono opzionali, ma ci deve essere almeno una condizione, per prevenire l'abbinamento di tutti i messaggi. Se vuoi abbinare tutti i mittenti o tutti i destinatari, puoi semplicemente usare il carattere @ come condizione perché tutti gli indirizzi email lo conterranno.

Nota che gli indirizzi email sono formattati come segue:

`
"Qualcuno" <somebody@example.org>`

Puoi usare regole multiple, possibilmente con *interrompi elaborazione*, per una condizione *o* o *non*.

L'abbinamento non è sensibile alle maiuscole, a meno che tu non usi le [espressioni regolari](https://en.wikipedia.org/wiki/Regular_expression). Sei pregato di vedere [qui](https://developer.android.com/reference/java/util/regex/Pattern) per la documentazione delle espressioni regola di Java. Puoi testare [qui](https://regexr.com/) un regex.

Nota che un'espressione regolare supporta un operatore *o*, quindi se vuoi abbinare mittenti multipli, puoi fare questo:

`
.*alice@example\.org.*|.*bob@example\.org.*|.*carol@example\.org.*`

Nota che la [modalità dot all](https://developer.android.com/reference/java/util/regex/Pattern#DOTALL) è abilitata per abbinare le [intestazioni senza cartelle](https://tools.ietf.org/html/rfc2822#section-3.2.3).

Puoi selezionare una di queste azioni da applicare ai messaggi corrispondenti:

* Nessun'azione (utile per *non*)
* Segna come letto
* Segna come non letto
* Nascondi
* Sopprimi notifica
* Posticipa
* Aggiungi stella
* Imposta importanza (priorità locale)
* Aggiungi parola chiave
* Sposta
* Copia (Gmail: etichetta)
* Rispondi/inoltra (con modello)
* Sintesi vocale (mittente e oggetto)
* Automatizzazione (Tasker, etc.)

Le regole si applicano direttamente dopo il recupero dell'intestazione del messaggio, ma prima dello scaricamento del testo del messaggio, quindi è impossibile applicare le condizioni al testo del messaggio. Nota che i testi di messaggi grandi sono scaricati su richiesta su una connessione misurata per risparmiare sull'uso dei dati.

Se vuoi inoltrare un messaggio, considera invece di usare l'azione di spostamento. Questa sarà più affidabile dell'inoltro anche perché i messaggi inoltrati potrebbero essere considerati come spam.

Poiché le intestazioni del messaggio non sono scaricate e archiviate di default per risparmiare sull'uso della batteria e dei dati e per risparmiare spazio di archiviazione, è impossibile vedere in anteprima quali messaggi corrisponderebbero alla condizione di una regola dell'intestazione.

Alcune condizioni comuni dell'intestazione (regex):

* *.&ast;Auto-Submitted:.&ast;* [RFC3834](https://tools.ietf.org/html/rfc3834)
* *.&ast;Content-Type: multipart/report.&ast;* [RFC3462](https://tools.ietf.org/html/rfc3462)

Nel menu del messaggio *altro* a tre puntini esiste un elemento per creare una regola per un messaggio ricevuto con le condizioni più comuni inserite.

Il protocollo POP3 non supporta l'impostazione delle parole chiave e lo spostamento o copia dei messaggi.

Usare le regole è una funzionalità pro.

<br />

<a name="faq72"></a>
**(72) Cosa sono i profili/le identità primari?**

Il profilo primario è usato quando il profilo è ambiguo, ad esempio avviando una nuova bozza dalla casella di posta in entrata unificata.

Similmente, l'identità primaria di un profilo è usata quando l'identità è ambigua.

Può esistere solo un profilo primario e un'identità primaria per profilo.

<br />

<a name="faq73"></a>
**(73) Spostare i messaggi tra i profili è sicuro/efficiente?**

Spostare i messaggi tra profili è sicuro perché i messaggi grezzi e originali saranno scaricati e spostati e perché i messaggi sorgente saranno eliminati solo dopo l'aggiunta dei messaggi di destinazione

Lo spostamento della partita di messaggi tra i profili è efficiente se sia la cartella sorgente che di arrivo sono impostate per la sincronizzazione, altrimenti FairEmail deve connettersi alle cartelle per ogni messaggio.

<br />

<a name="faq74"></a>
**(74) Perché vedo i messaggi duplicati?**

Alcuni provider, in particolare Gmail, elencano tutti i messaggi in tutte le cartelle, tranne quelli cestinati, anche nella cartella dell'archivio (tutti i messaggi). FairEmail mostra tutti questi messaggi in un modo non invadente per indicare che sono difatti gli stessi messaggi.

Gmail consente a un messaggio di avere etichette multiple, presentate come cartelle in FairEmail. Questo significa che i messaggi con più etichette saranno mostrati anch'essi diverse volte.

<br />

<a name="faq75"></a>
**(75) Puoi creare una versione iOS, Windows, Linux, etc.?**

Servono molta conoscenza ed esperienza per sviluppare correttamente un'app per una piattaforma specifica, per cui sviluppo app solo per Android.

<br />

<a name="faq76"></a>
**(76) Cosa fa 'Elimina messaggi locali'?**

Il menu delle cartelle *Elimina messaggi locali* rimuove i messaggi presenti anche sul server dal dispositivo. Non elimina i messaggi dal server. Questo può essere utile dopo aver cambiato le impostazioni della cartella per scaricare il contenuto del messaggio (testo e allegati), ad esempio per risparmiare spazio.

<br />

<a name="faq77"></a>
**(77) Perché i messaggi sono talvolta mostrati con un lieve ritardo?**

In base alla velocità del tuo dispositivo (velocità del processore e forse anche della memoria), i messaggi potrebbero essere mostrati con un lieve ritardo. FairEmail è progettato per gestire dinamicamente un gran numero di messaggi senza esaurire la memoria. Questo significa che i messaggi devono esser letti da un database e che questo necessita di essere sorvegliato per le modifiche, che potrebbero causare lievi ritardi.

Alcune funzionalità di convenienza, come il raggruppamento dei messaggi per visualizzare i thread di conversazione e la determinazione del messaggio precedente/successivo, impiegano del tempo extra. Nota che non si parla de *il* messaggio successivo perché nel frattempo potrebbe esserne arrivato uno nuovo.

Confrontando la velocità di FairEmail con app simili questo dovrebbe far parte del confronto. È facile scrivere un'app simile e più veloce che mostri solo un elenco lineare di messaggi, possibilmente usando troppa memoria, ma non è facile gestire propriamente l'uso delle risorse e offrire funzionalità più avanzate come il threading della conversazione.

FairEmail si basa sui [componenti di architettura di Android](https://developer.android.com/topic/libraries/architecture/) all'avanguardia, quindi c'è poco spazio per miglioramenti delle prestazioni.

<br />

<a name="faq78"></a>
**(78) Come uso le pianificazioni?**

Nelle impostazioni di ricezione puoi abilitare la pianificazione e impostare un periodo di tempo e i giorni della settimana *in cui* i messaggi dovrebbero essere *ricevuti*. Nota che un orario finale uguale o precedente all'orario di inizio è considerato essere 24 ore dopo.

L'automazione, vedi sotto, è utilizzabile per pianificazioni più avanzate, come ad esempio periodi di sincronizzazione multipli al giorno o differenti per diversi giorni.

È possibile installare FairEmail in profili utente multipli, ad esempio un profilo personale e uno di lavoro, e configurarlo differentemente per ogni profilo, il che è un'altra possibilità per avere piani di sincronizzazione differenti e sincronizzare una diversa serie di profili.

È anche possibile creare delle [regole del filtro](#user-content-faq71) con una condizione temporale e per posticipare i messaggi fino all'orario finale della condizione temporale. In questo modo è possibile *posticipare* i messaggi aziendali fino all'inizio dell'orario lavorativo. Questo significa anche che i messaggi saranno sul tuo dispositivo per quando non ci sarà (temporaneamente) una connessione a internet.

Nota che le versioni recenti di Android consentono la sovrascrizione di DND (Non DIsturbare) per il canale delle notifiche e per app, il che potrebbe essere usato per (non) silenziare notifiche (aziendali) specifiche. Sei pregato di [vedere qui](https://support.google.com/android/answer/9069335) per ulteriori informazioni.

Per schemi più complessi potresti impostare uno o più profili per la sincronizzazione manuale e inviare questo comando a FairEmail per controllare la presenza di nuovi messaggi:

```
(adb shell) am startservice -a eu.faircode.email.POLL
```

Per un profilo specifico:

```
(adb shell) am startservice -a eu.faircode.email.POLL --es account Gmail
```

Puoi anche automatizzare l'attivazione e disattivazione della ricezione dei messaggi inviando questi comandi a FairEmail:

```
(adb shell) am startservice -a eu.faircode.email.ENABLE
(adb shell) am startservice -a eu.faircode.email.DISABLE
```

Per abilitare/disabilitare un profilo specifico:

```
(adb shell) am startservice -a eu.faircode.email.ENABLE --es account Gmail
(adb shell) am startservice -a eu.faircode.email.DISABLE --es account Gmail
```

Nota che disabilitare un profilo nasconderà il profilo e tutte le cartelle e i messaggi associati.

Puoi inviare automaticamente comandi per esempio con [Tasker](https://tasker.joaoapps.com/userguide/en/intents.html):

```
Nuova attività: Qualcosa di riconoscibile
Categoria d'Azione: Intento Varie/Invia
Azione: eu.faircode.email.ENABLE
Target: Servizio
```

Per abilitare/disabilitare un profilo con il nome *Gmail*:

```
Extra: account:Gmail
```

I nomi dei profili sono sensibili alle maiuscole.

La pianificazione è una funzionalità pro.

<br />

<a name="faq79"></a>
**(79) Come uso la sincronizzazione su richiesta (manuale)?**

Normalmente, FairEmail mantiene una connessione ai server email configurati quando è possibile ricevere messaggi in tempo reale. Se non vuoi, per esempio non vuoi essere disturbato o vuoi risparmiare sull'uso della batteria, disabilita semplicemente la ricezione nelle impostazioni di ricezione. Questo interromperà il servizio in background che si occupa della sincronizzazione automatica e rimuoverà la notifica della barra di stato associata.

Puoi anche abilitare *Sincronizza manualmente* nelle impostazioni avanzate del profilo se vuoi sincronizzare manualmente solo profili specifici.

Puoi usare lo scorrimento in giù per ricaricare in un elenco di messaggi o usare il menu delle cartelle *Sincronizza ora* per sincronizzare manualmente i messaggi.

Se vuoi sincronizzare alcune o tutte le cartelle di un profilo manualmente, disabilita semplicemente la sincronizzazione per le cartelle (ma non del profilo).

Potresti voler disabilitare anche [naviga sul server](#user-content-faq24).

<br />

<a name="faq80"></a>
**~~(80) Come correggo l'errore 'Impossibile caricare BODYSTRUCTURE' ?~~**

~~Il messaggio di errore *Impossibile caricare BODYSTRUCTURE* è causato da bug nel server dell'email,~~ ~~vedi [qui](https://javaee.github.io/javamail/FAQ#imapserverbug) per ulteriori dettagli.~~

~~FairEmail tenta già di aggirarli, ma se fallisce dovrai chiedere supporto dal tuo provider.~~

<br />

<a name="faq81"></a>
**~~(81) Puoi rendere scuro lo sfondo del messaggio originale nel tema scuro?~~**

~~Il messaggio originale è mostrato come inviato dal mittente, tutti i colori inclusi.~~ ~~Cambiare il colore di sfondo non solo renderebbe non più originale la vista originale, ma potrebbe risultare anche in messaggi illegibili.~~

<br />

<a name="faq82"></a>
**(82) Cos'è un'immagine di monitoraggio?**

Sei pregato di vedere [qui](https://en.wikipedia.org/wiki/Web_beacon) per sapere esattamente cosa sia un'immagine di monitoraggio. In breve, queste tengono traccia dell'apertura di un messaggio.

FairEmail riconoscerà in gran parte dei casi queste immagini in automatico e le sostituirà con quest'icona:

![External image](https://github.com/M66B/FairEmail/blob/master/images/baseline_my_location_black_48dp.png)

Il riconoscimento automatico delle immagini di monitoraggio può essere disabilitato nelle impostazioni sulla privacy.

<br />

<a name="faq84"></a>
**(84) A cosa servono i contatti locali?**

Le informazioni di contatto locali sono basate su nomi e indirizzi trovati nei messaggi in entrata e in uscita.

L'uso principale dell'archiviazione dei contatti locali è offrire il completamento automatico quando non sono garantiti i permessi dei contatti a FairEmail.

Un altro uso è quello di generare [scorciatoie](#user-content-faq31) sulle versioni recenti di Android per inviare rapidamente un messaggio a persone contattate frequentemente. Questo è anche il motivo per cui il numero di volte di contatto e l'ultimo contatto sono registrate e perché puoi rendere un contatto preferito o escluderlo dai preferiti tenendolo premuto a lungo.

L'elenco dei contatti è ordinato per numero di volte di contatto e ultima volta di contatto.

Di default saranno registrati solo i nomi e gli indirizzi a cui invii messaggi. Puoi cambiarlo nelle impostazioni di invio.

<br />

<a name="faq85"></a>
**(85) Perché un'identità non è disponibile?**

Un'identità è disponibile per inviare un nuovo messaggio o rispondere o inoltrarne uno esistente solo se:

* l'identità è impostata per la sincronizzazione (invio messaggi)
* il profilo associato è impostato per la sincronizzazione (ricezione messaggi)
* il profilo associato ha una cartella delle bozze

FairEmail proverà a selezionare l'identità migliore in base *agli* indirizzi del messaggio a cui si risponde / inoltrato.

<br />

<a name="faq86"></a>
**~~(86) Cosa sono le 'funzionalità extra di privacy'?~~**

~~L'opzione avanzata *funzionalità extra di privacy* abilitano:~~

* ~~La ricerca del proprietario di un indirizzo IP di un link~~
* ~~Il rilevamento e la rimozione delle [immagini di monitoraggio](#user-content-faq82)~~

<br />

<a name="faq87"></a>
**(87) Cosa significa 'credenziali non valide'?**

Il messaggio di errore *credenziali non valide* significa che il nome utente e/o la password non sono corrette, per esempio perché la password è cambiata o scaduta, o che l'autorizzazione del profilo è scaduta.

Se la password è scorretta/scaduta, dovrai aggiornarla nelle impostazioni del profilo e/o dell'identità.

Se l'autorizzazione del profilo è scaduta, dovrai selezionare di nuovo il profilo. Potresti anche dover salvare di nuovo l'identità associata.

<br />

<a name="faq88"></a>
**(88) Come posso usare un profilo di Yahoo, AOL o Sky?**

Il modo preferito per configurare un profilo di Yahoo è usando la procedura guidata rapida di configurazione, che userà OAuth invece di una password ed è dunque più sicura (e anche più facile).

Per autorizzare un profilo di Yahoo, AOL o Sky dovrai creare una password dell'app. Per le istruzioni, sei pregato di vedere qui:

* [per Yahoo](https://help.yahoo.com/kb/generate-third-party-passwords-sln15241.html)
* [per AOL](https://help.aol.com/articles/Create-and-manage-app-password)
* [per Sky](https://www.sky.com/help/articles/getting-started-with-sky-yahoo-mail) (sotto *Altre app di email*)

Sei pregato di vedere [questa FAQ](#user-content-faq111) sul supporto di OAuth.

Nota che Yahoo, AOL e Sky non supportano i messaggi push standard. L'app email di Yahoo usa un protocollo proprietario non documentato per i messaggi push.

I messaggi push richiedono [IMAP IDLE](https://en.wikipedia.org/wiki/IMAP_IDLE) e il server email di Yahoo non segnala IDLE come capacità:

```
Y1 CAPABILITY
* CAPABILITY IMAP4rev1 ID MOVE NAMESPACE XYMHIGHESTMODSEQ UIDPLUS LITERAL+ CHILDREN X-MSG-EXT UNSELECT OBJECTID
Y1 OK CAPABILITY completed
```

<br />

<a name="faq89"></a>
**(89) Come posso inviare messaggi di solo testo semplice?**

By default FairEmail sends each message both as plain text and as HTML formatted text because almost every receiver expects formatted messages these days. If you want/need to send plain text messages only, you can enable this in the advanced identity options. You might want to create a new identity for this if you want/need to select sending plain text messages on a case-by-case basis.

<br />

<a name="faq90"></a>
**(90) Why are some texts linked while not being a link?**

FairEmail will automatically link not linked web links (http and https) and not linked email addresses (mailto) for your convenience. However, texts and links are not easily distinguished, especially not with lots of [top level domains](https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains) being words. This is why texts with dots are sometimes incorrectly recognized as links, which is better than not recognizing some links.

Links for the tel, geo, rtsp and xmpp protocols will be recognized too, but links for less usual or less safe protocols like telnet and ftp will not be recognized. The regex to recognize links is already *very* complex and adding more protocols will make it only slower and possibly cause errors.

Note that original messages are shown exactly as they are, which means also that links are not automatically added.

<br />

<a name="faq91"></a>
**~~(91) Can you add periodical synchronization to save battery power?~~**

~~Synchronizing messages is an expensive proces because the local and remote messages need to be compared,~~ ~~so periodically synchronizing messages will not result in saving battery power, more likely the contrary.~~

~~See [this FAQ](#user-content-faq39) about optimizing battery usage.~~

<br />

<a name="faq92"></a>
**(92) Can you add spam filtering, verification of the DKIM signature and SPF authorization?**

Spam filtering, verification of the [DKIM](https://en.wikipedia.org/wiki/DomainKeys_Identified_Mail) signature and [SPF](https://en.wikipedia.org/wiki/Sender_Policy_Framework) authorization is a task of email servers, not of an email client. I server hanno generalmente più memoria e potenza di calcolo, quindi sono molto più adatti a quest'attività piuttosto che ai dispositivi alimentati a batteria. Also, you'll want spam filtered for all your email clients, possibly including web email, not just one email client. Moreover, email servers have access to information, like the IP address, etc of the connecting server, which an email client has no access to.

Spam filtering based on message headers might have been feasible, but unfortunately this technique is [patented by Microsoft](https://patents.google.com/patent/US7543076).

Of course you can report messages as spam with FairEmail, which will move the reported messages to the spam folder and train the spam filter of the provider, which is how it is supposed to work. This can be done automatically with [filter rules](#user-content-faq71) too. Blocking the sender will create a filter rule to automatically move future messages of the same sender into the spam folder.

Note that you should not delete spam messages, also not from the spam folder, because the email server uses the messages in the spam folder to "learn" what spam messages are.

If you receive a lot of spam messages in your inbox, the best you can do is to contact the email provider to ask if spam filtering can be improved.

Also, FairEmail can show a small red warning flag when DKIM, SPF or [DMARC](https://en.wikipedia.org/wiki/DMARC) authentication failed on the receiving server. You can enable/disable [authentication verification](https://en.wikipedia.org/wiki/Email_authentication) in the display settings.

FairEmail can show a warning flag too if the domain name of the (reply) email address of the sender does not define an MX record pointing to an email server. This can be enabled in the receive settings. Be aware that this will slow down synchronization of messages significantly.

If legitimate messages are failing authentication, you should notify the sender because this will result in a high risk of messages ending up in the spam folder. Moreover, without proper authentication there is a risk the sender will be impersonated. The sender might use [this tool](https://www.mail-tester.com/) to check authentication and other things.

<br />

<a name="faq93"></a>
**(93) Can you allow installation/data storage on external storage media (sdcard)?**

FairEmail uses services and alarms, provides widgets and listens for the boot completed event to be started on device start, so it is not possible to store the app on external storage media, like an sdcard. See also [here](https://developer.android.com/guide/topics/data/install-location).

Messages, attachments, etc stored on external storage media, like an sdcard, can be accessed by other apps and is therefore not safe. See [here](https://developer.android.com/training/data-storage) for the details.

When needed you can save (raw) messages via the three-dots menu just above the message text and save attachments by tapping on the floppy icon.

If you need to save on storage space, you can limit the number of days messages are being synchronized and kept for. You can change these settings by long pressing a folder in the folder list and selecting *Edit properties*.

<br />

<a name="faq94"></a>
**(94) What does the red/orange stripe at the end of the header mean?**

The red/orange stripe at the left side of the header means that the DKIM, SPF or DMARC authentication failed. See also [this FAQ](#user-content-faq92).

<br />

<a name="faq95"></a>
**(95) Why are not all apps shown when selecting an attachment or image?**

For privacy and security reasons FairEmail does not have permissions to directly access files, instead the Storage Access Framework, available and recommended since Android 4.4 KitKat (released in 2013), is used to select files.

If an app is listed depends on if the app implements a [document provider](https://developer.android.com/guide/topics/providers/document-provider). If the app is not listed, you might need to ask the developer of the app to add support for the Storage Access Framework.

Android Q will make it harder and maybe even impossible to directly access files, see [here](https://developer.android.com/preview/privacy/scoped-storage) and [here](https://www.xda-developers.com/android-q-storage-access-framework-scoped-storage/) for more details.

<br />

<a name="faq96"></a>
**(96) Where can I find the IMAP and SMTP settings?**

The IMAP settings are part of the (custom) account settings and the SMTP settings are part of the identity settings.

<br />

<a name="faq97"></a>
**(97) What is 'cleanup' ?**

About each four hours FairEmail runs a cleanup job that:

* Removes old message texts
* Removes old attachment files
* Removes old image files
* Removes old local contacts
* Removes old log entries

Note that the cleanup job will only run when the synchronize service is active.

<br />

<a name="faq98"></a>
**(98) Why can I still pick contacts after revoking contacts permissions?**

After revoking contacts permissions Android does not allow FairEmail access to your contacts anymore. However, picking contacts is delegated to and done by Android and not by FairEmail, so this will still be possible without contacts permissions.

<br />

<a name="faq99"></a>
**(99) Can you add a rich text or markdown editor?**

FairEmail provides common text formatting (bold, italic, underline, text size and color) via a toolbar that appears after selecting some text.

A [Rich text](https://en.wikipedia.org/wiki/Formatted_text) or [Markdown](https://en.wikipedia.org/wiki/Markdown) editor would not be used by many people on a small mobile device and, more important, Android doesn't support a rich text editor and most rich text editor open source projects are abandoned. See [here](https://forum.xda-developers.com/showpost.php?p=79061829&postcount=4919) for some more details about this.

<br />

<a name="faq100"></a>
**(100) How can I synchronize Gmail categories?**

You can synchronize Gmail categories by creating filters to label categorized messages:

* Create a new filter via Gmail > Settings (wheel) > Filters and Blocked Addresses > Create a new filter
* Enter a category search (see below) in the *Has the words* field and click *Create filter*
* Check *Apply the label* and select a label and click *Create filter*

Possible categories:

```
categoria: social
categoria: aggiornamenti
categoria: forum
categoria: promozioni
```

Unfortunately, this is not possible for snoozed messages folder.

You can use *Force sync* in the three-dots menu of the unified inbox to let FairEmail synchronize the folder list again and you can long press the folders to enable synchronization.

<br />

<a name="faq101"></a>
**(101) What does the blue/orange dot at the bottom of the conversations mean?**

The dot shows the relative position of the conversation in the message list. The dot will be show orange when the conversation is the first or last in the message list, else it will be blue. The dot is meant as an aid when swiping left/right to go to the previous/next conversation.

The dot is disabled by default and can be enabled with the display settings *Show relative conversation position with a dot*.

<br />

<a name="faq102"></a>
**(102) How can I enable auto rotation of images?**

Images will automatically be rotated when automatic resizing of images is enabled in the settings (enabled by default). However, automatic rotating depends on the [Exif](https://en.wikipedia.org/wiki/Exif) information to be present and to be correct, which is not always the case. Particularly not when taking a photo with a camara app from FairEmail.

Note that only [JPEG](https://en.wikipedia.org/wiki/JPEG) and [PNG](https://en.wikipedia.org/wiki/Portable_Network_Graphics) images can contain Exif information.

<br />

<a name="faq104"></a>
**(104) What do I need to know about error reporting?**

* Error reports will help improve FairEmail
* Error reporting is optional and opt-in
* Error reporting can be enabled/disabled in the settings, section miscellaneous
* Error reports will automatically be sent anonymously to [Bugsnag](https://www.bugsnag.com/)
* Bugsnag for Android is [open source](https://github.com/bugsnag/bugsnag-android)
* See [here](https://docs.bugsnag.com/platforms/android/automatically-captured-data/) about what data will be sent in case of errors
* See [here](https://docs.bugsnag.com/legal/privacy-policy/) for the privacy policy of Bugsnag
* Error reports will be sent to *sessions.bugsnag.com:443* and *notify.bugsnag.com:443*

<br />

<a name="faq105"></a>
**(105) How does the roam-like-at-home option work?**

FairEmail will check if the country code of the SIM card and the country code of the network are in the [EU roam-like-at-home countries](https://en.wikipedia.org/wiki/European_Union_roaming_regulations#Territorial_extent) and assumes no roaming if the country codes are equal and the advanced roam-like-at-home option is enabled.

So, you don't have to disable this option if you don't have an EU SIM or are not connected to an EU network.

<br />

<a name="faq106"></a>
**(106) Which launchers can show a badge count with the number of unread messages?**

Please [see here](https://github.com/leolin310148/ShortcutBadger#supported-launchers) for a list of launchers which can show the number of unread messages.

Note that the notification setting *Show launcher icon with number of new messages* needs to be enabled (default enabled).

Only *new* unread messages in folders set to show new message notifications will be counted, so messages marked unread again and messages in folders set to not show new message notification will not be counted.

Depending on what you want, the notification settings *Let the number of new messages match the number of notifications* needs to be enabled or disabled.

This feature depends on support of your launcher. FairEmail merely 'broadcasts' the number of unread messages using the ShortcutBadger library. If it doesn't work, this cannot be fixed by changes in FairEmail.

Some launchers display '1' for [the monitoring notification](#user-content-faq2), despite FairEmail explicitly requesting not to show a badge for this notification. This could be caused by a bug in the launcher app or in your Android version. Please double check if the notification dot is disabled for the receive (service) notification channel. You can go to the right notification channel settings via the notification settings of FairEmail. This might not be obvious, but you can tap on the channel name for more settings.

Nota che Tesla Unread [non è più supportata](https://forum.xda-developers.com/android/general/bad-news-tesla-unread-devoloper-t3920415).

FairEmail does send a new message count intent as well:

```
eu.faircode.email.NEW_MESSAGE_COUNT
```

The number of new, unread messages will be in an integer "*count*" parameter.

<br />

<a name="faq107"></a>
**(107) How do I use colored stars?**

You can set a colored star via the *more* message menu, via multiple selection (started by long pressing a message), by long pressing a star in a conversation or automatically by using [rules](#user-content-faq71).

You need to know that colored stars are not supported by the IMAP protocol and can therefore not be synchronized to an email server. This means that colored stars will not be visible in other email clients and will be lost on downloading messages again. However, the stars (without color) will be synchronized and will be visible in other email clients, when supported.

Some email clients use IMAP keywords for colors. However, not all servers support IMAP keywords and besides that there are no standard keywords for colors.

<br />

<a name="faq108"></a>
**~~(108) Can you add permanently delete messages from any folder?~~**

~~When you delete messages from a folder the messages will be moved to the trash folder, so you have a chance to restore the messages.~~ ~~You can permanently delete messages from the trash folder.~~ ~~Permanently delete messages from other folders would defeat the purpose of the trash folder, so this will not be added.~~

<br />

<a name="faq109"></a>
**~~(109) Why is 'select account' available in official versions only?~~**

~~Using *select account* to select and authorize Google accounts require special permission from Google for security and privacy reasons.~~ ~~This special permission can only be acquired for apps a developer manages and is responsible for.~~ ~~Third party builds, like the F-Droid builds, are managed by third parties and are the responsibility of these third parties.~~ ~~So, only these third parties can acquire the required permission from Google.~~ ~~Since these third parties do not actually support FairEmail, they are most likely not going to request the required permission.~~

~~You can solve this in two ways:~~

* ~~Switch to the official version of FairEmail, see [here](https://github.com/M66B/FairEmail/blob/master/README.md#downloads) for the options~~
* ~~Use app specific passwords, see [this FAQ](#user-content-faq6)~~

~~Using *select account* in third party builds is not possible in recent versions anymore.~~ ~~In older versions this was possible, but it will now result in the error *UNREGISTERED_ON_API_CONSOLE*.~~

<br />

<a name="faq110"></a>
**(110) Why are (some) messages empty and/or attachments corrupt?**

Empty messages and/or corrupt attachments are probably being caused by a bug in the server software. Older Microsoft Exchange software is known to cause this problem. Mostly you can workaround this by disabling *Partial fetch* in the advanced account settings:

Setup > Step 1 > Manage > Tap account > Tap advanced > Partial fetch > uncheck

After disabling this setting, you can use the message 'more' (three dots) menu to 'resync' empty messages. Alternatively, you can *Delete local messages* by long pressing the folder(s) in the folder list and synchronize all messages again.

Disabling *Partial fetch* will result in more memory usage.

<br />

<a name="faq111"></a>
**(111) Is OAuth supported?**

OAuth for Gmail is supported via the quick setup wizard. The Android account manager will be used to fetch and refresh OAuth tokens for selected on-device accounts. OAuth for non on-device accounts is not supported because Google requires a [yearly security audit](https://support.google.com/cloud/answer/9110914) ($15,000 to $75,000) for this. You can read more about this [here](https://www.theregister.com/2019/02/11/google_gmail_developer/).

OAuth for Yandex and Yahoo is supported via the quick setup wizard.

OAuth for Office 365 accounts is supported, but Microsoft does not offer OAuth for Outlook, Live and Hotmail accounts (yet?).

<br />

<a name="faq112"></a>
**(112) Which email provider do you recommend?**

FairEmail is an email client only, so you need to bring your own email address.

There are plenty of email providers to choose from. Which email provider is best for you depends on your wishes/requirements. Please see the websites of [Restore privacy](https://restoreprivacy.com/secure-email/) or [Privacy Tools](https://www.privacytools.io/providers/email/) for a list of privacy oriented email providers with advantages and disadvantages.

Some providers, like ProtonMail, Tutanota, use proprietary email protocols, which make it impossible to use third party email apps. Please see [this FAQ](#user-content-faq129) for more information.

Using your own (custom) domain name, which is supported by most email providers, will make it easier to switch to another email provider.

<br />

<a name="faq113"></a>
**(113) How does biometric authentication work?**

If your device has a biometric sensor, for example a fingerprint sensor, you can enable/disable biometric authentication in the navigation (hamburger) menu of the setup screen. When enabled FairEmail will require biometric authentication after a period of inactivity or after the screen has been turned off while FairEmail was running. Activity is navigation within FairEmail, for example opening a conversation thread. The inactivity period duration can be configured in the miscellaneous settings. When biometric authentication is enabled new message notifications will not show any content and FairEmail won't be visible on the Android recents screen.

Biometric authentication is meant to prevent others from seeing your messages only. FairEmail relies on device encryption for data encryption, see also [this FAQ](#user-content-faq37).

Biometric authentication is a pro feature.

<br />

<a name="faq114"></a>
**(114) Can you add an import for the settings of other email apps?**

The format of the settings files of most other email apps is not documented, so this is difficult. Sometimes it is possible to reverse engineer the format, but as soon as the settings format changes things will break. Also, settings are often incompatible. For example, FairEmail has unlike most other email apps settings for the number of days to synchronize messages for and for the number of days to keep messages for, mainly to save on battery usage. Moreover, setting up an account/identity with the quick setup is simple, so it is not really worth the effort.

<br />

<a name="faq115"></a>
**(115) Can you add email address chips?**

Email address [chips](https://material.io/design/components/chips.html) look nice, but cannot be edited, which is quite inconvenient when you made a typo in an email address.

Note that FairEmail will select the address only when long pressing an address, which makes it easy to delete an address.

Chips are not suitable for showing in a list and since the message header in a list should look similar to the message header of the message view it is not an option to use chips for viewing messages.

Reverted [commit](https://github.com/M66B/FairEmail/commit/2c80c25b8aa75af2287f471b882ec87d5a5a5015).

<br />

<a name="faq116"></a>
**~~(116) How can I show images in messages from trusted senders by default?~~**

~~You can show images in messages from trusted senders by default by enabled the display setting *Automatically show images for known contacts*.~~

~~Contacts in the Android contacts list are considered to be known and trusted,~~ ~~unless the contact is in the group / has the label '*Untrusted*' (case insensitive).~~

<br />

<a name="faq38"></a>
<a name="faq117"></a>
**(117) Can you help me restore my purchase?**

Google manages all purchases, so as a developer I have little control over purchases. So, basically the only thing I can do, is give some advice:

* Make sure you have an active, working internet connection
* Make sure you are logged in with the right Google account and that there is nothing wrong with your Google account
* Make sure you installed FairEmail via the right Google account if you configured multiple Google accounts on your device
* Make sure the Play store app is up to date, please [see here](https://support.google.com/googleplay/answer/1050566?hl=en)
* Open the Play store app and wait at least a minute to give it time to synchronize with the Google servers
* Open FairEmail and navigate to the pro features screen to let FairEmail check the purchases; sometimes it help to tap the *buy* button

You can also try to clear the cache of the Play store app via the Android apps settings. Restarting the device might be necessary to let the Play store recognize the purchase correctly.

Note that:

* If you get *ITEM_ALREADY_OWNED*, the Play store app probably needs to be updated, please [see here](https://support.google.com/googleplay/answer/1050566?hl=en)
* Purchases are stored in the Google cloud and cannot get lost
* There is no time limit on purchases, so they cannot expire
* Google does not expose details (name, e-mail, etc) about buyers to developers
* An app like FairEmail cannot select which Google account to use
* It may take a while until the Play store app has synchronized a purchase to another device
* Play Store purchases cannot be used without the Play Store, which is also not allowed by Play Store rules

If you cannot solve the problem with the purchase, you will have to contact Google about it.

<br />

<a name="faq118"></a>
**(118) What does 'Remove tracking parameters' exactly?**

Checking *Remove tracking parameters* will remove all [UTM parameters](https://en.wikipedia.org/wiki/UTM_parameters) from a link.

<br />

<a name="faq119"></a>
**~~(119) Can you add colors to the unified inbox widget?~~**

~~The widget is designed to look good on most home/launcher screens by making it monochrome and by using a half transparent background.~~ ~~This way the widget will nicely blend in, while still being properly readable.~~

~~Adding colors will cause problems with some backgrounds and will cause readability problems, which is why this won't be added.~~

Due to Android limitations it is not possible to dynamically set the opacity of the background and to have rounded corners at the same time.

<br />

<a name="faq120"></a>
**(120) Why are new message notifications not removed on opening the app?**

New message notifications will be removed on swiping notifications away or on marking the associated messages read. Opening the app will not remove new message notifications. This gives you a choice to leave new message notifications as a reminder that there are still unread messages.

On Android 7 Nougat and later new message notifications will be [grouped](https://developer.android.com/training/notify-user/group). Tapping on the summary notification will open the unified inbox. The summary notification can be expanded to view individual new message notifications. Tapping on an individual new message notification will open the conversation the message it is part of. See [this FAQ](#user-content-faq70) about when messages in a conversation will be auto expanded and marked read.

<br />

<a name="faq121"></a>
**(121) How are messages grouped into a conversation?**

By default FairEmail groups messages in conversations. This can be turned of in the display settings.

FairEmail groups messages based on the standard *Message-ID*, *In-Reply-To* and *References* headers. FairEmail does not group on other criteria, like the subject, because this could result in grouping unrelated messages and would be at the expense of increased battery usage.

<br />

<a name="faq122"></a>
**~~(122) Why is the recipient name/email address show with a warning color?~~**

~~The recipient name and/or email address in the addresses section will be shown in a warning color~~ ~~when the sender domain name and the domain name of the *to* address do not match.~~ ~~Mostly this indicates that the message was received *via* an account with another email address.~~

<br />

<a name="faq123"></a>
**(123) What will happen when FairEmail cannot connect to an email server?**

If FairEmail cannot connect to an email server to synchronize messages, for example if the internet connection is bad or a firewall or a VPN is blocking the connection, FairEmail will retry two times after waiting 4 and 8 seconds while keeping the device awake (=use battery power). If this fails, FairEmail will schedule an alarm to retry after 15, 30 and eventually every 60 minutes and let the device sleep (=no battery usage).

Note that [Android doze mode](https://developer.android.com/training/monitoring-device-state/doze-standby) does not allow to wake the device earlier than after 15 minutes.

*Force sync* in the three-dots menu of the unified inbox can be used to let FairEmail attempt to reconnect without waiting.

Sending messages will be retried on connectivity changes only (reconnecting to the same network or connecting to another network) to prevent the email server from blocking the connection permanently. You can pull down the outbox to retry manually.

Note that sending will not be retried in case of authentication problems and when the server rejected the message. In this case you can pull down the outbox to try again.

<br />

<a name="faq124"></a>
**(124) Why do I get 'Message too large or too complex to display'?**

The message *Message too large or too complex to display* will be shown if there are more than 100,000 characters or more than 500 links in a message. Reformatting and displaying such messages will take too long. You can try to use the original message view, powered by the browser, instead.

<br />

<a name="faq125"></a>
**(125) What are the current experimental features?**

*Message classification (version 1.1438+)*

Sei pregato di vedere [questa FAQ](#user-content-faq163) per i dettagli.

Essendo una funzionalità sperimentale, il mio consiglio è di iniziare con una sola cartella.

<br />

<a name="faq126"></a>
**(126) Le anteprime dei messaggi possono essere inviate al mio indossabile?**

FairEmail recupera un messaggio in due passaggi:

1. Fetch message headers
1. Fetch message text and attachments

Direttamente dopo il primo passaggio saranno notificati i nuovi messaggi. Tuttavia, solo dopo il secondo il testo del messaggio sarà disponibile. FairEmail aggiorna le notifiche esistenti con un'anteprima del testo del messaggio, ma sfortunatamente le notifiche dell'indossabile non possono essere aggiornate.

Non essendoci garanzia che il testo di un messaggio sia sempre recuperato direttamente dopo l'intestazione del messaggio, non si può garantire che la notifica di un nuovo messaggio con un testo di anteprima sia sempre inviata a un indossabile.

Se pensi che sia abbastanza, puoi abilitare l'opzione di notifica *Invia solo le notifiche con un'anteprima di messaggio agli indossabile* e se non funziona, puoi provare ad abilitare l'opzione di notifica *Mostra solo le notifiche con un testo di anteprima*. Nota che questo si applica anche agli indossabili che non mostrano un testo di anteprima, anche quando l'app Android Wear dice che la notifica è stata inviata (collegata).

Se vuoi aver inviato il testo completo del messaggio al tuo indossabile, puoi abilitare l'opzione di notifica *Anteprima del testo completo*. Nota che alcuni indossabili sono noti per esser crashati con quest'opzione abilitata.

Se usi un indossabile di Samsung con l'app Galaxy Wearable (Samsung Gear), potresti dover abilitare le notifiche per FairEmail impostando *Notifiche*, *App installate in futuro* è disattivata in quest'app.

<br />

<a name="faq127"></a>
**(127) Come posso correggere 'Argomenti HELO sintatticamente non validi?**

L'errore *... Argomenti HELO sintatticamente non validi ...* significa che il server SMTP ha rifiutato l'indirizzo IP locale o il nome dell'host. Potresti correggere quest'errore abilitando o disabilitando l'opzione di identità avanzata *Usa l'indirizzo IP locale invece del nome dell'host*.

<br />

<a name="faq128"></a>
**(128) Come posso ripristinare le domande fatte, ad esempio per mostrare immagini=**

Puoi ripristinare le domande fatte tramite il menu di panoramica a tre puntini nelle impostazioni varie.

<br />

<a name="faq129"></a>
**(129) ProtonMail e Tutanota sono supportate?**

ProtonMail usa un protocollo email proprietario e [non supporta direttamente IMAP](https://protonmail.com/support/knowledge-base/imap-smtp-and-pop3-setup/), quindi non puoi usare FairEmail per accedere ProtonMail.

Tutanota usa un protocollo email proprietario e [non supporta IMAP](https://tutanota.com/faq/#imap), quindi non puoi usare FairEmail per accedere a Tutanota.

<br />

<a name="faq130"></a>
**(130) Cosa significa il messaggio di errore ...?**

Una serie di righe con testi arancioni o rossi con informazioni tecniche significa che la modalità di debug è stata abilitata nelle impostazioni miste.

L'avviso *Nessun server trovato a ...* significa che non è stato indicato alcun server email al nome di dominio indicato. Rispondere al messaggio potrebbe non essere possibile e potrebbe risultare in un errore. Questo potrebbe indicare un indirizzo email falsificato e/o spam.

L'errore *... ParseException ...* significa che c'è un problema con un messaggio ricevuto, probabilmente causato da un bug nel software di invio. FairEmail lo risolverà nella maggior parte dei casi, quindi questo messaggio è prevalentemente considerabile come un avviso invece che un errore.

L'errore *...SendFailedException...* significa che si è verificato un problema inviando un messaggio. L'errore includerà quasi sempre un motivo. Motivi comuni sono che il messaggio era troppo grande o che uno o più indirizzi del destinatario non erano validi.

L'avviso *Messaggio troppo grande per la memoria disponibile* significa che il messaggio era più grande di 10 MiB. Anche se il tuo dispositivo ha molto spazio di archiviazione, Android fornisce memoria operativa limitata alle app, il che limita la dimensione dei messaggi gestibili.

Sei pregato di vedere [qui](#user-content-faq22) per altri messaggi di errore nella posta in uscita.

<br />

<a name="faq131"></a>
**(131) Puoi modificare la direzione per scorrere al messaggio precedente/successivo?**

Se leggi da sinistra a destra, scorrere a sinistra mostrerà il messaggio successivo. Allo stesso modo, se leggi da destra a sinistra, scorrere a destra mostrerà quello successivo.

Questo comportamento mi sembra molto naturale, anche perché somiglia a voltare le pagine.

Ad ogni modo, esiste un'impostazione di comportamento per invertire la direzione di scorrimento.

<br />

<a name="faq132"></a>
**(132) Perché le notifiche dei nuovi messaggi sono silenziose?**

Le notifiche sono silenziose di default su alcune versioni di MIUI. Sei pregato di vedere [qui](http://en.miui.com/thread-3930694-1-1.html) come puoi risolverlo.

Esiste un bug in alcune versioni di Android che causa che [setOnlyAlertOnce](https://developer.android.com/reference/android/app/Notification.Builder#setOnlyAlertOnce(boolean)) silenzi le notifiche. Poiché FairEmail mostra le notifiche dei nuovi messaggi subito dopo averne recuperato le intestazioni e che FairEmail deve aggiornare le notifiche dei nuovi messaggi dopo il successivo recupero del testo del messaggio, questo non è correggibile o risolvibile da FairEmail.

Android potrebbe limitare il suono di notifica, il che può causare il silenziamento di alcune notifiche dei messaggi.

<br />

<a name="faq133"></a>
**(133) Perché ActiveSync non è supportato?**

Il protocollo ActiveSync di Microsoft Exchange [è brevettato](https://en.wikipedia.org/wiki/Exchange_ActiveSync#Licensing) a può dunque non essere supportato. Per questo motivo non troverai molti altri client email, se presenti, che supportano ActiveSync.

Il protocollo dei Servizi Web di Microsoft Exchange [è in fase di eliminazione](https://techcommunity.microsoft.com/t5/Exchange-Team-Blog/Upcoming-changes-to-Exchange-Web-Services-EWS-API-for-Office-365/ba-p/608055).

Nota che la descrizione di FairEmail inizia con l'osservazione che i protocolli non standard, come i Servizi Web di Microsoft Exchange e ActiveSync di Microsoft non sono supportati.

<br />

<a name="faq134"></a>
**(134) Puoi aggiungere l'eliminazione dei messaggi locali?**

*POP3*

Nelle impostazioni del profilo (Configurazione, passaggio 1, Gestione, tocca profilo) puoi abilitare *Lascia i messaggi eliminati sul server*.

*IMAP*

Poiché il protocollo IMAP è destinato alla sincronizzazione in due modi, eliminare un messaggio dal dispositivo risulterebbe nel recupero del messaggio alla nuova sincronizzazione.

Tuttavia, FairEmail supporta i messaggi nascosti, tramite il menu a tre puntini nella barra di azione proprio sopra il testo del messaggio o selezionando messaggi multipli nell'elenco dei messaggi. Fondamentalmente questo equivale a "lascia sul server" del protocollo POP3 con il vantaggio di poter mostrare ancora i messaggi quando necessario.

Nota che è possibile impostare l'azione di scorrimento da sinistra a destra per nascondere un messaggio.

<br />

<a name="faq135"></a>
**(135) Perché i messaggi cestinati e le bozze sono mostrate nelle conversazioni?**

I messaggi individuali saranno raramente cestinati e prevalentemente si verifica per incidente. Mostrare i messaggi cestinati nelle conversazioni rende più facile ritrovarli.

Puoi eliminare un messaggio permanentemente usando *elimina* nel menu a tre puntini del messaggio, che rimuoverà il messaggio dalla conversazione. Nota che è irreversibile.

Similmente, le bozze sono mostrate nelle conversazioni per ritrovarle nel contesto a cui appartengono. Leggere i messaggi ricevuti è facile prima di continuare a scrivere la bozza in seguito.

<br />

<a name="faq136"></a>
**(136) Come posso eliminare un profilo/identità/cartella?**

L'eliminazione di un profilo/identità/cartella è un po' nascosta per prevenire gli incidenti.

* Account: Setup > Step 1 > Manage > Tap account
* Identity: Setup > Step 2 > Manage > Tap identity
* Folder: Long press the folder in the folder list > Edit properties

Nel menu di trabocco a tre puntini in alto a destra esiste un elemento per eliminare il profilo/identità/cartella.

<br />

<a name="faq137"></a>
**(137) Come posso ripristinare 'Non chiedermelo più'?**

Puoi ripristinare tutte le domande impostate per non esser chieste più nelle impostazioni miste.

<br />

<a name="faq138"></a>
**(138) Puoi aggiungere il calendario, la gestione dei contatti, la sincronizzazione?**

Il calendario e la gestione dei contatti sono realizzabili da un'app separata specializzata. Nota che FairEmail è un'app email specializzata, non una suite da ufficio.

Inoltre, preferisco fare alcune cose molto bene, invece che molte solo a metà. Inoltre, dal punto di vista della sicurezza, non è una buona idea garantire molti permessi a un'app singola.

Si consiglia di usare l'eccellente app open source [DAVx⁵](https://f-droid.org/packages/at.bitfire.davdroid/) per sincronizzare/gestire i tuoi calendari/contatti.

Gran parte dei provider supportano l'esportazione dei tuoi contatti. Sei pregato di [vedere qui](https://support.google.com/contacts/answer/1069522) come puoi importare i contatti se la sincronizzazione è impossibile.

Nota che FairEmail supporta la risposta agli inviti del calendario (una funzionalità pro) e l'aggiunta di inviti del calendario al tuo calendario personale.

<br />

<a name="faq83"></a>
<a name="faq139"></a>
**(139) Come correggo 'Utente autenticato ma non connesso'?**

Difatti questo errore specifico di Microsoft Exchange è un messaggio di errore scorretto causato da un bug nel vecchio software del server di Exchange.

L'errore *Utente autenticato ma non connesso* potrebbe verificarsi se:

* Push messages are enabled for too many folders: see [this FAQ](#user-content-faq23) for more information and a workaround
* The account password was changed: changing it in FairEmail too should fix the problem
* An alias email address is being used as username instead of the primary email address
* An incorrect login scheme is being used for a shared mailbox: the right scheme is *username@domain\SharedMailboxAlias*

Gli alias della casella di posta elettronica condivisa saranno prevalentemente gli indirizzi di posta elettronica del profilo condiviso, come questo:

```
you@example.com\shared@example.com
```

Nota che dovrebbe essere un backslash e non uno slash.

<br />

<a name="faq140"></a>
**(140) Perché il testo del messaggio contiene caratteri strani?**

La visualizzazione di caratteri strani è quasi sempre causata dalla specificazione o meno di una codifica non valida del carattere inviata dal software. FairEmail presumerà che [ISO 8859-1](https://en.wikipedia.org/wiki/ISO/IEC_8859-1) quando nessun carattere è impostato o quando è stato specificato [US-ASCII](https://en.wikipedia.org/wiki/ASCII). Oltre al fatto che non c'è modo di determinare affidabilmente la crittografia corretta dei caratteri automaticamente, quindi non è correggibile da FairEmail. L'azione giusta è quella di lamentarsi con il mittente.

<br />

<a name="faq141"></a>
**(141) Come posso correggere 'Una cartella di bozze è necessaria per inviare i messaggi'?**

Per memorizzare i messaggi di bozza è necessaria una cartella delle bozze. In molti casi FairEmail selezionerà automaticamente le cartelle di bozze all'aggiunta di un profilo basato [sugli attributi](https://www.iana.org/assignments/imap-mailbox-name-attributes/imap-mailbox-name-attributes.xhtml) inviati dal server email. Tuttavia, alcuni server email non sono propriamente configurati e non inviano tali attributi. In questo caso FairEmail prova a identificare la cartella delle bozze per nome, ma questo potrebbe fallire se la cartella delle bozze ha un nome insolito o non è presente affatto.

Puoi risolvere questo problema selezionando manualmente la cartella delle bozze nelle impostazioni del profilo (Configurazione, passaggio 1, tocca profilo, in basso). Se non esiste alcuna cartella delle bozze, puoi crearne una toccando sul pulsante '+' nell'elenco delle cartelle del profilo (tocca il nome del profilo nel menu di navigazione).

Alcuni provider, come Gmail, consentono di abilitare/disabilitare IMAP per le cartelle singole. Quindi, se una cartella è invisibile, potresti dover abilitare l'IMAP per essa.

Collegamento rapido per Gmail: [https://mail.google.com/mail/u/0/#settings/labels](https://mail.google.com/mail/u/0/#settings/labels)

<br />

<a name="faq142"></a>
**(142) Come posso memorizzare i messaggi inviati nella posta in arrivo?**

Generalmente, non è una buona idea memorizzare i messaggi inviati nella posta in arrivo perché difficile da annullare e potrebbe essere non compatibile con altri client di posta elettronica.

Detto ciò, FairEmail può gestire propriamente i messaggi inviati nella posta di arrivo. FairEmail contrassegnerà i messaggi in uscita con l'icona di quelli inviati, per esempio.

La soluzione migliore sarebbe abilitare la visualizzazione della cartella inviati nella posta in arrivo unica premendo a lungo sulla cartella inviati nell'elenco delle cartelle e abilitando *Mostra nella posta in arrivo unificata*. Così tutti i messaggi possono rimanere a dove appartengono, consentendo di vedere sia i messaggi in entrata che in uscita in un posto.

Se non è possibile, puoi [creare una regola](#user-content-faq71) per spostare automaticamente i messaggi inviati in posta in arrivo o impostare un indirizzo CC/BCC predefinito nelle impostazioni di identità avanzata per inviarti una copia.

<br />

<a name="faq143"></a>
**~~(143) Puoi aggiungere una cartella del cestino per i profili POP3?~~**

[POP3](https://en.wikipedia.org/wiki/Post_Office_Protocol) è un protocollo molto limitato. Fondamentalmente solo i messaggi sono scaricabili ed eliminabili dalla posta in arrivo. Non si può nemmeno segnare un messaggio come letto.

Poiché POP3 non consente alcun accesso al cestino, non c'è modo di ripristinare i messaggi cestinati.

Nota che puoi nascondere i messaggi e cercare quelli nascosti, similmente alla cartella locale del cestino, senza suggerire che i messaggi cestinati siano ripristinati, mentre non è realmente possibile.

La versione 1.1082 ha aggiunto una cartella locale del cestino. Nota che cestinare un messaggio lo rimuoverà permanentemente dal server e che i messaggi cestinati non sono più ripristinabili al server.

<br />

<a name="faq144"></a>
**(144) Come posso registrare le note vocali?**

Per registrare le note vocali puoi premere quest'icona nella barra di azione in basso del compositore di messaggi:

![Immagine esterna](https://github.com/M66B/FairEmail/blob/master/images/baseline_record_voice_over_black_48dp.png)

Questo richiede un'app di registrazione audio compatibile installata. In particolare [questo intento comune](https://developer.android.com/reference/android/provider/MediaStore.Audio.Media.html#RECORD_SOUND_ACTION) deve essere supportato</a>.

Per esempio [questo registratore audio](https://f-droid.org/app/com.github.axet.audiorecorder) è compatibile.

Le note vocali saranno allegate automaticamente.

<br />

<a name="faq145"></a>
**(145) Come posso impostare un suono di notifica per un profilo, una cartella o un mittente?**

Profilo:

* Enable *Separate notifications* in the advanced account settings (Setup, step 1, Manage, tap account, tap Advanced)
* Long press the account in the account list (Setup, step 1, Manage) and select *Edit notification channel* to change the notification sound

Cartella:

* Long press the folder in the folder list and select *Create notification channel*
* Long press the folder in the folder list and select *Edit notification channel* to change the notification sound

Mittente:

* Open a message from the sender and expand it
* Expand the addresses section by tapping on the down arrow
* Tap on the bell icon to create or edit a notification channel and to change the notification sound

L'ordine di precedenza è: suono del mittente, suono della cartella, suono del profilo e suono predefinito.

Impostare un suono di notifica per un profilo, una cartella o un mittente richiede Android 8 Oreo o successiva ed è una funzionalità pro.

<br />

<a name="faq146"></a>
**(146) Come posso correggere gli orari del messaggio non corretti?**

Poiché la data/ora è opzionale e manipolabile dal mittente, FairEmail usa la data/ora di ricezione del server di default.

A volte la data/ora di ricezione del server non è corretta, principalmente perché i messaggi sono stati importati scorrettamente da un altro server e talvolta a causa di un bug nel server dell'email.

In questi rari casi, è possibile far usare a FairEmail la data o l'ora dall'intestazione *Data* (orario di invio) o <em x-id"3">Ricevuto</em> come soluzione. Questo si può modificare nelle impostazioni avanzate del profilo: Configurazione, passaggio 1, Gestione, tocca profilo, tocca Avanzate.

Questo non cambierà l'ora dei messaggi già sincronizzati. Per risolverlo, premi a lungo sulle cartelle nell'elenco della cartella e seleziona *Elimina i messaggi locali* e *Sincronizza ora*.

<br />

<a name="faq147"></a>
**(147) Cosa dovrei sapere sulle versioni di terze parti?**

Potresti venire qui perché stai usando una build di terze parti di FairEmail.

Esiste **il supporto solo** sull'ultima versione del Play Store, l'ultima release di GitHub e la build di F-Droid, ma **solo se** il numero della versione della build di F-Droid è la stessa del numero di versione dell'ultima release di GitHub.

F-Droid si costruisce irregolarmente, il che può essere problematico quando c'è un aggiornamento importante. Dunque ti si consiglia di passare alla release di GitHub.

La versione di F-Droid è costruito dallo stesso codice sorgente, ma firmato differentemente. Questo significa che tutte le funzionalità sono disponibili anche nella versione di F-Droid, eccetto per usare la procedura guidata rapida di Gmail perché Google ha approvato (e consente) solo una firma dell'app. Per tutti gli altri provider email, l'accesso OAuth è disponibile solo nelle versioni del Play Store e le release di GitHub, così come i provider email permettono solo l'uso di OAuth per le build ufficiali.

Nota che dovrai disinstallare la build di F-Droid prima di poter installare una release di GitHub perché Android rifiuta di installare la stessa app con una firma differente per motivi di sicurezza.

Nota che la versione di GitHub controllerà automaticamente gli aggiornamenti. Quando desiderato, questo è disattivabile nelle impostazioni miste.

Sei pregato di [vedere qui](https://github.com/M66B/FairEmail/blob/master/README.md#user-content-downloads) per tutte le opzioni di download.

Se hai un problema con la build di F-Droid, sei pregato di controllare che ci sia una versione più nuova di GitHub prima.

<br />

<a name="faq148"></a>
**(148) Come posso usare un profilo di Apple iCloud?**

Esiste un profilo integrato per Apple iCloud, ma se necessario puoi trovare le impostazioni giuste [qui](https://support.apple.com/en-us/HT202304).

Quando usi l'autenticazione a due fattori potresti dover usare una [password specifica dell'app](https://support.apple.com/en-us/HT204397).

<br />

<a name="faq149"></a>
**(149) Come funziona il widget di conteggio dei messaggi non letti?**

Il widget di conteggio dei messaggi non letti mostra il numero di messaggi non letti per tutti i profilo o per un profilo selezionato, ma solo per le cartelle per cui sono abilitate le notifiche del nuovo messaggio.

Toccare sulla notifica sincronizzerà tutte le cartelle per cui è abilitata la sincronizzazione e aprirà:

* the start screen when all accounts were selected
* a folder list when a specific account was selected and when new message notifications are enabled for multiple folders
* un elenco di messaggi quando un profilo specifico è stato selezionato e all'abilitazione per una cartella delle notifiche di nuovi messaggi

<br />

<a name="faq150"></a>
**(150) Puoi aggiungere l'annullamento degli inviti del calendario?**

Annullare gli inviti del calendario (rimuovere gli eventi del calendario) richiede permessi di scrittura del calendario, che risulteranno nella garanzia effettiva del permesso per leggere e scrivere *tutti* gli eventi del calendario di *tutti* i calendari.

Dato lo scopo di FairEmail, la privacy e la sicurezza, e dato che è facile rimuovere manualmente l'evento di un calendario, non è una buona idea richiedere questo permesso solo per questo motivo.

Inserire nuovi eventi del calendario può esser fatto senza permessi con [intenti](https://developer.android.com/guide/topics/providers/calendar-provider.html#intents) speciali. Sfortunatamente, non esiste alcun intento per eliminare gli eventi esistenti del calendario.

<br />

<a name="faq151"></a>
**(151) Puoi aggiungere il backup/ripristino dei messaggi?**

Un client email è inteso per leggere e scrivere i messaggi, non per il backup e ripristino dei messaggi. Nota che rompere o perdere il tuo dispositivo, significa perdere i tuoi messaggi!

Invece, il provider email/server è responsabile per i backup.

Se vuoi creare tu stesso un backup, potresti usare uno strumento come [imapsync](https://imapsync.lamiral.info/).

Se vuoi importare un file mbox a un profilo email esistente, puoi usare Thunderbird su un computer desktop e l'addon [ImportExportTools](https://addons.thunderbird.net/nl/thunderbird/addon/importexporttools/).

<br />

<a name="faq152"></a>
**(152) Come posso inserire un gruppo di contatto?**

Puoi inserire gli indirizzi email di tutti i contatti in un gruppo di contatti tramite il menu a tre puntini del compositore di messaggi.

Puoi definire i gruppi di contatti con l'app dei contatti di Android, sei pregato di vedere [qui](https://support.google.com/contacts/answer/30970) per le istruzioni.

<br />

<a name="faq153"></a>
**(153) Perché eliminare permanentemente il messaggio di Gmail non funziona?**

Potresti dover cambiare [le impostazioni IMAP di Gmail](https://mail.google.com/mail/u/0/#settings/fwdandpop) su un browser desktop per farlo funzionare:

* Quando contrassegno un messaggio in IMAP come eliminato: Auto-Expunge off - Attendi che il client aggiorni il server.
* When a message is marked as deleted and expunged from the last visible IMAP folder: Immediately delete the message forever

Nota che i messaggi archiviati sono eliminabili solo spostandoli prima alla cartella del cestino.

Qualche sfondo: Gmail sembra avere una vista aggiuntiva del messaggio per IMAP, che può essere differente dalla vista dei messaggi principale.

<br />

<a name="faq154"></a>
**~~(154) Puoi aggiungere i favicon come foto di contatto?~~**

~~ Oltre il fatto che un [favicon](https://en.wikipedia.org/wiki/Favicon) potrebbe essere condiviso da molti indirizzi email con lo stesso nome del dominio~~ ~~e dunque non correlato direttamente a un indirizzo email, i favicon sono utilizzabili per monitorarti.~~

<br />

<a name="faq155"></a>
**(155) Cos'è un file winmail.dat?**

Un file *winmail.dat* è inviato da un client di Outlook configurato in modo errato. Si tratta di un formato di file specifico di Microsoft ([TNEF](https://en.wikipedia.org/wiki/Transport_Neutral_Encapsulation_Format)) contenente un messaggio e possibilmente allegati.

Puoi trovare alcune altre informazioni su questo file [qui](https://support.mozilla.org/en-US/kb/what-winmaildat-attachment).

Puoi visualizzarlo per esempio con l'app Android [Letter Opener](https://play.google.com/store/apps/details?id=app.letteropener).

<br />

<a name="faq156"></a>
**(156) Come posso configurare un profilo Office 365?**

Un profilo Office 365 può essere configurato tramite la procedura guidata rapida e selezionando *Office 365 (OAuth)>*.

Se la procedura guidata si conclude con *AUTHENTICATE failed*, IMAP e/o SMTP potrebbe essere disabilitato per il profilo. In questo caso dovresti chiedere all'amministratore di abilitare IMAP e SMTP. La procedura è documentata [qui](https://docs.microsoft.com/en-in/exchange/troubleshoot/configure-mailboxes/pop3-imap-owa-activesync-office-365).

Se hai abilitato i *predefiniti di sicurezza* nella tua organizzazione, potresti dover abilitare il protocollo SMTP AUTH. Sei pregato di [vedere qui](https://docs.microsoft.com/en-us/exchange/clients-and-mobile-in-exchange-online/authenticated-client-smtp-submission) come farlo.

<br />

<a name="faq157"></a>
**(157) Come posso configurare un profilo Free.fr?**

Siete pregati di [vedere qui](https://free.fr/assistance/597.html) per le istruzioni.

**SMTP è disattivato di default**, sei pregato di [vedere qui](https://free.fr/assistance/2406.html) come attivarlo.

Siete pregati di [vedere qui](http://jc.etiemble.free.fr/abc/index.php/trucs-astuces/configurer-smtp-free-fr) per una guida dettagliata.

<br />

<a name="faq103"></a>
<a name="faq158"></a>
**(158) Che fotocamera / registratore audio consigli?**

Per scattare foto e registrare audio è necessaria un'app fotocamera e una di registrazione audio. Le seguenti app sono registratori audio e fotocamere open source:

* [Open Camera](https://play.google.com/store/apps/details?id=net.sourceforge.opencamera) ([F-Droid](https://f-droid.org/en/packages/net.sourceforge.opencamera/))
* [Audio Recorder versione 3.3.24+](https://play.google.com/store/apps/details?id=com.github.axet.audiorecorder) ([F-Droid](https://f-droid.org/packages/com.github.axet.audiorecorder/))

Per registrare le note vocali, etc, il registratore audio deve supportare [MediaStore.Audio.Media.RECORD_SOUND_ACTION](https://developer.android.com/reference/android/provider/MediaStore.Audio.Media#RECORD_SOUND_ACTION). Stranamente, gran parte dei registratori audio sembra non supportare quest'azione Android standard.

<br />

<a name="faq159"></a>
**(159) Cosa sono gli elenchi di protezione del monitor di Disconnect?**

Sei pregato di vedere [qui](https://disconnect.me/trackerprotection) per ulteriori informazioni sugli elenchi di protezione del monitor di Disconnect.

Dopo il download degli elenchi nelle impostazioni di privacy, gli possono opzionalmente essere usati:

* per avvisare sui collegamenti di monitoraggio all'apertura dei collegamenti
* per riconoscere le immagini di monitoraggio nei messaggi

Le immagini di monitoraggio saranno disabilitati solo se l'opzione 'disabilita' principale corrispondente è abilitata.

Il monitoraggio delle immagini non sarà riconosciuto alla classificazione del dominio come '*Contenuto*', vedi [qui](https://disconnect.me/trackerprotection#trackers-we-dont-block) per ulteriori informazioni.

Questo comando è inviabile a FairEmail da un'app di automazione per aggiornare gli elenchi di protezione:

```
(adb shell) am startservice -a eu.faircode.email.DISCONNECT.ME
```

Aggiornare una volta a settimana sarà probabilmente abbastanza, sei pregato di vedere [qui](https://github.com/disconnectme/disconnect-tracking-protection/commits/master) per le modifiche recenti agli elenchi.

<br />

<a name="faq160"></a>
**(160) Puoi aggiungere l'eliminazione permanente dei messaggi senza conferma?**

L'eliminazione permanente significa che i messaggi saranno persi *irreversibilmente* e per prevenire che si verifichi accidentalmente, questa deve essere sempre confermata. Anche con una conferma, alcune persone molto arrabbiate che hanno perso alcuni dei loro messaggi per colpa propria mi hanno contattato, un'esperienza alquanto spiacevole :-(

Avanzate: il flag di eliminazione di IMAP insieme al comando EXPUNGE non è supportabile perché sia i server email che non tutte le persone possono gestirlo, rischiando la perdita imprevista dei messaggi. Un fattore complicante è che non tutti i server email supportano [UID EXPUNGE](https://tools.ietf.org/html/rfc4315).

<br />

<a name="faq161"></a>
**(161) Puoi aggiungere un'impostazione per cambiare il colore primario e secondario?***

Se potessi, aggiungere un'impostazione per selezionare colori primari e secondari subito, ma sfortunatamente i temi di Android sono fissi, vedi [qui](https://stackoverflow.com/a/26511725/1794097) ad esempio, quindi è impossibile.

<br />

<a name="faq162"></a>
**(162) IMAP NOTIFY è supportato?***

Sì, [IMAP NOTIFY](https://tools.ietf.org/html/rfc5465) è stato supportato dalla versione 1.1413.

Il supporto di IMAP NOTIFY significa che le notifiche per i messaggi aggiunti, modificati o eliminati di tutte le cartelle *iscritte* saranno richieste e se una notifica è ricevuta per una cartella iscritta, quella sarà sincronizzata. La sincronizzazione per le cartelle iscritte può dunque essere disabilitata, salvando le connessioni della cartella al server email.

**Importante**: i messaggi push (=sempre sincronizzati) per la casella di posta in arrivo e la gestione dell'abbonamento (impostazioni di ricevimento) devono essere abilitati.

**Importante**: gran parte dei server email non lo supportano! Puoi controllare il registro tramite il menu di navigazione se un server email supporta la funzionalità NOTIFY.

<br />

<a name="faq163"></a>
**(163) Cos'è la classificazione del messaggio?**

*This is an experimental feature!*

Message classification will attempt to automatically group emails into classes, based on their contents, using [Bayesian statistics](https://en.wikipedia.org/wiki/Bayesian_statistics). Nel contesto di FairEmail, una cartella è una classe. So, for example, the inbox, the spam folder, a 'marketing' folder, etc, etc.

Puoi abilitare la classificazione dei messaggi nelle impostazioni miste. Questo abiliterà la modalità di solo apprendimento.

Ogni cartella ha un'opzione per abilitare la classificazione automatica dei messaggi. Quando è attivato, i nuovi messaggi in altre cartelle che il classificatore pensa appartengano a quella cartella saranno spostati automaticamente.

The option *Use local spam filter* turns on message classification and auto classification for the spam folder. Please understand that this is not a replacement for the spam filter of the email server and can result in false positives. See also [this FAQ](#user-content-faq92).

A practical example: suppose there is a folder 'marketing' and auto message classification is enabled for this folder. Each time you move a message into this folder you'll train FairEmail that similar messages belong in this folder. Each time you move a message out of this folder you'll train FairEmail that similar messages do not belong in this folder. After moving some messages into the folder, FairEmail will start to move messages automatically into this folder. This will work best with similar messages.

Classification should be considered as a best guess - it might be a wrong guess, or the classifier might not be confident enough to make any guess. If the classifier is unsure, it will simply leave an email where it is.

Classification will be done for new messages in the inbox, spam folder and user folders only. You can clear local messages (long press a folder in the folder list of an account) and synchronize the messages again to classify existing messages.

Moving a message on the device will reclassify the message. Moving a message with another email client will not result in reclassification because IMAP does not support 'moved' notifications.

To prevent the email server from moving a message into the spam folder again and again, auto classification out of the spam folder will not be done.

Classification is optimized to use as little resources as possible, but will inevitably use some extra battery power.

You can delete all classification data by turning classification three times off.

<br />

## Ricevi supporto

FairEmail is supported on smartphones, tablets and ChromeOS only.

Only the latest Play store version and latest GitHub release are supported. The F-Droid build is supported only if the version number is the same as the version number of the latest GitHub release. This also means that downgrading is not supported.

There is no support on things that are not directly related to FairEmail.

There is no support on building and developing things by yourself.

Requested features should:

* essere utili a gran parte delle persone
* non complicare l'uso di FairEmail
* adattarsi alla filosofia di FairEmail (orientata alla privacy e la siucrezza)
* conformarsi agli standard comuni (IMAP, SMTP, etc.)

Features not fulfilling these requirements will likely be rejected. This is also to keep maintenance and support in the long term feasible.

If you have a question, want to request a feature or report a bug, please use [this form](https://contact.faircode.eu/?product=fairemailsupport).

GitHub issues are disabled due to frequent misusage.

<br />

Copyright &copy; 2018-2021 Marcel Bokhorst.
