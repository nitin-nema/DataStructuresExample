package trainingsixjune;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomCheckedExceptionExample {
	

	public void validAge(int age) throws InvalidAgeException {
		if(age <18) {
			throw new InvalidAgeException("Age must bne 18+");
		}
		System.out.println("Age is valid");
	}
	
	public static void main(String[] args) {
		CustomCheckedExceptionExample example = new CustomCheckedExceptionExample();
		
		try {
			example.validAge(16);
		} catch (InvalidAgeException e) {
			System.out.println("Cought inavlidageaxcetpion " +  e.getMessage());
		}
	}
}


