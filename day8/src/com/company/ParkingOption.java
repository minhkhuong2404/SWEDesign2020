package com.company;

public class ParkingOption extends Options {
    protected int parking = 15;
    public ParkingOption(Price price) {
        super(price);
    }
    public int pay(){
        int pay = optionsPrice.pay();
        return pay + parking;
    }
    public String announce(){
        String announce = optionsPrice.announce();
        return announce + " + Parking";
    }
}
