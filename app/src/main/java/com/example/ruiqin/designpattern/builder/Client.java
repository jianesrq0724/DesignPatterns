package com.example.ruiqin.designpattern.builder;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2017/12/30
 * 版权所有：深圳市亿车科技有限公司
 */

public class Client {

}

class Product {
    private String name;
    private String type;

    public void showProduct() {
        System.out.println("名称：" + name);
        System.out.println("型号：" + type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }


}

