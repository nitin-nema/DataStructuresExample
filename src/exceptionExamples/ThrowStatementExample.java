package exceptionExamples;

public class ThrowStatementExample {

    public static void main(String[] args) {
        try {
            throw new NullPointerException("Custom message: Object is null");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
