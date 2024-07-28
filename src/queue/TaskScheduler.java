package queue;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    private Queue<String> taskQueue = new LinkedList<>();

    // Add a task to the queue
    public void addTask(String task) {
        taskQueue.add(task);
        System.out.println("Added task: " + task);
    }

    // Execute the next task in the queue
    public void executeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("No tasks to execute.");
        } else {
            String task = taskQueue.poll();
            System.out.println("Executing task: " + task);
        }
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask("Backup database");
        scheduler.addTask("Send email report");
        scheduler.addTask("Clean temporary files");

        scheduler.executeTask(); // Output: Executing task: Backup database
        scheduler.executeTask(); // Output: Executing task: Send email report
        scheduler.executeTask(); // Output: Executing task: Clean temporary files
        scheduler.executeTask(); // Output: No tasks to execute.
    }
}
