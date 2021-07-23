package com.example.designPattern.structural_type.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhoupb
 * @Description: 菜单类：属于树枝节点
 * @since: version 1.0
 */
public class Menu extends MenuComponent {

    // 菜单可以有多个子菜单或者子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        // 打印菜单名称
        System.out.println(name);

        // 打印子菜单或者子菜单项名称
        for (MenuComponent component : menuComponentList) {
            component.print();
        }

    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }
}
