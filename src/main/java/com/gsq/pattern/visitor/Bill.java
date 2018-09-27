package com.gsq.pattern.visitor;

/**
 * 访问者模式：账单
 */
public interface Bill {
    void accept(AccountBookView viewer);
}
