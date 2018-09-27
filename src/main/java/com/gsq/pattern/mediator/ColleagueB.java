package com.gsq.pattern.mediator;

/**
 * 中介者模式
 */
public class ColleagueB extends Colleague {

    public ColleagueB(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("【B】收到消息：【"+msg+"】");
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("【B】发送消息：【"+msg+"】");
    }
}
