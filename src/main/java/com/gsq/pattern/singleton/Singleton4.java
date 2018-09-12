package com.gsq.pattern.singleton;

/**
 * 单列模式：内部类实现，线程安全，推荐用
 */
public class Singleton4 {

    private Singleton4() {

    }

    private static class SingletonHolder {
        private static final Singleton4 singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.singleton4;
    }

    public static void main(String[] args) {
        System.out.println("Singleton4.getInstance() = " + Singleton4.getInstance());
        System.out.println("Singleton4.getInstance() = " + Singleton4.getInstance());
    }
}
