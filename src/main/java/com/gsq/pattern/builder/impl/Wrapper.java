package com.gsq.pattern.builder.impl;

import com.gsq.pattern.builder.inter.Packing;

/**
 * 建造者模式：纸盒装
 */
public class Wrapper implements Packing {
    public String pack() {
        return "纸盒装";
    }
}
