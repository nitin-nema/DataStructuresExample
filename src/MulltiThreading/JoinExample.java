package MulltiThreading;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running...");
            try {
                Thread.sleep(2000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 completed.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running...");
            try {
                Thread.sleep(3000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 completed.");
        });

        thread1.start();
        thread2.start();

        thread1.join(); // Main thread waits for thread1 to finish
        System.out.println("Thread 1 joined.");

        thread2.join(); // Main thread waits for thread2 to finish
        System.out.println("Thread 2 joined.");

        System.out.println("Main thread exiting.");
    }
}
