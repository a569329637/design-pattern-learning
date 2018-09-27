package com.gsq.pattern.visitor;

/**
 * 访问者模式：会计
 */
class CPA implements AccountBookView {

    int count = 0;

    // 查看消费的单子
    public void view(ConsumerBill consumerBill) {
        count++;
        if (consumerBill.getItem().equals("消费")) {
            System.out.println("第" + count + "个单子消费了：" + consumerBill.getAmount());
        }
    }
    // 查看收入单子

    public void view(IncomeBill incomeBill) {

        if (incomeBill.getItem().equals("收入")) {
            System.out.println("第" + count + "个单子收入了：" + incomeBill.getAmount());
        }
    }

}
