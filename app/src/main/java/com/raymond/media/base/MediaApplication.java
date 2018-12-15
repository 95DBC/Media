package com.raymond.media.base;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Create by Raymond on 2018/11/28
 * Description:
 */
public class MediaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CrashReport.initCrashReport(getApplicationContext(), "755e119db2", false);
    }
}
