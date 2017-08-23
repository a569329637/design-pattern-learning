package com.gsq.pattern.observer;

/**
 * Created by guishangquan on 2017/8/23.
 * 观察者模式：主题，所有主题需实现该借口
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void setMsg(String msg);

}
