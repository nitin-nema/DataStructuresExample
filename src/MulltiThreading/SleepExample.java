package MulltiThreading;

public class SleepExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is sleeping...");
                Thread.sleep(3000); // Sleep for 3 seconds
                System.out.println("Thread woke up after sleeping.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }
}

