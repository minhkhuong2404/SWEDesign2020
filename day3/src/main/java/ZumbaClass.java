public class ZumbaClass extends Booking{

    public Booking makeClone() {
        Booking booking;
        try {
            booking = (ZumbaClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

        return booking;
    }
}
