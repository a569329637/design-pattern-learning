package com.gsq.pattern.singleton;

/**
 * Created by guishangquan on 2017/8/23.
 * 单列模式：内部类实现，推荐用
 */
public class Singleton3 {

    private Singleton3() {

    }

    private static class SingletonHolder {
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.singleton3;
    }

    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
    }
}
