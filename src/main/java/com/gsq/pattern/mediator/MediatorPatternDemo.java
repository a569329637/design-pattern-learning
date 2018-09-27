package com.gsq.pattern.mediator;

/**
 * 中介者模式
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagueA a = new ColleagueA("A", mediator);
        ColleagueB b = new ColleagueB("B", mediator);

        mediator.setColleagueA(a);
        mediator.setColleagueB(b);

        mediator.contact(a, "hhh");
        System.out.println();
        mediator.contact(b, "xxx");
    }
}
