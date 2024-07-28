package queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Print the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Peek at the head of the PriorityQueue
        System.out.println("Head of the queue: " + pq.peek());

        // Remove the head of the PriorityQueue
        System.out.println("Removed from queue: " + pq.poll());

        // Print the PriorityQueue after removal
        System.out.println("PriorityQueue after removal: " + pq);

        // Add more elements
        pq.offer(5);
        pq.offer(30);

        // Print the PriorityQueue
        System.out.println("PriorityQueue after adding elements: " + pq);

        // Check the size of the PriorityQueue
        System.out.println("Size of the PriorityQueue: " + pq.size());

        // Clear the PriorityQueue
        pq.clear();
        System.out.println("PriorityQueue after clearing: " + pq.isEmpty());
    }
}
