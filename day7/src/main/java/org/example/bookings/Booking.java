package org.example.bookings;

import java.time.LocalTime;

import org.example.Player;

public abstract class Booking {
    private LocalTime start;
    private LocalTime end;
    private Player player;

    public Booking(LocalTime start, LocalTime end, Player player) {
        this.setStart(start);
        this.setEnd(end);
        this.setPlayer(player);
    }

    public static Booking create(BookingType type, LocalTime start, LocalTime end, Player player) {
        Booking booking;
        switch (type) {
            case Zumba:
                booking = new ZumbaClass(start, end, player);
                break;
            case Badminton:
                booking = new BadmintonCourt(start, end, player);
                break;
            default:
                booking = null;
                System.out.println("could not create booking");
                System.exit(1);
        }

        System.out.println("Create booking " + booking);
        return booking;
    }

    public void cancel() {
        System.out.println("Cancel booking" + this);
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}