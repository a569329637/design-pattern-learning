package com.gsq.pattern.strategy;

/**
 * 策略模式
 */
public class StrategyA implements Strategy {
    @Override
    public int doOperation(int num) {
        System.out.println("执行策略A, 打5折");
        return (int) (num * 0.5);
    }
}
