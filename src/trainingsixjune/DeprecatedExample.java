package trainingsixjune;

class DeprecatedExample {
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }

    void newMethod() {
        System.out.println("This method is not deprecated");
    }

    public static void main(String[] args) {
        DeprecatedExample example = new DeprecatedExample();
        example.oldMethod(); // Warning: This method is deprecated
        example.newMethod();
    }
}
 