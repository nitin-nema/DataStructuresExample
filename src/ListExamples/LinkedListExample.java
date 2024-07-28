package ListExamples;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Integers
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Accessing elements
        System.out.println("First element: " + linkedList.get(0)); // Output: 10

        // Iterating through the list
        for (int number : linkedList) {
            System.out.println(number);
        }

        // Removing an element
        linkedList.remove(Integer.valueOf(20));
        System.out.println("After removal: " + linkedList);
    }
}
