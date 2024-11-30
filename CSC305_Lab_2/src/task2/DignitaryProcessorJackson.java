 package task2;

 import award_show.Dignitary;
 import com.fasterxml.jackson.databind.ObjectMapper;

 import java.io.File;
 import java.io.IOException;
 import java.nio.file.Files;
 import java.nio.file.Paths;

 public class DignitaryProcessorJackson {
     private static void jsonParser(String filePath){
         ObjectMapper mapper = new ObjectMapper();
         try {
             File file = new File(filePath);
             Dignitary dignitary = mapper.readValue(file, Dignitary.class);
             System.out.println(dignitary);
         } catch (IOException e) {
             System.out.println("ObjectMapper failed: " + e.getMessage());
             e.printStackTrace();
         }

     }
     public static void main(String[] args) {
         System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
         jsonParser("CSC305_Lab_2/input1.json");
         jsonParser("CSC305_Lab_2/input2.json");
         jsonParser("CSC305_Lab_2/input3.json");
    }
}
