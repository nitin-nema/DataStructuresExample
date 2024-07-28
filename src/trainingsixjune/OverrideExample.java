package trainingsixjune;

class Parent {
    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display method");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(); // Output: Child display method
    }
}
