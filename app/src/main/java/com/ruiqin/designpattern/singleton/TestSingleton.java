package com.ruiqin.designpattern.singleton;

import com.ruiqin.designpattern.MyApplication;
import com.ruiqin.designpattern.utils.ToastUtils;

/**
 * 功能：单例
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/10
 * 版权所有：深圳市亿车科技有限公司
 */

public class TestSingleton {
    private TestSingleton() {

    }

    public static final TestSingleton getInstance() {
        return SingleHolder.INSTANCE;
    }

    private static class SingleHolder {
        private static final TestSingleton INSTANCE = new TestSingleton();
    }

    public void test1() {
        ToastUtils.showShort(MyApplication.getAppContext(), "当前" + getInstance().toString());
    }
}
