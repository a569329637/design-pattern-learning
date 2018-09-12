package com.gsq.pattern.singleton;

/**
 * 单列模式：懒汉式，线程安全，效率较低
 */
public class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    public static void main(String[] args) {
        System.out.println("Singleton1.getInstance() = " + Singleton1.getInstance());
        System.out.println("Singleton1.getInstance() = " + Singleton1.getInstance());
    }
}
