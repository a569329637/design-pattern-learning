package com.gsq.pattern.singleton;

/**
 * 单列模式：饿汉式，线程安全，静态代码块，可用
 */
public class Singleton3 {
    private static Singleton3 singleton3;

    static {
        singleton3 = new Singleton3();
    }

    private Singleton3() {

    }

    public static Singleton3 getSingleton() {
        return singleton3;
    }

    public static void main(String[] args) {
        System.out.println("Singleton3.getSingleton() = " + Singleton3.getSingleton());
        System.out.println("Singleton3.getSingleton() = " + Singleton3.getSingleton());
    }
}
