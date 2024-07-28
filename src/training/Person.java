package training;
//degfault constuctor
//Person.java
//public class Person {
// private String name;
// private int age;
//
// // Default constructor
// public Person() {
//     // Initialize fields with default values
//     this.name = "Unknown";
//     this.age = 0;
// }
//
// // Method to display person details
// public void displayDetails() {
//     System.out.println("Name: " + name);
//     System.out.println("Age: " + age);
// }
//
// public static void main(String[] args) {
//     // Creating an object using the default constructor
//     Person person1 = new Person();
//     person1.displayDetails();
// }
//}


//Combined example (parmaterized and Default)
Person.java
public class Person {
 private String name;
 private int age;

 // Default constructor -- passing values
 public Person() {
     // Initialize fields with default values
     this.name = "Unknown";
     this.age = 0;
 }
 
 // Parmaterized constructor
 public Person(String name, int age) {
     // Initialize fields with default values
     this.name = name;
     this.age = age;
 }
 

 // Method to display person details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }

 public static void main(String[] args) {
     // Creating an object using the default constructor
     Person person1 = new Person();
     person1.displayDetails();
     
     Person person2 = new Person("Appx",30);
     
     person2.displayDetails();
 }
}

