/**
 * This class represents how we can use string in switch case.
 * This feature was introduced in JDK7.
 *
 * */
public class HelloWorld_Using_SwitchCase {


    public static void main(String[] args) {

        System.out.println(getOutputString("Hello"));
        System.out.println(getOutputString("World"));
        System.out.println(getOutputString("Hi"));
    }

    /**
     * This function with return Hello World for valid input.
     * For invalid input, this will return default case value.
     * */
    static String getOutputString(final String msg) {

        String result;

        switch (msg) {
            case "Hello":
            case "World":
                result = "Hello, World!";
                break;

            default:
                result = "Incorrect value received.";
        }

        return result;
    }

}
