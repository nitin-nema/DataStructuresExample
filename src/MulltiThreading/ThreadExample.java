package MulltiThreading;

public class ThreadExample {
    public static void main(String[] args) {
        // Creating threads using Thread class
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");

        // Starting threads
        thread1.start();
        thread2.start();

        // Main thread continues execution
        System.out.println("Main thread continues...");

        // Wait for threads to finish (optional)
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }

    // Custom thread class extending Thread
    static class MyThread extends Thread {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                try {
                    sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(name + " finished.");
        }
    }
}
