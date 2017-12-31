package com.example.ruiqin.designpattern.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/1
 * 版权所有：深圳市亿车科技有限公司
 */

public class ToastUtils {


    private static Toast sToast;

    public static void showShort(Context context, String message) {
        if (sToast == null) {
            sToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        } else {
            sToast.setText(message);
        }
        sToast.show();
    }
}
