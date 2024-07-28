package generic;
import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcardExample {

    // Method to calculate the sum of a list of numbers
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Creating a List of Integers
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // Creating a List of Doubles
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        // Using the sumOfList method to calculate the sum of both lists
        System.out.println("Sum of intList: " + sumOfList(intList));
        System.out.println("Sum of doubleList: " + sumOfList(doubleList));
    }
}
