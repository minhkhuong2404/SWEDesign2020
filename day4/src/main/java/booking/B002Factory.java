package booking;

public class B002Factory extends BookingAbstractFactory {
    public static final int ZumbaPrice = 150;
    public static final int BadmintonPrice = 300;

    @Override
    public Zumba createZumbaClass(){
        Zumba zumbaClass = new Zumba();
        zumbaClass.setPrice(ZumbaPrice);
        return zumbaClass;
    }

    @Override
    public Badminton createBadmintonCourt() {
        Badminton badmintonCourt = new Badminton();
        badmintonCourt.setPrice(BadmintonPrice);
        return badmintonCourt;
    }
}
