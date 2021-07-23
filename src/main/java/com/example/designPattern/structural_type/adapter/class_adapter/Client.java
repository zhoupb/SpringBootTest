package com.example.designPattern.structural_type.adapter.class_adapter;

/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的数据
        String sdMsg = computer.readSD(new SDCardImpl());
        System.out.println(sdMsg);

        System.out.println("===============");

        // 使用该电脑读取TF卡中的数据
        // 定义适配器类
        String tfMsg = computer.readSD(new SDAdaoterTF());
        System.out.println(tfMsg);
    }
}
