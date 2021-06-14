import java.time.*;

public class ZumbaClassAdapter extends BookingAdapter {
    ZumbaClass booking;

    public ZumbaClassAdapter(ZumbaClass booking){
        this.booking = booking;
    }

    @Override
    public void extendBooking(int hour, int minute){
        LocalTime now = this.booking.getEndTime();

        this.booking.extendBooking(now.plusHours(hour).plusMinutes(minute));
    }
}
