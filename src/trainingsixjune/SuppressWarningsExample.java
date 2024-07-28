package trainingsixjune;

import java.util.ArrayList;

public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList rawList = new ArrayList(); // Warning suppressed
        rawList.add("Hello");
        rawList.add(123);
        System.out.println(rawList);
    }
}

