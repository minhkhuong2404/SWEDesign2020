package com.company;

public class Zumba extends Booking implements Price {
    protected  int zumbacourt = 100;

    public int pay() {
        return zumbacourt;
    }
    public String announce(){
        return "Zumba";
    }
}
