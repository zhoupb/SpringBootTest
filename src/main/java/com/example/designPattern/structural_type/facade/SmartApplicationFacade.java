package com.example.designPattern.structural_type.facade;

/**
 * @author: zhoupb
 * @Description: 外观类: 用户主要和该类对象进行交互
 * @since: version 1.0
 */
public class SmartApplicationFacade {

    /**
     * 聚合电灯对象，电视对象，空调对象
     */
    private Light light;
    private TV tv;
    private AirConditioner airConditioner;

    public SmartApplicationFacade(){
        this.light = new Light();
        this.tv = new TV();
        this.airConditioner = new AirConditioner();
    }

    /**
     * 通过语言控制
     */
    public void  say(String msg){
        if (msg.contains("打开")){
            on();
        }else if (msg.contains("关闭")){
            off();
        }else {
            System.out.println("我还听不懂你说的~~~");
        }
    }

    /**
     * 一键打开功能
     */
    private void on(){
        light.on();
        tv.on();
        airConditioner.on();
    }

    /**
     * 一键关闭功能
     */
    private void off(){
        light.off();
        tv.off();
        airConditioner.off();
    }
}
