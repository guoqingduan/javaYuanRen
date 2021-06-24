package com.yuanren.InterfaceDemo;

public class CellPhone extends Electronics implements PlayGame{
    @Override
    public void startingUp() {
        System.out.println("手机开机！");
    }

    @Override
    public void shutDown() {
        System.out.println("手机关机！");
    }

    @Override
    public void playGame() {
        System.out.println("手机玩游戏！");
    }
}
