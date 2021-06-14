import java.time.LocalTime;

public class ZumbaClass extends Booking {

    public void extendBooking(LocalTime time) {
        System.out.println("Booking has been extended until " + time.toString());
    }

}