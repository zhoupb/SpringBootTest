package com.example.designPattern.create_type.factory.before;

/**
 * @author: zhoupb
 * @Description: 咖啡店
 * @since: version 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("不存在");
        }

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
