package com.gsq.pattern.memento;

/**
 * 备忘录模式
 */
public class MementoPatternDemoe {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.show();

        System.out.println("");
        GameRoleMementoManager manager = new GameRoleMementoManager();
        manager.add(gameRole.save());

        gameRole.injury();
        gameRole.show();

        System.out.println("");

        gameRole.load(manager.getGameRoleMementoByIndex(0));
        gameRole.show();
    }
}
