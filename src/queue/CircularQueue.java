package queue;

class CircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.head = -1;
        this.tail = -1;
        this.size = 0;
    }

    // Enqueue operation
    public boolean enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return false;
        }
        if (size == 0) {
            head = 0;
        }
        tail = (tail + 1) % capacity;
        data[tail] = x;
        size++;
        return true;
    }

    // Dequeue operation
    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int result = data[head];
        head = (head + 1) % capacity;
        size--;
        if (size == 0) {
            head = -1;
            tail = -1;
        }
        return result;
    }

    // Peek operation
    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[head];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println(queue.dequeue()); // Output: 1
        queue.enqueue(4);
        
        System.out.println(queue.peek());    // Output: 2
        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4
    }
}

