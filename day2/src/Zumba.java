public class Zumba extends Sport{

    Zumba(String ZumbaId, String ZumbaBuyer, String ZumbaOwner){
        id = ZumbaId;
        buyer = ZumbaBuyer;
        owner = ZumbaOwner;
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
