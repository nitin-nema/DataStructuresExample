package trainingsixjune;

import java.io.*;

public class ExceptionExample {

    // Method demonstrating a checked exception
    public void readFile() throws IOException {
        FileReader file = new FileReader("somefile.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new IOException("File not found");
    }

    // Method demonstrating an unchecked exception
    public void divide(int a, int b) {
        int result = a / b; // Might throw ArithmeticException
    }

    public void recusriveMethod() {
    	recusriveMethod();
    }
    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        
        // Handling checked exception
        try {
            example.readFile();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        // Handling unchecked exception
        try {
            example.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        
        try {
        	example.recusriveMethod();
        } catch (StackOverflowError e) {
        	System.out.println("Caought Stackoverfloweception:" + e.getMessage() );
        }
    }
}
