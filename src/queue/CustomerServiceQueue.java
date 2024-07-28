package queue;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerServiceQueue {
    private Queue<String> customerQueue = new LinkedList<>();

    // Add a customer to the queue
    public void addCustomer(String customer) {
        customerQueue.add(customer);
        System.out.println("Added customer: " + customer);
    }

    // Serve the next customer in the queue
    public void serveCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers to serve.");
        } else {
            String customer = customerQueue.poll();
            System.out.println("Serving customer: " + customer);
        }
    }

    public static void main(String[] args) {
        CustomerServiceQueue queue = new CustomerServiceQueue();
        queue.addCustomer("Alice");
        queue.addCustomer("Bob");
        queue.addCustomer("Charlie");
`
        queue.serveCustomer(); // Output: Serving customer: Alice
        queue.serveCustomer(); // Output: Serving customer: Bob
        queue.serveCustomer(); // Output: Serving customer: Charlie
        queue.serveCustomer(); // Output: No customers to serve.
    }
}

