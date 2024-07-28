package trainingsixjune;


//Generic class Box
class Box<T> {
 private T item;

 public void setItem(T item) {
     this.item = item;
 }

 public T getItem() {
     return item;
 }
}

public class GenericBoxExample {
 public static void main(String[] args) {
     // Using Box with Integer
     Box<Integer> integerBox = new Box<>();
     integerBox.setItem(123);
     System.out.println("Integer Value: " + integerBox.getItem());

     // Using Box with String
     Box<String> stringBox = new Box<>();
     stringBox.setItem("Hello Generics");
     System.out.println("String Value: " + stringBox.getItem());
 }
}

//public class GenericBoxExample {
//    public static void main(String[] args) {
//        // Using Box with Integer
//        Box<Integer> integerBox = new Box<>();
//        integerBox.setItem(123);
//        System.out.println("Integer Value: " + integerBox.getItem());
//
//        // Using Box with String
//        Box<String> stringBox = new Box<>();
//        stringBox.setItem("Hello Generics");
//        System.out.println("String Value: " + stringBox.getItem());
//    }
//}

