public abstract class BookingAbstractFactory {
    private static final BD001Factory bd001 = BD001Factory.getInstance();
    static BookingAbstractFactory getFactory(SportCenter sportcenter){
        BookingAbstractFactory factory = null;
        switch (sportcenter) {
            case BD001:
                factory = bd001;
                break;
        }
        return factory;
    }
    public abstract ZumbaClass createZumbaClass();

}
