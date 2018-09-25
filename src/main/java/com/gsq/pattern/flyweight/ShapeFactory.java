package com.gsq.pattern.flyweight;

import java.util.Hashtable;

/**
 * 享元模式
 */
public class ShapeFactory {
    private static final Hashtable<String, Shape> circleMaps = new Hashtable<>();

    public static Shape getShapeCircle(String color) {
        Shape shape = circleMaps.get(color);
        if (null == shape) {
            shape = new ShapeCircle(color);
            circleMaps.put(color, shape);
            System.out.println("create shapecircle of color: " + color);
        }
        return shape;
    }
}
