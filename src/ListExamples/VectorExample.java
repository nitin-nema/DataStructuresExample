package ListExamples;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of Doubles
        List<Double> vector = new Vector<>();

        // Adding elements
        vector.add(1.1);
        vector.add(2.2);
        vector.add(3.3);

        // Accessing elements
        System.out.println("First element: " + vector.get(0)); // Output: 1.1

        // Iterating through the list
        for (double number : vector) {
            System.out.println(number);
        }

        // Removing an element
        vector.remove(Double.valueOf(2.2));
        System.out.println("After removal: " + vector);
    }
}
