package com.gsq.pattern.builder;

/**
 * http://www.runoob.com/design-pattern/builder-pattern.html
 * 建造者模式
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Meal vegMeal = MealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = MealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
