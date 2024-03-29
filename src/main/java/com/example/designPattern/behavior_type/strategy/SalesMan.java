package com.example.designPattern.behavior_type.strategy;

/**
 * @author: zhoupb
 * @Description: 促销员(环境类)
 * @since: version 1.0
 */
public class SalesMan {

    /**
     *  聚合策略类对象
     */
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 由促销员展示促销活动给用户
     */
    public void salesManShow(){
        strategy.show();
    }
}
