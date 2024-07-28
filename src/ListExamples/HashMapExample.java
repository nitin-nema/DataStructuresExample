package ListExamples;


import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Retrieving a value based on the key
        System.out.println("Alice's age: " + map.get("Alice")); // Output: 30

        // Checking if a key exists
        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }

        // Removing a key-value pair
        map.remove("Charlie");

        // Iterating through the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
