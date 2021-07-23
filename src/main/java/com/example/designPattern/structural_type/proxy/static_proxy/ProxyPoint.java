package com.example.designPattern.structural_type.proxy.static_proxy;

/**
 * @author: zhoupb
 * @Description: 代售点
 * @since: version 1.0
 */
public class ProxyPoint implements SellTickets {

    private static TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些费用");
        trainStation.sell();
    }
}
