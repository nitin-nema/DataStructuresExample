package advancejava;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        Object obj = "Hello, Java 21";

        String result = switch (obj) {
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
