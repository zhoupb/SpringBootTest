package com.example.designPattern.structural_type.facade;

/**
 * @author: zhoupb
 * @Description: 外观模式测试类
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建智能音箱对象
        SmartApplicationFacade facade = new SmartApplicationFacade();
        // 控制家电
        facade.say("打开家电");

        System.out.println("===========");

        facade.say("关闭家电");
    }
}
