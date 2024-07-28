package exceptionExamples;

public class FinallyBlockExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException: divide by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
