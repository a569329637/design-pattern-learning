package com.gsq.pattern.visitor;

/**
 * 访问者模式：老板
 */
class Boss implements AccountBookView {

    private double totalConsumer;
    private double totalIncome;

    // 查看消费的单子
    public void view(ConsumerBill consumerBill) {
        totalConsumer = totalConsumer + consumerBill.getAmount();
    }

    // 查看收入单子
    public void view(IncomeBill incomeBill) {
        totalIncome = totalIncome + incomeBill.getAmount();
    }

    public void getTotalConsumer() {
        System.out.println("老板一共消费了" + totalConsumer);
    }

    public void getTotalIncome() {
        System.out.println("老板一共收入了" + totalIncome);
    }
}
