package com.gsq.pattern.factory.simple;

/**
 * 简单工厂模式
 */
public class CarFactory {

    public enum CarType {
        SportCar,
        JeepCar
    }

    public static Car getCar(CarType type) {
        switch (type) {
            case SportCar:
                return new SportCar();
            case JeepCar:
                return new JeepCar();
            default:
                System.out.println("类型错误");
                return null;
        }
    }
}
