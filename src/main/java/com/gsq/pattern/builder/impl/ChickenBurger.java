package com.gsq.pattern.builder.impl;

/**
 * 建造者模式：鸡肉汉堡
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "鸡肉汉堡";
    }

    public float price() {
        return 50.5f;
    }
}
