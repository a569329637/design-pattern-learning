package com.gsq.pattern.factory.simple;

/**
 * Created by guishangquan on 2017/8/23.
 */
public class CarFactory {

    public enum CarType {
        SportCar,
        JeepCar
    }

    public Car getCar(CarType type) {
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
