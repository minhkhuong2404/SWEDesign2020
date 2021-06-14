package org.example;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

import org.example.bookings.BadmintonCourt;
import org.example.bookings.Booking;
import org.example.bookings.BookingType;
import org.example.bookings.ZumbaClass;
import org.example.payments.PaymentMethod;

public class BookingManager {
    public BookingManager() {
    }

    public Booking create(BookingType type, LocalTime start, LocalTime end, PaymentMethod payment) {
        System.out.println("\nCREATE AND PAY BOOKING");
        var booking = Booking.create(type, start, end, payment.getPlayer());
        payment.pay(booking);
        return booking;
    }

    public void cancel(Booking booking, PaymentMethod payment) {
        System.out.println("\nCANCEL AND REFUND BOOKING");
        booking.cancel();
        payment.refund(booking);
    }

    public void moveToNextWeek(Booking booking, PaymentMethod payment) {
        System.out.println("\nMOVING BOOKING TO NEXT WEEK");
        var newStart = booking.getStart().plusHours(24 * 7);
        var newEnd = booking.getEnd().plusHours(24 * 7);

        booking.cancel();
        payment.refund(booking);

        Booking newBooking = null;
        if (booking.getClass().equals(BadmintonCourt.class)) {
            newBooking = Booking.create(BookingType.Badminton, newStart, newEnd, payment.getPlayer());
        }
        if (booking.getClass().equals(ZumbaClass.class)) {
            newBooking = Booking.create(BookingType.Zumba, newStart, newEnd, payment.getPlayer());
        }

        if (booking != null) {
            payment.pay(newBooking);
        }
    }

    public void transferOwnerShip(Booking booking, PaymentMethod oldPayment, PaymentMethod newPayment) {
        System.out.println("\nTRANSFER BOOKING OWNERSHIP");
        oldPayment.refund(booking);
        newPayment.pay(booking);
        booking.setPlayer(newPayment.getPlayer());
    }
}