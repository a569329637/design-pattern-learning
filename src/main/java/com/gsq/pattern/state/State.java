package com.gsq.pattern.state;

/**
 * 状态模式
 */
public interface State {
    void insertCoin();
    void returnCoin();
    void turnCrank();
    void dispense();
    void printstate();
}
