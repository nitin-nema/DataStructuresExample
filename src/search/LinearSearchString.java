package search;

public class LinearSearchString {

    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date"};
        String target = "cherry";
        int result = linearSearch(arr, target);
        System.out.println("Target found at index: " + result); // Output: 2
    }
}
