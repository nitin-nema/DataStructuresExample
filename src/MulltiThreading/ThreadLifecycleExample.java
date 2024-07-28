package MulltiThreading;

public class ThreadLifecycleExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(3000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread execution completed.");
        });

        System.out.println("Thread state after creation: " + thread.getState()); // NEW state

        thread.start();
        System.out.println("Thread state after start(): " + thread.getState()); // RUNNABLE state

        Thread.sleep(1000);
        System.out.println("Thread state after 1 second: " + thread.getState()); // TIMED_WAITING state

        thread.join();
        System.out.println("Thread state after join(): " + thread.getState()); // TERMINATED state
    }
}

