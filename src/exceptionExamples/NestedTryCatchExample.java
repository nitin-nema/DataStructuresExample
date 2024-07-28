package exceptionExamples;

public class NestedTryCatchExample {

    public static void main(String[] args) {
        try {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
                throw new ArithmeticException("ArithmeticException thrown from inner catch");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Caught ArithmeticException: " + e.getMessage());
        }
    }
}

