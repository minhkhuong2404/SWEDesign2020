import org.junit.*;

public class BD001FactoryTest {
    @Test
    public void testSingleTon(){
//        var factory = BookingAbstractFactory.getFactory(SportCenter.BD001);
//        Booking booking = factory.createZumbaClass();
//
//        Assert.assertEquals(ZumbaClass.class, booking.getClass());

        BD001Factory bd001a = BD001Factory.getInstance();
        BD001Factory bd001b = BD001Factory.getInstance();
//        BD001Factory bd001c = new BD001Factory();
        Assert.assertSame(bd001a, bd001b);

    }
}
