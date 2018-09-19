package com.gsq.pattern.proxy;

/**
 * 代理模式
 */
public class ImageReal implements Image {

    private String fileName;

    public ImageReal(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    public void display() {
        System.out.println("displaying " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("loading " + fileName);
    }
}
