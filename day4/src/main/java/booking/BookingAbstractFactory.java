package booking;

public abstract class BookingAbstractFactory {
    private static final B001Factory bd001 = new B001Factory();
    private static final B002Factory bd002 = new B002Factory();

    public static BookingAbstractFactory getFactory(Court court){
        BookingAbstractFactory factory = null;
        switch (court){
            case BD001:
                factory = bd001;
                break;
            case BD002:
                factory = bd002;
                break;
        }
        return factory;
    }

    public abstract Booking createZumbaClass();

    public abstract Booking createBadmintonCourt();
}
