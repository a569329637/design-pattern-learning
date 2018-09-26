package com.gsq.pattern.command;

//游戏中行为对象的基类（Receiver）
class GameActor {}
//玩家（Receiver）
class Player extends GameActor {}
//命令接口（Command）
interface ICommand {
    void execute(GameActor gameActor);
}
//攻击命令（ConcreteCommand）
class AttackCommand implements ICommand {
    public void execute(GameActor gameActor) {
    }
}
//命令执行者（Invoker）
class CommandInvoker {
    void addCommand(ICommand iCommand){}
    void execute(){}
}

/**
 * 命令模式
 *
 * 命令和玩家可以随意增加和组合，最后通过命令执行者执行
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        // 玩家
        Player player = new Player();
        // 攻击命令
        ICommand attackCommand = new AttackCommand();
        // 命令执行者
        CommandInvoker commandInvoker = new CommandInvoker();

        // 玩家和攻击命令绑定
        attackCommand.execute(player);
        // 执行命令
        commandInvoker.addCommand(attackCommand);
        commandInvoker.execute();
    }
}

//怪物基类
class Monster {
    //行走巡逻
    public void walk(){}
    //攻击
    public void attack(){}
    //逃跑
    public void escape(){}
}
//精英怪物
class EliteMonster extends Monster {
    //精英怪物独有的行为
    public void eliteBehavior(){}
}
//BOSS
class BossMonster extends Monster {
    //BOSS独有的行为
    public void bossBehavior(){}
}
//普通怪物
class SimpleMonster extends Monster {
    //普通怪物独有的行为
    public void simpleBehavior(){}
}
/*
问题：如果要让 BOSS 同时拥有精英怪和普通怪的行为
1. 把精英怪和普通怪的行为封装在Monster里，但是这样所有怪都继承这两个行为
2. 把精英怪和普通怪的行为封装在BossMonster里，但是这样会有代码冗余，修改这种行为需要修改两个地方
3. 语言有多种继承
 */

