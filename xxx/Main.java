package com.company;

public class Main {

    public static void main(String[] args) {
        ZumbaClass zumbaClass = new ZumbaClass();
        Member trainer = new Trainer();
        Member player = new Player();
        zumbaClass.addMember(trainer);
        zumbaClass.addMember(player);
        zumbaClass.setStatus(0);

    }
}
