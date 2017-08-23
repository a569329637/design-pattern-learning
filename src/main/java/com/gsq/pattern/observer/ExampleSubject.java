package com.gsq.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guishangquan on 2017/8/23.
 * 观察者模式：具体的主题
 */
public class ExampleSubject implements Subject {

    private List<Observer> observers;

    private String msg;

    public ExampleSubject() {
        this.observers = new ArrayList<Observer>();
        this.msg = "";
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
