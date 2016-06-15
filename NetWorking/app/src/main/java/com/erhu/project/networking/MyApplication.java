package com.erhu.project.networking;

import android.app.Application;

/**
 * Created by erhu on 2016/6/15.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitUtil.instanceHttpService(getApplicationContext());
    }
}
