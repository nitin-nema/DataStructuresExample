package ListExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements
        System.out.println("First element: " + arrayList.get(0)); // Output: Apple

        // Iterating through the list
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("After removal: " + arrayList);
    }
}
