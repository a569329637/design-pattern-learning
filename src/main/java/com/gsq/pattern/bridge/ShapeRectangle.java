package com.gsq.pattern.bridge;

/**
 * 桥接模式
 */
public class ShapeRectangle extends Shape {
    public void draw() {
        color.bepaint("长方形");
    }
}
