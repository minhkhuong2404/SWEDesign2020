package org.example.bookings;

import java.time.LocalTime;

import org.example.Player;

public class BadmintonCourt extends Booking {
    public BadmintonCourt(LocalTime start, LocalTime end, Player player) {
        super(start, end, player);
    }
}