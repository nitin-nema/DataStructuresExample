package ListExamples;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        System.out.println("ConcurrentHashMap: " + map);
    }
}
