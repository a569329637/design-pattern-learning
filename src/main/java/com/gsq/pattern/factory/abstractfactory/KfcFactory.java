package com.gsq.pattern.factory.abstractfactory;

/**
 * Created by guishangquan on 2017/8/23.
 */
public class KfcFactory implements Factory {

    public Cola createCola() {
        return new CocaCola();
    }

    public Hamburger createHamburger() {
        return new ChickenHamburger();
    }
}
