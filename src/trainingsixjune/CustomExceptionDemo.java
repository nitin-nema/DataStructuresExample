package trainingsixjune;


public class CustomExceptionDemo {
	public class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
    	CustomExceptionDemo example = new CustomExceptionDemo();
        try {
            example.validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        }
    }
}
