package com.gsq.pattern.builder;

import com.gsq.pattern.builder.inter.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式：套餐
 */
public class Meal {
    private List<Item> items;

    public Meal() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
