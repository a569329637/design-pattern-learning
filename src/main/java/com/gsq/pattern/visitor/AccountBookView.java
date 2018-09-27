package com.gsq.pattern.visitor;

/**
 * 访问者模式：访问者接口
 */
public interface AccountBookView {
    // 查看消费的单子
    void view(ConsumerBill consumerBill);

    // 查看收入单子
    void view(IncomeBill incomeBill);
}
