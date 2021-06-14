public class BikeRent extends Sport{
    BikeRent(String BikeRentId, String BikeRentBuyer, String BikeRentOwner){
        id = BikeRentId;
        buyer = BikeRentBuyer;
        owner = BikeRentOwner;
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getBuyer() {
        return super.getBuyer();
    }
}
