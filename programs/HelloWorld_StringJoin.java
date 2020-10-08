import java.util.Arrays;

/**
 * The type Hello world string join.
 */
public class HelloWorld_StringJoin {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String[] characters = {"H", "e", "l", "l", "o", ",", " ", "W", "o", "r", "l", "d", "!"};
        print(characters);
    }

    /**
     * Print hello world with String join
     * @param characters
     */
    private static void print(String[] characters) {
        System.out.print(String.join("", Arrays.asList(characters)));
    }
}
