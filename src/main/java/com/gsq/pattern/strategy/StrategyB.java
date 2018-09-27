package com.gsq.pattern.strategy;

/**
 * 策略模式
 */
public class StrategyB implements Strategy {
    @Override
    public int doOperation(int num) {
        System.out.println("执行策略B, 打7折");
        return (int) (num * 0.7);
    }
}
