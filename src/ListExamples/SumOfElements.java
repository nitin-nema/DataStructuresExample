package ListExamples;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of elements: " + sumList(list)); // Output: 15
    }
}
