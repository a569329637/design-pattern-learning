package com.gsq.pattern.Interpreter;

/**
 * 解释器模式
 */
public interface Expression {
    boolean interpret(String context);
}
