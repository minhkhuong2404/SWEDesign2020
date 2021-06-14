import org.json.*;

import java.io.*;
import java.util.*;

public class GeneralService {

    public static void main(String[ ] args) throws JSONException, FileNotFoundException {

        Service service = new Service();
        service.createZumba();

        Badminton badminton = new Badminton("1","Hieu", "Khuong");
        JSONObject badmintonJson = new JSONObject();
        JSONArray listOfBadminton = new JSONArray();
//        Map<String, String> badmintonBooking = new LinkedHashMap<>(3);

        badmintonJson.put("id", badminton.getId());
        badmintonJson.put("buyer", badminton.getBuyer());
        badmintonJson.put("owner", badminton.getOwner());

        listOfBadminton.put(badmintonJson);

        Sport badminton2 = new Badminton("10","Hieu2", "Khuong");
        JSONObject badmintonJson2 = new JSONObject();

        badmintonJson2.put("id", badminton2.getId());
        badmintonJson2.put("buyer", badminton2.getBuyer());
        badmintonJson2.put("owner", badminton2.getOwner());

        listOfBadminton.put(badmintonJson2);

        Badminton badminton3 = new Badminton("100","Hieu3", "Khuong");
        JSONObject badmintonJson3 = new JSONObject();

        badmintonJson3.put("id", badminton3.getId());
        badmintonJson3.put("buyer", badminton3.getBuyer());
        badmintonJson3.put("owner", badminton3.getOwner());

        listOfBadminton.put(badmintonJson3);

        JSONObject allBadminton = new JSONObject();
        allBadminton.put("badminton", listOfBadminton);

        PrintWriter pw = new PrintWriter("JSONExample.json");
        pw.write(String.valueOf(allBadminton));

        pw.flush();
        pw.close();

        Zumba zumba = new Zumba("2","Hi","Hello");
        JSONObject zumbaJson = new JSONObject();
        zumbaJson.put("id", zumba.getId());
        zumbaJson.put("buyer", zumba.getBuyer());
        zumbaJson.put("owner", zumba.getOwner());

        BikeRent bikeRent = new BikeRent("3","Anna","Bob");
        JSONObject bikeRentJson = new JSONObject();
        bikeRentJson.put("id", bikeRent.getId());
        bikeRentJson.put("buyer", bikeRent.getBuyer());
        bikeRentJson.put("owner", bikeRent.getOwner());


    }
}
