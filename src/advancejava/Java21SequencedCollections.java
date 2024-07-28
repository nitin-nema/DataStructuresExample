package advancejava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.SequencedCollection;

public class Java21SequencedCollections {
    public static void main(String[] args) {
        SequencedCollection<String> sequencedList = List.of("one", "two", "three");

        for (String element : sequencedList) {
            System.out.println(element);
        }

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("first");
        deque.addLast("last");

        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());
    }
}
