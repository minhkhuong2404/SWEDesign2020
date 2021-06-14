package com.company;

public class LockerOption extends Options {
    protected int locker = 10;
    public LockerOption(Price price) {
        super(price);
    }
    public int pay(){
        int pay = optionsPrice.pay();
        return pay + locker;
    }
    public String announce(){
        String announce = optionsPrice.announce();
        return announce + " + Locker";
    }
}
