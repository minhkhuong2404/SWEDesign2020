public abstract class Booking implements Prototype{
    private String activityCode;
    private String consortiumCode;
    private String id;
    private String owner;
    private String buyer;

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getConsortiumCode() {
        return consortiumCode;
    }

    public void setConsortiumCode(String consortiumCode) {
        this.consortiumCode = consortiumCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }
}
