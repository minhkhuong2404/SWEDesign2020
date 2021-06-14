
public class Badminton extends Sport {

    Badminton(String BadmintonId, String BadmintonBuyer, String BadmintonOwner){
        id = BadmintonId;
        buyer = BadmintonBuyer;
        owner = BadmintonOwner;

    }

    @Override
    public String getBuyer() {
        return super.getBuyer();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }
}
