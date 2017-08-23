package com.gsq.pattern.observer;

/**
 * Created by guishangquan on 2017/8/23.
 * 观察者模式：观察者借口，所有的观察者需实现该借口
 */
public interface Observer {

    void update(String msg);

}
