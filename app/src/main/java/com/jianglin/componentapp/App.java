package com.jianglin.componentapp;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: Jianglin
 * Time: 2021/2/2
 * Description: todo
 *
 * @author jiang
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
