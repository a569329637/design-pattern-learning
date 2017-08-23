package com.gsq.pattern.factory.factorymethod;

/**
 * Created by guishangquan on 2017/8/23.
 */
public class JeepCarFactory implements Factory {

    public Car createCar() {
        return new JeepCar();
    }
}
