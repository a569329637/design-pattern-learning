package com.gsq.pattern.builder.impl;

/**
 * 建造者模式：百事可乐
 */
public class Pepsi extends ColdDrink {

    public String name() {
        return "百事可乐";
    }

    public float price() {
        return 35.0f;
    }
}
