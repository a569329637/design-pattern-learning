package com.gsq.pattern.factory.factorymethod;

/**
 * Created by guishangquan on 2017/8/23.
 * 工厂方法模式
 */
public class FacotryTest {

    // 参考 http://www.cnblogs.com/toutou/p/4899388.html
    public static void main(String[] args) {
        Factory sportCarFactory = new SportCarFacotry();
        Car sportCar = sportCarFactory.createCar();
        sportCar.getCar();

        Factory jeepCarFactory = new JeepCarFactory();
        Car jeepCar = jeepCarFactory.createCar();
        jeepCar.getCar();
    }
}
