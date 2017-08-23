package com.gsq.pattern.factory.simple;

/**
 * Created by guishangquan on 2017/8/23.
 * 简单工厂模式
 */
public class FactoryTest {

    // 参考 http://www.cnblogs.com/toutou/p/4899388.html
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car car1 = factory.getCar(CarFactory.CarType.JeepCar);
        car1.getCar();
        Car car2 = factory.getCar(CarFactory.CarType.SportCar);
        car2.getCar();
    }
}
