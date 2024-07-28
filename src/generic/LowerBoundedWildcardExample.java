package generic;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardExample {

    // Method to add numbers to a list
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i); // Autoboxing converts int to Integer
        }
    }

    public static void main(String[] args) {
        // Creating a List of Integers
        List<Integer> intList = new ArrayList<>();
        addNumbers(intList);
        System.out.println("intList: " + intList);

        // Creating a List of Numbers (superclass of Integer)
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println("numberList: " + numberList);

        // Creating a List of Objects (superclass of Number)
        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);
        System.out.println("objectList: " + objectList);

        // The following line would cause a compile-time error because List<Double> is not a superclass of Integer
        // List<Double> doubleList = new ArrayList<>();
        // addNumbers(doubleList);
    }
}

