package com.example.ruiqin.designpattern.builder;

import android.content.Intent;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2017/12/29
 * 版权所有：深圳市亿车科技有限公司
 */

public class ParkBuilder {

    private String sectionId;
    private String berthCode;
    private String carPlate;

    private ParkBuilder() {

    }

    public static class Builder {

        private final ParkBuilder mParkBuilder;
        private final Intent mIntent;

        public Builder() {
            mParkBuilder = new ParkBuilder();
            mIntent = new Intent();
        }

        public Builder setSectionId(String sectionId) {
            mParkBuilder.sectionId = sectionId;
            return this;
        }

        public Builder setBerthCode(String berthCode) {
            mParkBuilder.berthCode = berthCode;
            return this;
        }

        public Builder setCarPlate(String carPlate) {
            mParkBuilder.carPlate = carPlate;
            return this;
        }

        public ParkBuilder builder() {
            return this.mParkBuilder;
        }

    }

}



