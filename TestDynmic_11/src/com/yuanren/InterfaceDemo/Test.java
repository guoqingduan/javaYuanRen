package com.yuanren.InterfaceDemo;


public class Test {
    public static void main(String[] args) {
        PlayGame playGame= new CellPhone();
        playGame.playGame();
        CellPhone cellPhone = new CellPhone();
        cellPhone.shutDown();
        cellPhone.startingUp();
        Computer computer = new Computer();
        computer.playGame();
        computer.shutDown();


    }
}
