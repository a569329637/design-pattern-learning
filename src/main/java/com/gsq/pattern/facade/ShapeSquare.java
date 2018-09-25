package com.gsq.pattern.facade;

/**
 * 外观模式
 */
public class ShapeSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("square draw");
    }
}
