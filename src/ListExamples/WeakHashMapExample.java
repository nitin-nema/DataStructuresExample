package ListExamples;

import java.util.WeakHashMap;
import java.util.Map;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new WeakHashMap<>();
        String key1 = new String("Alice");
        String key2 = new String("Bob");
        map.put(key1, 30);
        map.put(key2, 25);

        System.out.println("WeakHashMap before GC: " + map);

        key1 = null;
        System.gc(); // Suggesting JVM to run garbage collector

        try {
            Thread.sleep(1000); // Wait for a second to ensure GC has run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("WeakHashMap after GC: " + map);
    }
}

