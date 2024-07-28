package generic;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }

    public static void main(String[] args) {
        // Creating a Pair of Integer and String
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        System.out.println(pair1);

        // Creating a Pair of String and Boolean
        Pair<String, Boolean> pair2 = new Pair<>("Active", true);
        System.out.println(pair2);
    }
}
