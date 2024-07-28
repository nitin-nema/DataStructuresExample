package ListExamples;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        System.out.println("HashMap: " + map);
    }
}
