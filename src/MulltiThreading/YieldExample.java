package MulltiThreading;

public class YieldExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 executing...");
                Thread.yield(); // Yield control to other threads
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 executing...");
                Thread.yield(); // Yield control to other threads
            }
        });

        thread1.start();
        thread2.start();
    }
}
