package com.gsq.pattern.decorator;

/**
 * 装饰器模式
 *
 * 这里有一个红色的装饰器（ShapeRedDecorator）
 * 它可以用来装饰圆形（ShapeCircle）
 * 也可以用来装饰矩形（ShapeRectangle）
 *
 * 当然也创建更多的装饰器，比如（绿色）ShapeGreenDecorator，（实线）ShapeSolidLineDecorator
 * 用它们来装饰圆形或矩形
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new ShapeCircle();
        circle.draw();
        System.out.println("---");
        Shape redCircle = new ShapeRedDecorator(circle);
        redCircle.draw();

        System.out.println("\n");

        Shape rectangle = new ShapeRectangle();
        rectangle.draw();
        System.out.println("---");
        Shape redRectangle = new ShapeRedDecorator(rectangle);
        redRectangle.draw();
    }
}
