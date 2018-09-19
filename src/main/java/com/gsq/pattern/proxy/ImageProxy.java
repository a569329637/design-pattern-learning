package com.gsq.pattern.proxy;

/**
 * 代理模式
 */
public class ImageProxy implements Image {

    private String filename;

    private Image image;

    public ImageProxy(Image image) {
        this.image = image;
    }

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (image == null) {
            image = new ImageReal(filename);
        }
        System.out.println("");
        System.out.println("display begin");
        image.display();
        System.out.println("display end");
    }
}
