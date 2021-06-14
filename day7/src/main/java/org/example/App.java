package org.example;

import java.time.LocalTime;

import org.example.bookings.BookingType;
import org.example.payments.PaymentMethod;
import org.example.payments.PaymentType;

public class App {
    public static void main(String[] args) {
        var manager = new BookingManager();

        var alice = Player.create();
        var aliceDebit = PaymentMethod.create(PaymentType.Debit, alice);
        var aliceMemberCard = PaymentMethod.create(PaymentType.Consortium, alice);

        var bob = Player.create();
        var bobDebit = PaymentMethod.create(PaymentType.Debit, bob);

        // create and cancel a booking
        var badmintonBooking = manager.create(BookingType.Badminton, LocalTime.MIN, LocalTime.MAX, aliceDebit);
        manager.cancel(badmintonBooking, aliceDebit);

        // create a booking and transfer it to another person
        var zumbaBooking = manager.create(BookingType.Zumba, LocalTime.MIN, LocalTime.MAX, aliceMemberCard);
        manager.transferOwnerShip(zumbaBooking, aliceMemberCard, bobDebit);

        // move booking to next week
        manager.moveToNextWeek(zumbaBooking, bobDebit);
    }
}
