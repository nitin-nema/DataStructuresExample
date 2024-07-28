package trainingsixjune;

//unchecked custom exception

class InsufficentFundException extends RuntimeException{
	public InsufficentFundException(String message) {
		super(message);
	}
}

public class CustomRunTimeException {
	

	public void withdraw(double amount, double balance) throws InsufficentFundException {
		if(amount > balance) {
			throw new InsufficentFundException("Insufficent fund for this transcation");
		}
		System.out.println("Trsnsction Successful");
	}
	
	public static void main(String[] args) {
		CustomRunTimeException example = new CustomRunTimeException();
		
		try {
			example.withdraw(2000,200);
		} catch (InsufficentFundException e) {
			System.out.println("Cought insufficent fund---- " +  e.getMessage());
		}
	}
}