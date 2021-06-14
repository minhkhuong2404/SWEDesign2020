import org.junit.*;

public class BookingPrototypeTest {

    @Test
    public void testCreateZumba() {
        Booking booking = BookingFactory.createBooking("zumba", "booking1", "Khuong", "Lu");
        Assert.assertEquals(ZumbaClass.class, booking.getClass());
        Assert.assertEquals("Consortium", booking.getConsortiumCode());
        Assert.assertEquals("Zumba", booking.getActivityCode());
        Assert.assertEquals("booking1", booking.getId());
        Assert.assertEquals("Khuong", booking.getOwner());
        Assert.assertEquals("Lu", booking.getBuyer());
    }

    @Test
    public void testCreateBadminton() {
        Booking booking = BookingFactory.createBooking("badminton", "booking1", "Khuong", "Lu");
        Assert.assertEquals(BadmintonCourt.class, booking.getClass());
        Assert.assertEquals("Consortium", booking.getConsortiumCode());
        Assert.assertEquals("Badminton", booking.getActivityCode());
        Assert.assertEquals("booking1", booking.getId());
        Assert.assertEquals("Khuong", booking.getOwner());
        Assert.assertEquals("Lu", booking.getBuyer());
    }
}
