package com.company;

public class Player implements Participant {
    private String name;
    public Player (String name){
        this.name = name;
    }
    @Override

    public void showName() {
        System.out.println(name);
    }
}

