package trainingsixjune;

import java.util.ArrayList; // implemtion type collection framework
import java.util.Collections; // Algortitm type collection framework

import java.util.List;  // Interface type collection framework

public class ListExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Accessing elements
        System.out.println("First name: " + names.get(0));

        // Iterating over the list
        for (String name : names) {
            System.out.println(name);
        }

        // Sorting the list
        Collections.sort(names);
        System.out.println("Sorted names: " + names);

        // Removing an element
        names.remove("Charlie");
        System.out.println("Names after removal: " + names);
    }
}
