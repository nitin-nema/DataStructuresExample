package trainingsixjune;

public class GenericMethodExample {
    // Generic method to swap elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("After swap: " + java.util.Arrays.toString(intArray));

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("Before swap: " + java.util.Arrays.toString(strArray));
        swap(strArray, 0, 2);
        System.out.println("After swap: " + java.util.Arrays.toString(strArray));
    }
}

