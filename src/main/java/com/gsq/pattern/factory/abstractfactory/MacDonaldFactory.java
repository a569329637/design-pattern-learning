package com.gsq.pattern.factory.abstractfactory;

/**
 * Created by guishangquan on 2017/8/23.
 */
public class MacDonaldFactory implements Factory {

    public Cola createCola() {
        return new PepsiCola();
    }

    public Hamburger createHamburger() {
        return new PorkHamburger();
    }
}
