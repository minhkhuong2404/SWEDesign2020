public class BD001Factory extends BookingAbstractFactory{
    private static BD001Factory bd001;

    private BD001Factory(){
    }

    public static BD001Factory getInstance(){
        if (bd001 == null){
            bd001 = new BD001Factory();
        }
        return bd001;
    }

    @Override
    public ZumbaClass createZumbaClass() {
        ZumbaClass zumbaclass = new BD001ZumbaClass();
        return zumbaclass;
    }
}
