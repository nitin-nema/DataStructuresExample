package trainingsixjune;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation {
    String value() default "default value";
    int number() default 0;
}

//Applying
@MyCustomAnnotation(value = "Example Class", number = 10)
public class CustomAnnotationExample {
    @MyCustomAnnotation(value = "Example Method", number = 5)
    public void annotatedMethod() {
        System.out.println("This method is annotated");
    }

    public static void main(String[] args) {
        CustomAnnotationExample example = new CustomAnnotationExample();
        example.annotatedMethod();

        // Accessing annotation values at runtime
        Class<?> obj = example.getClass();
        if (obj.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = obj.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Class Annotation: value = " + annotation.value() + ", number = " + annotation.number());
        }

        try {
            MyCustomAnnotation methodAnnotation = obj.getMethod("annotatedMethod").getAnnotation(MyCustomAnnotation.class);
            System.out.println("Method Annotation: value = " + methodAnnotation.value() + ", number = " + methodAnnotation.number());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

