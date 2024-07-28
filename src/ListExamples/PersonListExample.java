package ListExamples;


import java.util.ArrayList;
import java.util.List;


public class PersonListExample {
    public static void main(String[] args) {
        // Create a List of Person objects
        List<Person> personList = new ArrayList<>();

        // Adding Person objects to the list
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 25));
        personList.add(new Person("Charlie", 35));

        // Accessing elements
        System.out.println("First person: " + personList.get(0)); // Output: Person{name='Alice', age=30}

        // Iterating through the list
        System.out.println("All persons:");
        for (Person person : personList) {
            System.out.println(person);
        }

        // Modifying an element
        Person firstPerson = personList.get(0);
        firstPerson.setAge(31);
        System.out.println("Modified first person: " + firstPerson); // Output: Person{name='Alice', age=31}

        // Removing an element
        personList.remove(1); // Remove the second person (Bob)
        System.out.println("After removal:");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
