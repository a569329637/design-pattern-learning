package com.gsq.pattern.facade;

/**
 * 外观模式
 */
public class ShapeFacade {
    public void draw() {
        Shape circle = new ShapeCircle();
        circle.draw();

        Shape rectangle = new ShapeRectangle();
        rectangle.draw();

        Shape square = new ShapeSquare();
        square.draw();
    }
}
