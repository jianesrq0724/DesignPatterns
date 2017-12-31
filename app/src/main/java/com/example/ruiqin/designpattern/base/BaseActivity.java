package com.example.ruiqin.designpattern.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/1
 * 版权所有：深圳市亿车科技有限公司
 */

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        initData();
        initView();

    }

    protected abstract void initData();

    protected abstract void initView();

    /**
     * 获取布局id
     *
     * @return
     */
    public abstract int getLayoutId();


}
