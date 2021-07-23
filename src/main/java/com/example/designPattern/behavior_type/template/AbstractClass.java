package com.example.designPattern.behavior_type.template;

/**
 * @author: zhoupb
 * @Description: 抽象类(定义模板方法和基本方法)
 * @since: version 1.0
 */
public abstract class AbstractClass {

    /**
     * 定义模板方法
     */
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    /**
     * 第一步：倒油是一样的，所以直接实现
     */
    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 第二步：热油是一样的，所以直接实现
     */
    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 第三步：倒蔬菜是不一样的
     */
    public abstract void pourVegetable();

    /**
     * 第四步：倒调味料是不一样的
     */
    public abstract void pourSauce();

    /**
     * 第五步：翻炒是一样的，所以直接实现
     */
    public void fry() {
        System.out.println("炒啊炒熟了");
    }
}
