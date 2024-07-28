package queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.addFirst(10);
        deque.addLast(20);
        
        deque.addFirst(5);

        System.out.println("Deque after additions: " + deque); // Output: [5, 10, 20]

        // Removing elements from the deque
        System.out.println("Removed from front: " + deque.removeFirst()); // Output: 5
        System.out.println("Removed from back: " + deque.removeLast()); // Output: 20

        System.out.println("Deque after removals: " + deque); // Output: [10]

        // Peeking at elements
        System.out.println("Front element: " + deque.getFirst()); // Output: 10
        System.out.println("Back element: " + deque.getLast()); // Output: 10
    }
}
