package com.gsq.pattern.adapter;

/**
 * 适配器模式
 */
public class AdapterTest {

    // 参考 http://blog.csdn.net/lmj623565791/article/details/25833393
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
