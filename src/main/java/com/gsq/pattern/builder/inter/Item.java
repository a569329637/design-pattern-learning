package com.gsq.pattern.builder.inter;

/**
 * 建造者模式：实物条目接口
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
