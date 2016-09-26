package com.example.kranthi.servicesstarterservices;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by kranthi on 9/25/2016.
 */
public class SecondService extends IntentService {
    public SecondService() {
        super("My second service");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(SecondService.this, "Service created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(SecondService.this, "Service started", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(SecondService.this, "service stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("service info:", "message from second service type");

    }
}
