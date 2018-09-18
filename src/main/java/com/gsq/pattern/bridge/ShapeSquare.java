package com.gsq.pattern.bridge;

/**
 * 桥接模式
 */
public class ShapeSquare extends Shape {
    public void draw() {
        color.bepaint("正方形");
    }
}
