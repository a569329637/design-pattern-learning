package com.gsq.pattern.observer;

/**
 * Created by guishangquan on 2017/8/23.
 * 观察者模式测试
 */
public class ObserverTest {

    // 参考 http://blog.csdn.net/lmj623565791/article/details/24179699
    public static void main(String[] args) {
        // 创建一个主题
        Subject subject = new ExampleSubject();

        // 创建两个观察者，并为观察注册主题
        Observer observer1 = new FirstObserver();
        subject.registerObserver(observer1);
        Observer observer2 = new SecondObserver();
        subject.registerObserver(observer2);

        // 主题发布消息
        subject.setMsg("message1");

        // 观察者1取消观察主题
        subject.removeObserver(observer1);

        // 主题发布消息
        subject.setMsg("message2");
    }

}
