// inbuilt Genrric Arraylist 
package generic;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Printing the elements of the ArrayList
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // Creating an ArrayList of Integers
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // Printing the elements of the ArrayList
        for (int number : intList) {
            System.out.println(number);
        }
    }
}
