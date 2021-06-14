package booking;

public class B001Factory extends BookingAbstractFactory {
    public static final int ZumbaPrice = 100;
    public static final int BadmintonPrice = 50;

    @Override
    public Booking createZumbaClass(){
        Booking zumbaClass = new Zumba();
        zumbaClass.setPrice(ZumbaPrice);
        return zumbaClass;
    }

    @Override
    public Booking createBadmintonCourt(){
        Booking badmintonCourt = new Badminton();
        badmintonCourt.setPrice(BadmintonPrice);
        return badmintonCourt;
    }
}
