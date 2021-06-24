package com.yuanren.InterfaceDemo;

public class Computer extends Electronics implements PlayGame{


    @Override
    public void startingUp() {
        System.out.println("电脑开机！");
    }

    @Override
    public void shutDown() {
        System.out.println("电脑关机！");
    }

    @Override
    public void playGame() {
        System.out.println("电脑玩游戏！");
    }
}
