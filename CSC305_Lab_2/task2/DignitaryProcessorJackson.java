package task2;

import award_show.Dignitary;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DignitaryProcessorJackson {
    private static void jsonParser(String filePath){
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File(filePath);
            Dignitary dignitary = mapper.readValue(file, Dignitary.class);
            System.out.println(dignitary);
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }
    public static void main(String[] args) {
        jsonParser("/Users/Sai/CPE 305/csc305-lab-2/CSC305_Lab_2/input1.json");
        //jsonParser("/Users/Sai/CPE 305/csc305-lab-2/CSC305_Lab_2/input2.json");
        //jsonParser("/Users/Sai/CPE 305/csc305-lab-2/CSC305_Lab_2/input3.json");
    }
}
