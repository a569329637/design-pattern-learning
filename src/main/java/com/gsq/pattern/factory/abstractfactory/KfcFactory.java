package com.gsq.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式
 */
public class KfcFactory implements Factory {

    public Cola createCola() {
        return new CocaCola();
    }

    public Hamburger createHamburger() {
        return new ChickenHamburger();
    }
}
