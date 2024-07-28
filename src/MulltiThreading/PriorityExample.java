package MulltiThreading;

public class PriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 priority: " + Thread.currentThread().getPriority());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 priority: " + Thread.currentThread().getPriority());
        });

        // Setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // MIN_PRIORITY = 1
        thread2.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10

        thread1.start();
        thread2.start();
    }
}

