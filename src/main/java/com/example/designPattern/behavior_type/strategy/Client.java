package com.example.designPattern.behavior_type.strategy;

/**
 * @author: zhoupb
 * @Description: 策略模式测试类
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 春节到了，使用春节促销活动
        SalesMan salesMan = new SalesMan(new StrategyA());
        // 展示促销活动
        salesMan.salesManShow();
        System.out.println("----------------");

        // 中秋节到了，使用中秋节促销活动
        salesMan = new SalesMan(new StrategyB());
        // 展示促销活动
        salesMan.salesManShow();
        System.out.println("-------------------------");

        // 圣诞节到了，使用圣诞节促销活动
        salesMan = new SalesMan(new StrategyC());
        // 展示促销活动
        salesMan.salesManShow();
    }
}
