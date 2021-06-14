import java.time.LocalTime;

public class BookingDemo {

    public static void main(String[] args) {

        LocalTime endTime = LocalTime.of(10, 0);

        BadmintonCourt badminton = new BadmintonCourt();
        badminton.setEndTime(endTime);
        ZumbaClass zumba = new ZumbaClass();
        zumba.setEndTime(endTime);

        BadmintonCourtAdapter badmintonCourtAdapter = new BadmintonCourtAdapter(badminton);

        ZumbaClassAdapter zumbaClassAdapter = new ZumbaClassAdapter(zumba);

        BookingAdapter[] bookings = {badmintonCourtAdapter, zumbaClassAdapter};

        for(BookingAdapter booking: bookings) {
            booking.extendBooking(2,30);

        }

    }
}