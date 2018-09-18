package com.gsq.pattern.bridge;

/**
 * 桥接模式
 * http://www.cnblogs.com/chenssy/p/3317866.html
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Color white = new ColorWhite();
        Shape circle = new ShapeCircle();
        circle.setColor(white);
        circle.draw();
        Shape rectangle = new ShapeRectangle();
        rectangle.setColor(white);
        rectangle.draw();

        Color black = new ColorBlack();
        Shape square = new ShapeSquare();
        square.setColor(black);
        square.draw();
    }
}
