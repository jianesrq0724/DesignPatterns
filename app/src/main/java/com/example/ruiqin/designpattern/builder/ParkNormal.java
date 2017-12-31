package com.example.ruiqin.designpattern.builder;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2017/12/29
 * 版权所有：深圳市亿车科技有限公司
 */

public class ParkNormal {


    /**
     * @param sectionId
     * @param berthCode
     * @param carPlate
     */
    private void applyPark(String sectionId, String berthCode, String carPlate) {
        applyPark(sectionId, berthCode, carPlate, "");
    }

    private void applyPark(String sectionId, String berthCode, String carPlate, String vehicleType) {
        applyPark(sectionId, berthCode, carPlate, vehicleType, "");
    }

    private void applyParkCarColor(String sectionId, String berthCode, String carPlate, String carColor) {
        applyPark(sectionId, berthCode, carPlate, "", carColor);
    }

    private void applyPark(String sectionId, String berthCode, String carPlate, String vehicleType, String carColor) {
        applyPark(sectionId, berthCode, carPlate, vehicleType, carColor, 0);
    }

    private void applyPark(String sectionId, String berthCode, String carPlate, String vehicleType, String carColor, int carStartTime) {
        applyPark2(sectionId, berthCode, carPlate, vehicleType, carColor, carStartTime, 0);
    }

    private void applyPark2(String sectionId, String berthCode, String carPlate, String vehicleType, String carColor, int carStartTime, int prepareTime) {
        //业务逻辑处理
        String message = sectionId + berthCode + carPlate + vehicleType + carColor + carStartTime + prepareTime;
        System.out.println("申请停车" + message);
    }


}
