package com.pinnoocle.weshare;

import android.app.Application;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtils.init(this);
    }
}
