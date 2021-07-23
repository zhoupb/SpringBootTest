package com.example.designPattern.create_type.factory.before;

/**
 * @author: zhoupb
 * @Description: 咖啡
 * @since: version 1.0
 */
public abstract class Coffee {

    public abstract String getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加奶");
    }
}
