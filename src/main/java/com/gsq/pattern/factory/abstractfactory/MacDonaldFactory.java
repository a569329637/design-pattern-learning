package com.gsq.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式
 */
public class MacDonaldFactory implements Factory {

    public Cola createCola() {
        return new PepsiCola();
    }

    public Hamburger createHamburger() {
        return new PorkHamburger();
    }
}
