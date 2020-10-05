import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The type Hello world with optionals.
 */
public class HelloWorld_WithOptionals {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        List<Optional<String>> optionals = new ArrayList<>();
        optionals.add(Optional.of("Hello,"));
        optionals.add(Optional.empty());
        optionals.add(Optional.of("World!"));
        print(optionals);
    }

    /**
     * Print hello world with optional APIs
     * @param optionals
     */
    private static void print(List<Optional<String>> optionals) {

        optionals.stream().forEach(optional -> {
            optional.map(o -> {
                System.out.print(o);
                return null;
            }).orElseGet(()->{
                System.out.print(" ");
                return null;
            });
        });

    }

}
