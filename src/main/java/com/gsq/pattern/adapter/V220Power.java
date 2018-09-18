package com.gsq.pattern.adapter;

/**
 * 适配器模式
 */
public class V220Power {

    public int provideV220Power() {
        System.out.println("提供220V交流电");
        return 220;
    }
}
