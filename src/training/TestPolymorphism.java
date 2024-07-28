package training;

//Superclass
class Animal {
 // Method to be overridden
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass
class Dog extends Animal {
 // Overriding the sound method
 @Override
 public void sound() {
     System.out.println("Dog barks");
 }
}

//Another Subclass
class Cat extends Animal {
 // Overriding the sound method
 @Override
 public void sound() {
     System.out.println("Cat meows");
 }
}

public class TestPolymorphism {
 public static void main(String[] args) {
     // Creating objects of subclasses
     Animal myDog = new Dog();
     Animal myCat = new Cat();

     // Calling the overridden methods
     myDog.sound(); // Outputs: Dog barks
     myCat.sound(); // Outputs: Cat meows
 }
}