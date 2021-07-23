package com.example.designPattern.structural_type.flyweight;

import java.util.HashMap;

/**
 * @author: zhoupb
 * @Description: BoxFactory
 * @since: version 1.0
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    /**
     * 在构造方法中进行初始化操作
     */
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("L", new LBox());
        map.put("O", new OBox());
        map.put("S", new SBox());
    }

    private static BoxFactory factory = new BoxFactory();

    /**
     * 提供一个方法获取该工厂的对象
     */
    public static BoxFactory getInstance() {
        return factory;
    }

    /**
     * 根据名称获取图形对象
     */
    public AbstractBox getInstance(String name) {
        return map.get(name);
    }
}
