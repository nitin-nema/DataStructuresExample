package generic;

public class Container<T extends Number> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>(123);
        System.out.println("Integer value: " + intContainer.getValue());
        System.out.println("Double value: " + intContainer.doubleValue());

        Container<Double> doubleContainer = new Container<>(45.67);
        System.out.println("Double value: " + doubleContainer.getValue());
        System.out.println("Double value: " + doubleContainer.doubleValue());
   
        
    }
}
