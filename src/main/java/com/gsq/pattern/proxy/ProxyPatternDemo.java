package com.gsq.pattern.proxy;

/**
 * 代理模式
 *
 * 创建真实图片（ImageReal）
 * 通过真实图片创建图片代理（ImageProxy）
 * 然后通过 ImageProxy 去代理访问 ImageReal 的 display
 * 可以在代理访问 display 的前后加入其它逻辑
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        //Image image = new ImageProxy("aaa.jpg");
        //image.display();

        Image image = new ImageReal("bbb.jpg");
        Image imageProxy = new ImageProxy(image);
        imageProxy.display();
    }
}
