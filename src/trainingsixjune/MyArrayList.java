package trainingsixjune;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
    }

    // Add element to the list
    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // Get element from the list
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    // Remove element from the list
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        @SuppressWarnings("unchecked")
        T removedElement = (T) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; // Clear to let GC do its work
        return removedElement;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Ensure the capacity of the list
    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    // Check if the list contains an element
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Clear the list
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    // Print the elements of the list
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        // Demonstration of MyArrayList usage
        MyArrayList<String> myList = new MyArrayList<>();

        // Adding elements
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        System.out.println("MyArrayList after adding elements: " + myList);

        // Accessing elements
        System.out.println("Element at index 1: " + myList.get(1));

        // Removing elements
        myList.remove(1);
        System.out.println("MyArrayList after removing element at index 1: " + myList);

        // Checking size
        System.out.println("Size of MyArrayList: " + myList.size());

        // Checking if an element is present
        System.out.println("Contains 'Charlie'? " + myList.contains("Charlie"));

        // Clearing the list
        myList.clear();
        System.out.println("MyArrayList after clearing: " + myList);
    }
}
