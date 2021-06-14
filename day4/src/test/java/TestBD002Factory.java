import booking.*;
import org.junit.Assert;
import org.junit.Test;

public class TestBD002Factory {
    @Test
    public void createZumbaClass(){
        var factory = BookingAbstractFactory.getFactory(Court.BD002);
        Booking booking = factory.createZumbaClass();

        Assert.assertEquals(Zumba.class, booking.getClass());
        Assert.assertEquals(B002Factory.ZumbaPrice, booking.getPrice());
    }

    @Test
    public void createBadmintonCourt(){
        BookingAbstractFactory factory = BookingAbstractFactory.getFactory(Court.BD002);
        var booking = factory.createBadmintonCourt();

        Assert.assertEquals(Badminton.class, booking.getClass());
        Assert.assertEquals(B002Factory.BadmintonPrice, booking.getPrice());
    }
}
