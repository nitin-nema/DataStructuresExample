package generic;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardExample {

    // Method to print elements of any type of list
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        // Creating a List of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Creating a List of Integers
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // Using the printList method to print both lists
        System.out.println("Printing stringList:");
        printList(stringList);

        System.out.println("Printing intList:");
        printList(intList);
    }
}

