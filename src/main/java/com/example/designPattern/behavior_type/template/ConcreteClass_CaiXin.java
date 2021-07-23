package com.example.designPattern.behavior_type.template;

/**
 * @author: zhoupb
 * @Description: 炒菜心类
 * @since: version 1.0
 */
public class ConcreteClass_CaiXin extends AbstractClass {


    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的调料是胡椒粉");

    }
}
