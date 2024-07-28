package exceptionExamples;

class CustomUncheckedException extends RuntimeException {

    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class CustomUncheckedExceptionExample {

    public static void main(String[] args) {
        try {
            throw new CustomUncheckedException("Custom unchecked exception");
        } catch (CustomUncheckedException e) {
            System.out.println("Caught CustomUncheckedException: " + e.getMessage());
        }
    }
}

