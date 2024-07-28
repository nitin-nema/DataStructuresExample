package advancejava;

//Sealed Class Example
public sealed class Shape permits Circle, Rectangle {
}

final class Circle extends Shape {
 private final double radius;

 Circle(double radius) {
     this.radius = radius;
 }
}

final class Rectangle extends Shape {
 private final double width, height;

 Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }
}

//Record Example
public record Point(int x, int y) {
}

public class Java17Example {
 public static void main(String[] args) {
     Shape shape = new Circle(5.0);
     System.out.println(shape instanceof Circle); // true

     Point point = new Point(10, 20);
     System.out.println(point.x()); // 10
     System.out.println(point.y()); // 20

     String multiLineString = """
             This is a text block.
             It can span multiple lines.
             """;
     System.out.println(multiLineString);
 }
}

