package com.example.designPattern.create_type.factory.abstract_factory;

/**
 * @author: zhoupb
 * @Description: 甜品工厂类
 * @since: version 1.0
 */
public interface DessertFactory {

    Dessert createDessert();

    Coffee createCoffee();
}
