package com.gsq.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式：账单集合
 */
public class AccountBook {
    private List<Bill> listBill = new ArrayList<Bill>();

    // 添加单子
    public void add(Bill bill) {
        listBill.add(bill);
    }

    // 为每个账单添加访问者
    public void show(AccountBookView viewer) {
        for (Bill b : listBill) {
            b.accept(viewer);
        }
    }
}
