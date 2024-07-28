package generic;

import java.util.HashMap;
// Hash map is datastucture  allow you to  store the keyvalue pair, retrival with key is more efficent

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with String keys and Integer values
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        // Printing the elements of the HashMap
        for (String name : ageMap.keySet()) {
            System.out.println(name + ": " + ageMap.get(name));
        }

        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> idMap = new HashMap<>();
        idMap.put(1, "Alice");
        idMap.put(2, "Bob");
        idMap.put(3, "Charlie");

        // Printing the elements of the HashMap
        for (Integer id : idMap.keySet()) {
            System.out.println(id + ": " + idMap.get(id));
        }
    }
}
