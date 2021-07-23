package com.example.designPattern.structural_type.flyweight;

/**
 * @author: zhoupb
 * @Description: L形状，具体享元角色
 * @since: version 1.0
 */
public class LBox extends AbstractBox {
    @Override
    public String getShape() {
        return "L";
    }
}
