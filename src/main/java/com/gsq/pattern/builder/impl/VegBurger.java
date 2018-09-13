package com.gsq.pattern.builder.impl;

/**
 * 建造者模式：蔬菜汉堡
 */
public class VegBurger extends Burger {

    public String name() {
        return "蔬菜汉堡";
    }

    public float price() {
        return 25.0f;
    }
}
