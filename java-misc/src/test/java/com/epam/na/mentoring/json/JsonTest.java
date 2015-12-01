package com.epam.na.mentoring.json;

import com.epam.na.mentoring.planes.BoiengPlane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Vitali_Shulha on 01-Dec-15.
 */
public class JsonTest {

    @Test
    @Ignore
    public void OneCanWriteJsonToFile(){
        JSONObject obj = new JSONObject();
        BoiengPlane boiengPlane = new BoiengPlane();
        obj.put("Distance", boiengPlane.getDistance());
        obj.put("Tonnage", boiengPlane.getTonnage());
        obj.put("Peolpe", boiengPlane.getPeopleCapacity());

        try {

            FileWriter file = new FileWriter("test.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

    @Test
    public void OneCanReadJSonFromFile() {
        JSONParser parser = new JSONParser();

        Object obj = null;
        try {
            obj = parser.parse(new FileReader("test.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject) obj;

        Long distance = (Long) jsonObject.get("Distance");
        System.out.println("distance read from JSON: " + distance);

    }
}
