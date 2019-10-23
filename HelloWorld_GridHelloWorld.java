import java.util.Arrays;

public class HelloWorld_GridHelloWorld {
    public static void main(String[] args) {
        String phrase = "Hello World!";
        String[][] grid = new String[10][10];

        for (String[] strings : grid) {
            Arrays.fill(strings, phrase);
        }

        for (String[] strings : grid) {
            System.out.println(Arrays.toString(strings));
        }
    }
}
