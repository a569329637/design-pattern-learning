package com.gsq.pattern.factory.factorymethod;

/**
 * 工厂方法模式
 */
public class JeepCarFactory implements Factory {

    public Car createCar() {
        return new JeepCar();
    }
}
