package com.gsq.pattern.iterator;

/**
 * 迭代器模式
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameContainer nameContainer = new NameContainer();
        Iterator iterator = nameContainer.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("name = " + name);
        }
    }
}
