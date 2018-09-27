package com.gsq.pattern.strategy;

/**
 * 策略模式：通过给 context 里设置不通过 strategy 来得不同的结果
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        StrategyA strategyA = new StrategyA();
        StrategyB strategyB = new StrategyB();

        StrategyContext contextA = new StrategyContext(strategyA);
        int numA = contextA.execOperation(10);
        System.out.println("numA = " + numA);

        StrategyContext contextB = new StrategyContext(strategyB);
        int numB = contextB.execOperation(10);
        System.out.println("numB = " + numB);
    }
}
