package com.gsq.pattern.strategy;

/**
 * 策略模式
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execOperation(int num) {
        return strategy.doOperation(num);
    }
}
