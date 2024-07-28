package MulltiThreading;

public class SynchronizedBlockExample {
    private final Object lock = new Object(); // Object used as lock

    private int count = 0;

    public void increment() {
        synchronized (lock) { // Synchronized block
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlockExample example = new SynchronizedBlockExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count value: " + example.count); // Expected: 2000
    }
}

