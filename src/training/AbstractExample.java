package training;

// Interface
interface Drawable {
    void draw();
}

// Abstract Class
abstract class Shape implements Drawable {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Abstract method to calculate area
    public abstract double area();
}

// Circle Class
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Override abstract method to calculate area
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implement draw method from the Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing Circle with color: " + getColor());
    }
}

// Rectangle Class
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Override abstract method to calculate area
    @Override
    public double area() {
        return length * width;
    }

    // Implement draw method from the Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with color: " + getColor());
    }
}

// Main Class
public class AbstractExample {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 3);

        // Displaying area and drawing
        System.out.println("Circle Area: " + circle.area());
        circle.draw();

        System.out.println("Rectangle Area: " + rectangle.area());
        rectangle.draw();
    }
}