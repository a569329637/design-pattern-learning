package com.gsq.pattern.builder.impl;

import com.gsq.pattern.builder.inter.Item;
import com.gsq.pattern.builder.inter.Packing;

/**
 * 建造者模式：汉堡
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
