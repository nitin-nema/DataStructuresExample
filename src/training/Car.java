package training;

//class example


//Car.java
public class Car {
	
 // Fields/properties
	
 private String make;
 private String model;
 private int year;

 // Constructor
 public Car(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 // Method to display car details
 public void displayDetails() {
     System.out.println("Car Details:");
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
 }

 // Main method
 public static void main(String[] args) {
     // Creating objects of Car class
     Car car1 = new Car("Toyota", "Corolla", 2020);
     Car car2 = new Car("Honda", "Civic", 2019);

     // Calling methods on objects
     car1.displayDetails();
     car2.displayDetails();
 }
}