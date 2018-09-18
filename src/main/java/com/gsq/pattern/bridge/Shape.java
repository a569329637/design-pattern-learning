package com.gsq.pattern.bridge;

/**
 * 桥接模式
 */
public abstract class Shape {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
