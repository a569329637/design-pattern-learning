package com.gsq.pattern.bridge;

/**
 * 桥接模式
 */
public class ColorGray implements Color {
    public void bepaint(String shapeName) {
        System.out.println("灰色的 " + shapeName);
    }
}
