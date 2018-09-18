package com.gsq.pattern.adapter;

/**
 * 适配器模式
 */
public class V5PowerAdapter implements V5Power {

    private V220Power v220Power;

    V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    public int provideV5Power() {
        int power = v220Power.provideV220Power();
        System.out.println("这里是v5适配器，经过各种转换将 power=" + power + " 的电压转换为 power=5 的电压");
        return 5;
    }
}
