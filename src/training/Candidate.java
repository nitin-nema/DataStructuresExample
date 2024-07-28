package training;
// encapulsation
public class Candidate {
    // Private fields (encapsulated)
    private String name;
    private int age;

    // Constructor
    public Candidate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }
// encapulsation
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) { // Validation: Ensure age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to display Candidate details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a Candidate object
        Candidate Candidate = new Candidate("Alice", 30);

        // Display initial details
        Candidate.displayDetails();

        // Update age using setter method
        Candidate.setAge(35);

        // Display updated details
        Candidate.displayDetails();
    }
}