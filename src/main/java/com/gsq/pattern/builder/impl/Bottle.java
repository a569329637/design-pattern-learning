package com.gsq.pattern.builder.impl;

import com.gsq.pattern.builder.inter.Packing;

/**
 * 建造者模式：瓶装
 */
public class Bottle implements Packing {
    public String pack() {
        return "瓶装";
    }
}
