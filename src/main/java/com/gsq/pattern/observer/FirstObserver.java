package com.gsq.pattern.observer;

/**
 * Created by guishangquan on 2017/8/23.
 * 观察者模式：具体的观察者1
 */
public class FirstObserver implements Observer {

    public void update(String msg) {
        System.out.println("我是第一个观察者，收到信息是 msg = " + msg);
    }

}
