package com.gsq.pattern.strategy;

/**
 * Created by guishangquan on 2017/8/23.
 */
public class Validator {

    private NumberValidator numberValidator;
    private StringValidator stringValidator;
    private ObjectValidator objectValidator;

    public Validator() {
        this.numberValidator = null;
        this.stringValidator = null;
        this.objectValidator = null;
    }

    public void setNumberValidator(NumberValidator numberValidator) {
        this.numberValidator = numberValidator;
    }

    public void setStringValidator(StringValidator stringValidator) {
        this.stringValidator = stringValidator;
    }

    public void setObjectValidator(ObjectValidator objectValidator) {
        this.objectValidator = objectValidator;
    }

    void validate() {
        numberValidator.validate();
        stringValidator.validate();
        objectValidator.validate();
    }
}
