package trainingsixjune;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store Employee names
        ArrayList<String> employees = new ArrayList<>();

        // Adding elements to the ArrayList
        employees.add("Alice");
        employees.add("Bob");
        employees.add("Charlie");

        // Printing the ArrayList
        System.out.println("Employees: " + employees);

        // Accessing elements by index
        String firstEmployee = employees.get(0); 
        System.out.println("First Employee: " + firstEmployee);

        // Accessing all elements using a loop
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Employee at index " + i + ": " + employees.get(i)); //accessing the i-th index
        }

        // Removing an element by index
        employees.remove(1); // Removes "Bob"
        System.out.println("Employees after removal by index: " + employees);

        // Removing an element by value
        employees.remove("Alice"); // Removes "Alice"
        System.out.println("Employees after removal by value: " + employees);

        // Iterating using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        // Iterating using an iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking if the list contains an element
        boolean hasCharlie = employees.contains("Charlie");
        System.out.println("Contains Charlie? " + hasCharlie);  //value oontains

        // Getting the size of the list
        int size = employees.size();
        System.out.println("Number of employees: " + size); //length

        // Clearing the list
        employees.clear();
        System.out.println("Employees after clearing: " + employees);
    }
}

