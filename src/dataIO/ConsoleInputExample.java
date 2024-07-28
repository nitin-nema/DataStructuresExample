package dataIO;

import java.io.IOException;

public class ConsoleInputExample {
    public static void main(String[] args) {
        System.out.println("Enter some text and press Enter: ");
        
        try {
            int data = System.in.read();
            while (data != -1 && data != '\n') { // Stop reading at the end of the line
                System.out.print((char) data);
                data = System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
