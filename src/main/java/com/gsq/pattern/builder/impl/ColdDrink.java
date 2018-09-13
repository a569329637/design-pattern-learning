package com.gsq.pattern.builder.impl;

import com.gsq.pattern.builder.inter.Item;
import com.gsq.pattern.builder.inter.Packing;

/**
 * 建造者模式：冷饮
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }
}
