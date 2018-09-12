package com.gsq.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式
 */
public interface Factory {

    Cola createCola();

    Hamburger createHamburger();
}
