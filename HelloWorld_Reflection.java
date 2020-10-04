import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * This class prints hello world, using several objects and methods.
 * The point was to instantiate objects and invoke methods via Java Reflection for fun.
 */
public class HelloWorld_Reflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        //Creating an instance of HelloWorld_Reflection
        Class<?> parentClass = Class.forName("HelloWorld_Reflection");
        Object parentInstance = parentClass.newInstance();

        //Creating an instance of ClassWithHelloWorldFields
        Class<?> innerClass = Class.forName("HelloWorld_Reflection$ClassWithHelloWorldFields");
        Constructor<?> constructorForInnerClass = innerClass.getDeclaredConstructor(HelloWorld_Reflection.class);
        ClassWithHelloWorldFields innerClassInstance = (ClassWithHelloWorldFields) constructorForInnerClass.newInstance(parentInstance);

        //Invoking method ClassWithHelloWorldFields.printHelloWorld
        Method printHelloWorldMethod = ClassWithHelloWorldFields.class.getDeclaredMethod("printHelloWorld");
        printHelloWorldMethod.invoke(innerClassInstance);
    }

    class ClassWithHelloWorldFields {

        private final String hello = null;
        private final String world = null;

        public void printHelloWorld() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
            //Might as well create the StringBuilder object via reflection too
            Class<?> stringBuilderClass = Class.forName("java.lang.StringBuilder");
            StringBuilder stringBuilder = (StringBuilder) stringBuilderClass.getDeclaredConstructor().newInstance();

            Method capitaliseFirstLetterMethod = ClassWithHelloWorldFields.class.getDeclaredMethod("capitaliseFirstLetter", String.class);
            Method append = stringBuilderClass.getDeclaredMethod("append", String.class);

            append.invoke(stringBuilder, capitaliseFirstLetterMethod.invoke(this, this.getClass().getDeclaredFields()[0].getName()));
            append.invoke(stringBuilder, ", ");
            append.invoke(stringBuilder, capitaliseFirstLetterMethod.invoke(this, this.getClass().getDeclaredFields()[1].getName()));
            append.invoke(stringBuilder, "!");

            System.out.println(stringBuilder);
        }

        private String capitaliseFirstLetter(String input) {
            char[] chars = input.toCharArray();
            chars[0] -= 32;
            return String.copyValueOf(chars);
        }
    }
}
