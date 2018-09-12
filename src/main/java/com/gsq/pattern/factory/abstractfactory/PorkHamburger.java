package com.gsq.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式
 */
public class PorkHamburger implements Hamburger {

    public void price() {
        System.out.println("猪肉汉堡价格9元");
    }
}
