package com.company;


public class Main {

    public static void main(String[] args) {

        Badminton badminton = new Badminton();
        System.out.println(badminton.announce());
        System.out.println(badminton.pay());

        Zumba zumba = new Zumba();
        System.out.println(zumba.announce());
        System.out.println(zumba.pay());


        LockerOption badmintonPlusLockerOption = new LockerOption(badminton);
        System.out.println(badmintonPlusLockerOption.announce());
        System.out.println(badmintonPlusLockerOption.pay());


        ShowerOption zumbaPlusShowerOption = new ShowerOption(zumba);
        System.out.println(zumbaPlusShowerOption.announce());
        System.out.println(zumbaPlusShowerOption.pay());

        ParkingOption badmintonPlusLockerAndParkingOption = new ParkingOption(badmintonPlusLockerOption);
        System.out.println(badmintonPlusLockerAndParkingOption.announce());
        System.out.println(badmintonPlusLockerAndParkingOption.pay());

    }
}
