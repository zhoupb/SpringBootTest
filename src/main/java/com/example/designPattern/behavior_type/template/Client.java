package com.example.designPattern.behavior_type.template;

/**
 * @author: zhoupb
 * @Description: 模板模式测试类
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {

        // 炒包菜
        // 创建对象
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        // 调用炒菜的功能
        baoCai.cookProcess();

        System.out.println("--------------------------------");
        // 炒菜心
        // 创建对象
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        // 调用炒菜的功能
        caiXin.cookProcess();
    }
}
