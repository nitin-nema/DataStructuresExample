package trainingsixjune;

//Functional Interface
@FunctionalInterface
interface GreetingService {
 void sayMessage(String message);
}

public class LambdaExpressionExample {
 public static void main(String[] args) {
     // Using Lambda Expression to define the sayMessage method
     GreetingService greetService = message -> System.out.println("Hello, " + message);

     // Calling the sayMessage method
     greetService.sayMessage("Alice");
 }
}



