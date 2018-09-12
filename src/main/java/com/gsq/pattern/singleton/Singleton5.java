package com.gsq.pattern.singleton;

/**
 * 单列模式：双重校验锁，线程安全，推荐用
 */
public class Singleton5 {
    private static volatile Singleton5 singleton5;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (singleton5 == null) {
            synchronized (Singleton5.class) {
                if (singleton5 == null) {
                    // singleton5不使用volatile修饰的话，这里可能会发生指令重排，从而导致singleton5发布错误
                    singleton5 = new Singleton5();
                }
            }
        }
        return singleton5;
    }

    public static void main(String[] args) {
        System.out.println("Singleton5.getInstance() = " + Singleton5.getInstance());
        System.out.println("Singleton5.getInstance() = " + Singleton5.getInstance());
    }
}
