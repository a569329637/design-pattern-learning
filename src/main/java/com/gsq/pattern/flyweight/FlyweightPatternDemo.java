package com.gsq.pattern.flyweight;

/**
 * 享元模式
 *
 * 注意内部状态和外部状态的划分，否则会引起线程安全问题
 */
public class FlyweightPatternDemo {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            ShapeCircle circle = (ShapeCircle)ShapeFactory.getShapeCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
