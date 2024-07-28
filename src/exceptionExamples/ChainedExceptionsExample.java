package exceptionExamples;

public class ChainedExceptionsExample {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            NullPointerException newException = new NullPointerException("Custom message: NullPointerException");
            newException.initCause(e);
            throw newException;
        }
    }
}
