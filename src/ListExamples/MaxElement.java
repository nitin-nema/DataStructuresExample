package ListExamples;

import java.util.Arrays;
import java.util.List;

public class MaxElement {
    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 7, 2, 8);
        System.out.println("Maximum element: " + findMax(list)); // Output: 8
    }
}
