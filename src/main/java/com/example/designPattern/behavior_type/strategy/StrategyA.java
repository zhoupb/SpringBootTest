package com.example.designPattern.behavior_type.strategy;

/**
 * @author: zhoupb
 * @Description: 具体策略类，封装算法
 * @since: version 1.0
 */
public class StrategyA extends Strategy{

    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
