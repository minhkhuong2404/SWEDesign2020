package com.company;

public class ShowerOption extends Options {
    protected int shower = 20;
    public ShowerOption(Price price) {
        super(price);
    }
    public int pay(){
        int pay = optionsPrice.pay();
        return pay + shower;
    }
    public String announce(){
        String announce = optionsPrice.announce();
        return announce + " + Shower";
    }
}
