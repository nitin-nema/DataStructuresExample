package ListExamples;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class CheckDuplicates {
    public static boolean hasDuplicates(List<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : list) {
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 1);
        
        System.out.println("List 1 has duplicates: " + hasDuplicates(list1)); // Output: false
        System.out.println("List 2 has duplicates: " + hasDuplicates(list2)); // Output: true
    }
}
