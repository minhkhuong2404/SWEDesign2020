package com.company;
public class Main {
    public static void main(String[] args) {
        Booking booking = new CourtBookingBuilder()
                .price(Price.One)
                .hours(Hours.Two)
                .holiday(Holiday.Three)
                .courtType(CourtType.Badminton).build();
        System.out.println(booking);
    }
}