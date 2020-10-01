import java.util.function.Function;

public class HelloWorld_Lambda {

    public static void main(String[] args) {
        print(i -> i == 0 ? "Hello, " : "World!");
    }

    private static void print(Function<Integer, String> stringSupplier) {
        System.out.print(stringSupplier.apply(0));
        System.out.println(stringSupplier.apply(1));
    }

}
