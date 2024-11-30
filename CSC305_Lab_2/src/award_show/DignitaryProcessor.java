package award_show;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class DignitaryProcessor {
    public static void jsonParser(String filePath) {
        File file = new File(filePath);
        try {
            String content = new String(Files.readAllBytes(Paths.get(file.toURI())));
            JSONObject dignitary = new JSONObject(content);
            JSONArray awardsJSON = dignitary.getJSONArray("awards");
            List<Award> awards = new ArrayList<>();
            for (int i = 0; i < awardsJSON.length(); i++) {
                JSONObject awardJSON = awardsJSON.getJSONObject(i);
                String name = awardJSON.getString("name");
                int year = awardJSON.getInt("year");
                Award award = new Award(name, year);
                awards.add(award);
            }
            JSONArray knownForJSON = dignitary.getJSONArray("knownFor");
            List<String> knownFor = new ArrayList<>();
            for (int i = 0; i < knownForJSON.length(); i++) {
                String knownForItem = knownForJSON.getString(i);
                knownFor.add(knownForItem);
            }
            String name = dignitary.getString("name");
            Dignitary person = new Dignitary(awards, knownFor, name);
            System.out.println(person);
        } catch (IOException e) {
            System.out.println("File not found");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
//        jsonParser("C:/Users/Sai/CPE 305/csc305-lab-2-sairama02/CSC305_Lab_2/input1.json");
//        //jsonParser("CSC305_Lab_2/input2.json");
//        //jsonParser("CSC305_Lab_2/input3.json");
//    }
}