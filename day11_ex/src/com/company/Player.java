package com.company;

public class Player {
    protected String name;
    public Player (String name){
        this.name = name;
    }

    public void showName() {
        System.out.println(name);
    }
    public String toString(){
        return this.name;
    }

}
