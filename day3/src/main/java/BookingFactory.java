import java.util.*;

public class BookingFactory {

    private static Map<String, Booking> prototypes = new HashMap<>();

    static {
        var zumbaProto = new ZumbaClass();
        zumbaProto.setConsortiumCode("Consortium");
        zumbaProto.setActivityCode("Zumba");

        var badmintonProto = new BadmintonCourt();
        badmintonProto.setConsortiumCode("Consortium");
        badmintonProto.setActivityCode("Badminton");

        prototypes.put("zumba", zumbaProto);
        prototypes.put("badminton", badmintonProto);
    }

    public static Booking createBooking(String type, String id, String owner, String buyer) {
        var booking = prototypes.get(type).makeClone();
        booking.setId(id);
        booking.setOwner(owner);
        booking.setBuyer(buyer);
        return booking;
    }
}
