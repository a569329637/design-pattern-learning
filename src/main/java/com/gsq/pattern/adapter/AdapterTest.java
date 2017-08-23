package com.gsq.pattern.adapter;

/**
 * Created by guishangquan on 2017/8/23.
 * 适配器模式
 */
public class AdapterTest {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
