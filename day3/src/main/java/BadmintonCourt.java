public class BadmintonCourt extends Booking{

    public Booking makeClone() {
        Booking booking;
        try {
            booking = (BadmintonCourt) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

        return booking;
    }
}
