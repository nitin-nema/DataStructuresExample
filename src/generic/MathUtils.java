package generic;

import java.util.Arrays;
import java.util.List;

public class MathUtils {

    public static <T extends Number> double sum(List<T> numbers) {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of intList: " + sum(intList));

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of doubleList: " + sum(doubleList));

        // The following line would cause a compile-time error because String does not extend Number
        // List<String> stringList = Arrays.asList("one", "two", "three");
        // System.out.println("Sum of stringList: " + sum(stringList));
    }
}

