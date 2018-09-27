package com.gsq.pattern.mediator;

/**
 * 中介者模式
 */
public class ConcreteMediator implements Mediator {

    private Colleague colleagueA;
    private Colleague colleagueB;

    public Colleague getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(Colleague colleagueA) {
        this.colleagueA = colleagueA;
    }

    public Colleague getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(Colleague colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void contact(Colleague coll, String msg) {
        coll.sendMessage(msg);
        if (coll == colleagueA) {
            colleagueB.sendMessage(msg);
        } else {
            colleagueA.sendMessage(msg);
        }
    }
}
