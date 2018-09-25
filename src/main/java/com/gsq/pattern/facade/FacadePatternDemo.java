package com.gsq.pattern.facade;

/**
 * 外观模式
 */
public class FacadePatternDemo {
    public static void main(String[] args) {

        // 如果直接调用时这样的
//        Shape circle = new ShapeCircle();
//        circle.draw();
//        Shape rectangle = new ShapeRectangle();
//        rectangle.draw();
//        Shape square = new ShapeSquare();
//        square.draw();

        // 通过ShapeFacade调用时这样的，影藏了一些细节，让调用更加容易
        ShapeFacade facade = new ShapeFacade();
        facade.draw();
    }
}
