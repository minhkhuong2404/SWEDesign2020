package org.example.payments;

import org.example.Player;
import org.example.bookings.Booking;

public class ConsortiumCard extends PaymentMethod {

    public ConsortiumCard(Player player) {
        super(player);
    }

    @Override
    public void pay(Booking booking) {
        System.out.println("Pay booking " + booking + " with consortium card");
    }

    @Override
    public void refund(Booking booking) {
        System.out.println("Refund booking " + booking + " with consortium card");
    }
    
}