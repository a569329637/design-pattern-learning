package com.gsq.pattern.visitor;

/**
 * 访问者模式：消费账单
 */
public class ConsumerBill implements Bill {
    private String item;
    private double amount;

    public ConsumerBill(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    public void accept(AccountBookView viewer) {
        viewer.view(this);
    }

    public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }
}
