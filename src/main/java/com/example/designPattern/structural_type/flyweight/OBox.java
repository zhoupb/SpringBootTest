package com.example.designPattern.structural_type.flyweight;

/**
 * @author: zhoupb
 * @Description: O形状，具体享元角色
 * @since: version 1.0
 */
public class OBox extends AbstractBox {
    @Override
    public String getShape() {
        return "O";
    }
}
