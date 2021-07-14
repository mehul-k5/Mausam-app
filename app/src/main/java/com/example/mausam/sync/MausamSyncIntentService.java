package com.example.mausam.sync;

//import android.app.IntentService;
import android.app.IntentService;
import android.content.Intent;
/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 */
public class MausamSyncIntentService extends IntentService {
    public MausamSyncIntentService() { super("SunshineSyncIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        MausamSyncTask.syncWeather(this);
    }
}
