package com.company;

public class Badminton extends Booking implements Price {

    protected int badmintoncourt = 50;
    public int pay() {
        return badmintoncourt;
    }
    public String announce(){
        return "Badminton";
    }
}
