package com.gsq.pattern.factory.abstractfactory;

/**
 * Created by guishangquan on 2017/8/23.
 * 抽象工厂模式
 */
public class FactoryTest {

    // 参考 http://blog.csdn.net/zxt0601/article/details/52798423
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
