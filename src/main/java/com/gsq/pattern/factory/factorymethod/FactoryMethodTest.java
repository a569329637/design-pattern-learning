package com.gsq.pattern.factory.factorymethod;

/**
 * 参考 http://www.cnblogs.com/toutou/p/4899388.html
 * 工厂方法模式：通过工厂接口产生不同的工厂，一种工厂类生产一种产品
 *
 * 缺点：
 * 1. 添加新产品时需要添加新的工厂类
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory sportCarFactory = new SportCarFacotry();
        Car sportCar = sportCarFactory.createCar();
        sportCar.getCar();

        Factory jeepCarFactory = new JeepCarFactory();
        Car jeepCar = jeepCarFactory.createCar();
        jeepCar.getCar();
    }
}
