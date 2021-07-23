package com.example.designPattern.structural_type.combination;

/**
 * @author: zhoupb
 * @Description: 菜单项类：属于叶子节点
 * @since: version 1.0
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        // 打印菜单项的名称
        System.out.println(name);
    }
}
