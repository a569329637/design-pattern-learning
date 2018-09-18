package com.gsq.pattern.adapter;

/**
 * 适配器模式
 */
public class Mobile {

    public void inputPower(V5Power v5Power) {
        System.out.println("这里是手机，需要5v的电压充电，现在的电压是 " + v5Power.provideV5Power());
    }
}
