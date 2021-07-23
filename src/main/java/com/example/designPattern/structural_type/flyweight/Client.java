package com.example.designPattern.structural_type.flyweight;

/**
 * @author: zhoupb
 * @Description: 享元模式测试类
 * @since: version 1.0
 */
public class Client {


    public static void main(String[] args) {

        AbstractBox box1 = BoxFactory.getInstance().getInstance("L");
        box1.display("红色");

        AbstractBox box2 = BoxFactory.getInstance().getInstance("O");
        box1.display("白色");

        AbstractBox box3 = BoxFactory.getInstance().getInstance("S");
        box1.display("灰色");

        AbstractBox box4 = BoxFactory.getInstance().getInstance("S");
        box1.display("蓝色");

        System.out.println(box3 == box4);
    }
}
