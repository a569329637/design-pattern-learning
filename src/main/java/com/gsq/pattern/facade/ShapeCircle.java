package com.gsq.pattern.facade;

/**
 * 外观模式
 */
public class ShapeCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle draw");
    }
}
