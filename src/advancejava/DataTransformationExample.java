package advancejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataTransformationExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");

        // Transform the words to uppercase and collect them into a list
        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println(upperCaseWords); // Output: [JAVA, STREAM, API]
    }
}
