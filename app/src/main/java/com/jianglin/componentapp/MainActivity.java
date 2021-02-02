package com.jianglin.componentapp;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jianglin.libcommon.BaseActivity;
import com.jianglin.libexpa.BusaPath;
import com.jianglin.libexpb.BusbPath;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getHandler().postDelayed(() -> ARouter.getInstance().build(BusaPath.BUSA).navigation(MainActivity.this,
                new NavCallback() {
                    @Override
                    public void onArrival(Postcard postcard) {
                        MainActivity.this.finish();
                    }
                }), 5000);
    }

    @Override
    protected String tag() {
        return TAG;
    }

    public void gotoa(View view) {
        ARouter.getInstance().build(BusaPath.BUSA).navigation(this);
    }

    public void gotob(View view) {
        ARouter.getInstance().build(BusbPath.BUSB).navigation(this);
    }
}