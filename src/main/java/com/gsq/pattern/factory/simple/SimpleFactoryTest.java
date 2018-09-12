package com.gsq.pattern.factory.simple;

/**
 * 参考 http://www.cnblogs.com/toutou/p/4899388.html
 * 简单工厂模式: 一种工厂生产一种产品
 *
 * 缺点：
 * 1. 违背“开放 - 关闭原则”，一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑过于复杂
 * 2. 工厂方法是静态的，静态方法不能被继承和重写，会造成工厂角色无法形成基于继承的等级结构。
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car car1 = factory.getCar(CarFactory.CarType.JeepCar);
        car1.getCar();
        Car car2 = factory.getCar(CarFactory.CarType.SportCar);
        car2.getCar();
    }
}
