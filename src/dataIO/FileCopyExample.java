package dataIO;

import java.io.*;

public class FileCopyExample {

    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Create example input file for demonstration
        createExampleInputFile(inputFilePath);

        // Copy content from input file to output file
        copyFile(inputFilePath, outputFilePath);
    }

    private static void createExampleInputFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, world!\n");
            writer.write("This is a sample input file for demonstrating file I/O in Java.\n");
            writer.write("Enjoy learning Java!");
        } catch (IOException e) {
            System.err.println("Error creating example input file: " + e.getMessage());
        }
    }

    private static void copyFile(String inputFilePath, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully from " + inputFilePath + " to " + outputFilePath);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error occurred: " + e.getMessage());
        }
    }
}
