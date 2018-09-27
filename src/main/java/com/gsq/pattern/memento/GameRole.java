package com.gsq.pattern.memento;

/**
 * 备忘录模式
 */
public class GameRole {

    private int vit;
    private int atk;

    public GameRole() {
        this.vit = 100;
        this.atk = 100;
    }

    public void injury() {
        vit -= 30;
        System.out.println("受到攻击，体力减30");
    }

    public void show() {
        System.out.println("体力 = " + vit);
        System.out.println("攻击力 = " + vit);
    }

    public GameRoleMemento save() {
        return new GameRoleMemento(vit, atk);
    }

    public void load(GameRoleMemento gameRoleMemento) {
        this.vit = gameRoleMemento.getVit();
        this.atk = gameRoleMemento.getAtk();
    }
}
