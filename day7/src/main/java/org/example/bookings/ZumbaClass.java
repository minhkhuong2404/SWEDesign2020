package org.example.bookings;

import java.time.LocalTime;

import org.example.Player;

public class ZumbaClass extends Booking {
    public ZumbaClass(LocalTime start, LocalTime end, Player player) {
        super(start, end, player);
    }
}