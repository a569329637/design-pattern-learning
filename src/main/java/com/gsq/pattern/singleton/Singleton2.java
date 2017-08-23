package com.gsq.pattern.singleton;

/**
 * Created by guishangquan on 2017/8/23.
 * 单列模式：双重校验锁，线程安全，效率较高，推荐用
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
        singleton2 = null;
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
    }
}
