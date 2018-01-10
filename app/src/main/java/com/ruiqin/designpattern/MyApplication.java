package com.ruiqin.designpattern;

import android.app.Application;
import android.content.Context;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/10
 * 版权所有：深圳市亿车科技有限公司
 */

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        mContext = this;
        super.onCreate();
    }

    public static Context getAppContext() {
        return mContext;
    }
}
