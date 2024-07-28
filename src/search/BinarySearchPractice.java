package search;

public class BinarySearchPractice {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index if target is found
            } else if (arr[mid] < target) {
                low = mid + 1; // Target is in the upper half
            } else {
                high = mid - 1; // Target is in the lower half
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int result = binarySearch(arr, target);
        System.out.println("Target found at index: " + result); // Output: 4
    }
}
