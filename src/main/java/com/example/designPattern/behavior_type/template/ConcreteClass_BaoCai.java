package com.example.designPattern.behavior_type.template;

/**
 * @author: zhoupb
 * @Description: 炒包菜类
 * @since: version 1.0
 */
public class ConcreteClass_BaoCai extends AbstractClass {


    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的调料是辣椒");

    }
}
