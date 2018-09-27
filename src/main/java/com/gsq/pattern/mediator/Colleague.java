package com.gsq.pattern.mediator;

/**
 * 中介者模式
 */
public abstract class Colleague {

    private String name;

    private Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void receiveMessage(String msg);

    public abstract void sendMessage(String msg);
}
