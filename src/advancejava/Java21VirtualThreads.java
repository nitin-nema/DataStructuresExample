package advancejava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java21VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        
        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                System.out.println("Running in a virtual thread: " + Thread.currentThread());
            });
        }

        executor.shutdown();
    }
}
