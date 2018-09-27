package com.gsq.pattern.iterator;

/**
 * 迭代器模式
 */
public class NameContainer implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (index < names.length) {
                return names[index++];
            }
            return null;
        }
    }
}
