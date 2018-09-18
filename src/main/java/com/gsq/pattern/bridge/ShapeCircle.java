package com.gsq.pattern.bridge;

/**
 * 桥接模式
 */
public class ShapeCircle extends Shape {

    public void draw() {
        color.bepaint("圆形");
    }
}
