// Main.java
package training;
//package com.payment.creditcard

//inheritance example
// Superclass
class Thing {
    protected String name; //attribute

    public Thing(String name) { 
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

// Subclass 1
class LivingThing extends Thing {
    private String sound;

    public LivingThing(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Sound: " + sound);
    }
}

// Subclass 2
class Vehicle extends Thing {
    private String type;

    public Vehicle(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of LivingThing and Vehicle
        LivingThing lion = new LivingThing("Lion", "Roar");
        Vehicle car = new Vehicle("Car", "Four-wheeler");

        // Displaying details
        System.out.println("Living Thing Details:");
        lion.display();

        System.out.println("\nVehicle Details:");
        car.display();
    }
}