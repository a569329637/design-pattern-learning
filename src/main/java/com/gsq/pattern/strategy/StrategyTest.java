package com.gsq.pattern.strategy;

/**
 * Created by guishangquan on 2017/8/23.
 * 策略模式
 */
public class StrategyTest {

    // 参考 http://blog.csdn.net/lmj623565791/article/details/24116745
    public static void main(String[] args) {
        Validator validator = new Validator();

        // 设置不同策略, numberValidator 可以有 numberValidatorImpl1, numberValidatorImpl2, numberValidatorImpl3 不同实现
        // 每一个不同的 NumberValidatorImpl 就是不同的策略
        validator.setNumberValidator(new NumberValidatorImpl());
        validator.setStringValidator(new StringValidatorImpl());
        validator.setObjectValidator(new ObjectValidatorImpl());

        validator.validate();
    }
}
