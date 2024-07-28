package stack;

public class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Indicates that the stack is initially empty
    }

    // Push operation to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value; // Increment top and add value
    }

    // Pop operation to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 or handle it according to your preference
        }
        return stackArray[top--]; // Return top element and decrement top
    }

    // Peek operation to retrieve the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return -1 or handle it according to your preference
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        // Testing push operation
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After pushing 10, 20, 30:");
        System.out.println("Peek: " + stack.peek()); // Output: 30

        // Testing pop operation
        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Peek after pop: " + stack.peek()); // Output: 20

        // Testing peek operation
        System.out.println("Peek: " + stack.peek()); // Output: 20

        // Testing edge cases
        stack.pop(); // Popped 20
        stack.pop(); // Popped 10
        System.out.println("Peek after popping all elements: " + stack.peek()); // Output: Stack is empty. Cannot peek. -1
        System.out.println("Pop from empty stack: " + stack.pop()); // Output: Stack is empty. Cannot pop. -1

        // Pushing more elements to test full stack scenario
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90); // Output: Stack is full. Cannot push 90
    }
}

