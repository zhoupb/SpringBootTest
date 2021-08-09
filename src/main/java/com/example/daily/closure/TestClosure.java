package com.example.daily.closure;

/**
 * @author: zhoupb
 * @Description: 测试java中的闭包
 * @since: version 1.0
 */
public class TestClosure {


    public static void main(String[] args) {
        Food food = new Food();

//        food.getEat().eat();
//        food.currentNum();
//
//        food.getEat().eat();
//        food.currentNum();

        //在内部类是public修饰时，可以通过以下方式
        Food foodPub = new Food();
        Food.EatActive eat = foodPub.new EatActive();
        eat.eat();// 吃货，你吃了一份了
        foodPub.currentNum(); // 还剩:19份

        eat.eat(); // 吃货，你吃了一份了
        foodPub.currentNum(); // 还剩:18份
    }
}
