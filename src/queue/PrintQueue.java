package queue;
import java.util.LinkedList; //structure
import java.util.Queue;   //operation

public class PrintQueue {
    private Queue<String> printQueue = new LinkedList<>();

    // Add a print job to the queue
    public void addJob(String job) {
        printQueue.add(job);
        System.out.println("Added print job: " + job);
    }

    // Process the next print job in the queue
    public void processJob() {
        if (printQueue.isEmpty()) {
            System.out.println("No print jobs to process.");
        } else {
            String job = printQueue.poll();
            System.out.println("Processing print job: " + job);
        }
    }

    public static void main(String[] args) {
        PrintQueue queue = new PrintQueue();
        queue.addJob("Document1.pdf");
        queue.addJob("Photo.png");
        queue.addJob("Report.docx");

        queue.processJob(); // Output: Processing print job: Document1.pdf
        queue.processJob(); // Output: Processing print job: Photo.png
        queue.processJob(); // Output: Processing print job: Report.docx
        queue.processJob(); // Output: No print jobs to process.
    }
}

