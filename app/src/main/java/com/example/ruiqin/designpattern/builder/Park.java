package com.example.ruiqin.designpattern.builder;

import android.content.Intent;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2017/12/29
 * 版权所有：深圳市亿车科技有限公司
 */

public class Park {

    private String sectionId;
    private String berthCode;
    private String carPlate;

    private Park() {

    }

    public static class Builder {

        private final Park park;
        private final Intent mIntent;

        public Builder() {
            park = new Park();
            mIntent = new Intent();
        }

        public Builder setSectionId(String sectionId) {
            park.sectionId = sectionId;
            return this;
        }

        public Builder setBerthCode(String berthCode) {
            park.berthCode = berthCode;
            return this;
        }

        public Builder setCarPlate(String carPlate) {
            park.carPlate = carPlate;
            return this;
        }

        public void builder() {
            mIntent.putExtra("sectionId", park.sectionId);
            mIntent.putExtra("berthCode", park.berthCode);

        }

    }

}



