package environment.service;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FetchAirQData implements AirData{
    String Data;
    String JsonData = "";

    @Override
    public long FetchData() throws IOException, ParseException {

        URL con = new URL("https://api.waqi.info/feed/here/?token=d51ef94ef3ee749ffd4c259f14877ff889d462e8");
        HttpsURLConnection conec = (HttpsURLConnection) con.openConnection();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(conec.getInputStream()))) {
            while ((Data = br.readLine()) != null) {
                JsonData += Data;

            }
        } catch (Exception e) {
            System.out.println("Error Occured In Loading Data " + e.getMessage().toString());
        }
        JSONParser parse = new JSONParser();
        JSONObject obj1 = (JSONObject) parse.parse(JsonData);
        JSONObject obj2 = (JSONObject) obj1.get("data");
        return (long) obj2.get("aqi");
    }
}
