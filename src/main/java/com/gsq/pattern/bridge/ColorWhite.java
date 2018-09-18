package com.gsq.pattern.bridge;

/**
 * 桥接模式
 */
public class ColorWhite implements Color {
    public void bepaint(String shapeName) {
        System.out.println("白色的 " + shapeName);
    }
}
