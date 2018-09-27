package com.gsq.pattern.mediator;

/**
 * 中介者模式
 */
public class ColleagueA extends Colleague {

    public ColleagueA(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("【A】收到消息：【"+msg+"】");
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("【A】发送消息：【"+msg+"】");
    }
}
