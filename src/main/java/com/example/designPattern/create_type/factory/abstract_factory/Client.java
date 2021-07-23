package com.example.designPattern.create_type.factory.abstract_factory;


/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();

        Coffee italyDessertFactoryCoffee = italyDessertFactory.createCoffee();
        System.out.println(italyDessertFactoryCoffee.getName());
        Dessert italyDessertFactoryDessert = italyDessertFactory.createDessert();
        italyDessertFactoryDessert.show();

        System.out.println("---------------------------------------");

        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        Coffee americanDessertFactoryCoffee = americanDessertFactory.createCoffee();
        System.out.println(americanDessertFactoryCoffee.getName());
        Dessert americanDessertFactoryDessert = americanDessertFactory.createDessert();
        americanDessertFactoryDessert.show();
    }
}
