package com.gsq.pattern.visitor;

/**
 * 访问者模式：让数据结构和数据操作分离
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        // 创建消费和收入账单
        Bill consumerBill = new ConsumerBill("消费", 3000);
        Bill incomeBill = new IncomeBill("收入", 5000);
        Bill consumerBill2 = new ConsumerBill("消费", 4000);
        Bill incomeBill2 = new IncomeBill("收入", 8000);

        // 添加账单集合
        AccountBook accountBook = new AccountBook();
        accountBook.add(consumerBill);
        accountBook.add(incomeBill);
        accountBook.add(consumerBill2);
        accountBook.add(incomeBill2);

        // 创建访问者
        Boss boss = new Boss();
        CPA cpa = new CPA();

        // 访问者访问账
        //consumerBill.accept(boss);

        // 访问者访问账号集合
        accountBook.show(boss);
        accountBook.show(cpa);

        // 访问者访问账号集合，boss查看总收入和总消费
        boss.getTotalConsumer();
        boss.getTotalIncome();
    }
}
