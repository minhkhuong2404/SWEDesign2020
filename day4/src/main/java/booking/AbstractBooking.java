package booking;

public abstract class AbstractBooking implements Booking{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
