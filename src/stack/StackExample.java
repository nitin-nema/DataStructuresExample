package stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack); // Output: [10, 20, 30]

        // Peek the top element
        System.out.println("Peek: " + stack.peek()); // Output: 30

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Stack after pop: " + stack); // Output: [10, 20]

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty()); // Output: false

        // Search for an element
        System.out.println("Position of 10: " + stack.search(10)); // Output: 2
    }
}
