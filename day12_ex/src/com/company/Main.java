package com.company;

public class Main {

    public static void main(String[] args) {
        ZumbaClass zumbaClass = new ZumbaClass();

        Member trainer = new Trainer();
        Member player1 = new Player1();
        Member player2 = new Player2();

        zumbaClass.addMember(trainer);
        zumbaClass.addMember(player1);
        zumbaClass.addMember(player2);

        zumbaClass.setStatus(0);
        zumbaClass.setStatus(1);

    }
}
