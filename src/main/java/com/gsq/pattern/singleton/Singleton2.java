package com.gsq.pattern.singleton;

/**
 * 单列模式：饿汉式，线程安全，静态常量，可用
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getSingleton() {
        return singleton2;
    }

    public static void main(String[] args) {
        System.out.println("Singleton2.getSingleton() = " + Singleton2.getSingleton());
        System.out.println("Singleton2.getSingleton() = " + Singleton2.getSingleton());
    }
}
