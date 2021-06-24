package com.example.designPattern.singleton.demo2;

/**
 * @author: zhoupb
 * @Description: 饿汉式：静态成员变量方式
 * @since: version 1.0
 */
public class Singleton {

    /**
     * 私有构造方法
     */
    private Singleton() {
    }

    /**
     * 在本类中创建本类对象
     */
    private static Singleton instance = new Singleton();

    /**
     * 提供一个公共的访问方式，让外界获取该对象
     */
    public static Singleton getInstance() {
        return instance;
    }


}
