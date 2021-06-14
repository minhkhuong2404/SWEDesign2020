package org.example.payments;

import org.example.Player;
import org.example.bookings.Booking;

public abstract class PaymentMethod {
    private Player player;

    public PaymentMethod(Player player) {
        this.setPlayer(player);
    }

    public static PaymentMethod create(PaymentType type, Player player) {
        PaymentMethod payment;
        switch (type) {
            case Debit:
                payment = new DebitCard(player);
                break;
            case Consortium:
                payment = new ConsortiumCard(player);
                break;
            default:
                payment = null;
                System.out.println("could not create payment");
                System.exit(1);
        }

        return payment;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public abstract void pay(Booking booking);

    public abstract void refund(Booking booking);
}