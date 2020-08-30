package com.example.rongcloud_android_imdemo_import;

import android.app.Application;

import io.rong.imkit.RongIM;

public class RongApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RongIM.init(this);


    }
}
