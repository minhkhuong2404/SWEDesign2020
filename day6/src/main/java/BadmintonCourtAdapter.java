public class BadmintonCourtAdapter extends BookingAdapter{
    BadmintonCourt booking;

    public BadmintonCourtAdapter(BadmintonCourt booking){
        this.booking = booking;
    }

    @Override
    public void extendBooking(int hour, int minute){
        this.booking.extendBooking(hour*60 + minute);
    }
}
