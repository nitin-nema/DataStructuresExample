package dataIO;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonWriteExample {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Jane Doe");
        user.setAge(25);
        user.setEmail("jane.doe@example.com");

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("user.json"), user);
            System.out.println("JSON written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
