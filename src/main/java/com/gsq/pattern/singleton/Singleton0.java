package com.gsq.pattern.singleton;

/**
 * 单列模式：懒汉式，线程不安全，效率较低
 */
public class Singleton0 {
    private static Singleton0 singleton0;

    private Singleton0() {

    }

    public static Singleton0 getSingleton() {
        if (null == singleton0) {
            singleton0 = new Singleton0();
        }
        return singleton0;
    }

    public static void main(String[] args) {
        System.out.println("Singleton0.getSingleton() = " + Singleton0.getSingleton());
        System.out.println("Singleton0.getSingleton() = " + Singleton0.getSingleton());
    }
}
