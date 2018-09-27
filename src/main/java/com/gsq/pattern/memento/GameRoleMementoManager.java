package com.gsq.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录模式
 */
public class GameRoleMementoManager {
    List<GameRoleMemento> list;

    public GameRoleMementoManager() {
        this.list = new ArrayList<>();
    }

    public void add(GameRoleMemento memento) {
        list.add(memento);
    }

    public GameRoleMemento getGameRoleMementoByIndex(int index) {
        if (index < list.size()) {
            return list.get(index);
        }
        return null;
    }
}
