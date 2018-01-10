package com.ruiqin.designpattern.builder;

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

    private ParkBuilder(Builder builder) {
        sectionId = builder.sectionId;
        berthCode = builder.berthCode;
        carPlate = builder.carPlate;
    }

    public static class Builder {

        private String sectionId;
        private String berthCode;
        private String carPlate;

        public Builder() {

        }

        public Builder setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }

        public Builder setBerthCode(String berthCode) {
            this.berthCode = berthCode;
            return this;
        }

        public Builder setCarPlate(String carPlate) {
            this.carPlate = carPlate;
            return this;
        }

        public ParkBuilder builder() {
            return new ParkBuilder(this);
        }
    }

}



