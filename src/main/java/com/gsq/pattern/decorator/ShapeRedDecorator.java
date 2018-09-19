package com.gsq.pattern.decorator;

/**
 * 装饰器模式
 */
public class ShapeRedDecorator extends ShapeDecorator {

    public ShapeRedDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.println("border color: red");
        super.draw();
    }
}
