package com.gsq.pattern.template;

/**
 * 模板模式
 *
 * play 方法执行的模板是固定的
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
