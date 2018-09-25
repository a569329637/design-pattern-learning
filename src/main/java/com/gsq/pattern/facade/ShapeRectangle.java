package com.gsq.pattern.facade;

/**
 * 外观模式
 */
public class ShapeRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle draw");
    }
}
