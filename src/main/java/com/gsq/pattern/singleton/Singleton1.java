package com.gsq.pattern.singleton;

/**
 * Created by guishangquan on 2017/8/23.
 * 单列模式：线程安全，效率较低
 */
public class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1() {
        singleton1 = null;
    }

    public static synchronized Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
    }
}
