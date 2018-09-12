package com.gsq.pattern.factory.abstractfactory;

/**
 * 参考 http://blog.csdn.net/zxt0601/article/details/52798423
 * 抽象工厂模式：
 * cola 接口、hamburger 接口、factory 接口
 * factory 接口可以生产 cola 和 hamburger
 * 所以 KfcFactory 和 MacDonaldFactory 可以生产自己的 cola 和 hamburger
 *
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory kfcFactory = new KfcFactory();
        Cola kfcFactoryCola = kfcFactory.createCola();
        Hamburger kfcFactoryHamburger = kfcFactory.createHamburger();
        kfcFactoryCola.price();
        kfcFactoryHamburger.price();

        System.out.println("");

        Factory macDonalFactory = new MacDonaldFactory();
        Cola macDonalFactoryCola = macDonalFactory.createCola();
        Hamburger macDonalFactoryHamburger = macDonalFactory.createHamburger();
        macDonalFactoryCola.price();
        macDonalFactoryHamburger.price();
    }
}
