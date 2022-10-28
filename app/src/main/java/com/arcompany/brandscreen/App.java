package com.arcompany.brandscreen;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        HelperReceiver receiver = new HelperReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_USER_PRESENT);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        filter.addAction(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_RUN);
        filter.addAction(Intent.ACTION_BOOT_COMPLETED);
        registerReceiver(receiver, filter);

    }
}
