package search;

public class FirstOccurrence {

    public static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 2, 5, 8};
        int target = 5;

        int index = findFirstOccurrence(numbers, target);
        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
