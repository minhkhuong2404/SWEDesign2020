public class Service {
    public void createZumba(){
        Zumba zumba = new Zumba("2","Hi","Hello");
        JSONObject zumbaJson = new JSONObject();
        zumbaJson.put("id", zumba.getId());
        zumbaJson.put("buyer", zumba.getBuyer());
        zumbaJson.put("owner", zumba.getOwner());
    }
}
