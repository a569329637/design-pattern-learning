package com.gsq.pattern.builder.impl;

/**
 * 建造者模式：可口可乐
 */
public class CocaCola extends ColdDrink {
    public String name() {
        return "可口可乐";
    }

    public float price() {
        return 30.0f;
    }
}
