package dataIO;



import java.io.IOException;
import java.io.InputStreamReader;

public class consoleInputStreamReader {
    public static void main(String[] args) {
        System.out.println("Enter some text and press Enter: ");
        
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            int data = isr.read();
            while (data != -1 && data != '\n') { // Stop reading at the end of the line
                System.out.print((char) data);
                data = isr.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
