package advancejava;

import java.util.Arrays;
import java.util.List;

public class Java8Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

        // Using lambda expressions and Stream API
        names.stream()
             .filter(name -> name.startsWith("J"))
             .forEach(System.out::println);
    }
}
