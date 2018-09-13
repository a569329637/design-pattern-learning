package com.gsq.pattern.builder;

import com.gsq.pattern.builder.impl.ChickenBurger;
import com.gsq.pattern.builder.impl.CocaCola;
import com.gsq.pattern.builder.impl.Pepsi;
import com.gsq.pattern.builder.impl.VegBurger;

/**
 * 建造者模式：套餐建造者
 *
 * 将各种食物组装成套餐，提供不同的方法获取不同的套餐
 * 还可以增加方法来增加套餐
 */
public class MealBuilder {

    public static Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new CocaCola());
        return meal;
    }

    public static Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
