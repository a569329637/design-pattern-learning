package com.gsq.pattern.bridge;

/**
 * 桥接模式
 */
public class ColorBlack implements Color {
    public void bepaint(String shapeName) {
        System.out.println("黑色的 " + shapeName);
    }
}
