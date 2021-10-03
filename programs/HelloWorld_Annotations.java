import java.lang.reflect.Method;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class HelloWorld_Annotations {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Method m = HelloWorld_Annotations.class.getDeclaredMethod("printByAnnotation");
        HelloWorldAnnotation annotation = m.getAnnotation(HelloWorldAnnotation.class);
        System.out.println(annotation.message());
    }

    @HelloWorldAnnotation
    private static void printByAnnotation() {

    }
}

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface HelloWorldAnnotation {
    String message() default "Hello, world";
}