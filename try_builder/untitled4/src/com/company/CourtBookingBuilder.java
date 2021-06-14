package com.company;

import java.awt.print.Book;

public class CourtBookingBuilder implements BookingBuilder{

    private Price price;
    private Hours hours;
    private Holiday holiday;
    private Events events;
    private CourtType courtType;

    @Override
    public BookingBuilder price(Price price) {
        this.price = price;
        return this;
    }

    @Override
    public BookingBuilder hours(Hours hours) {
        this.hours = hours;
        return this;
    }

    @Override
    public BookingBuilder holiday(Holiday holiday) {
        this.holiday = holiday;
        return this;
    }

    @Override
    public BookingBuilder events(Events events) {
        this.events = events;
        return this;
    }
    public BookingBuilder courtType(CourtType courtType){
        this.courtType = courtType;
        return this;
    }

    @Override
    public Booking build() {
        return new Booking(price,hours,holiday,events,courtType);
    }

}