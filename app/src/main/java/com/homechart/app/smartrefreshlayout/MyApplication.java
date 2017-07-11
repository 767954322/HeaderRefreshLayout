package com.homechart.app.smartrefreshlayout;

import android.app.Application;
import android.os.Build;
import android.os.StrictMode;

/**
 * Created by gumenghao on 17/5/17.
 */

public class MyApplication extends Application {

    private static MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
        }
        myApplication = this;
    }


    public static synchronized MyApplication getInstance() {
        if (myApplication == null) {
            myApplication = new MyApplication();
        }
        return myApplication;
    }
}
