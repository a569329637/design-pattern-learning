package com.gsq.pattern.visitor;

/**
 * 访问者模式：收入账单
 */
public class IncomeBill implements Bill {
    private String item;
    private double amount;

    public IncomeBill(String item, double amount) {
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
