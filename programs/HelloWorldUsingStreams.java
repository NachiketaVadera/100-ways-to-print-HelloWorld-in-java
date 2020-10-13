import java.util.stream.Stream;

// Hello world using Stream API (JAVA 8)
class HelloWorldUsingStreams {
    public static void main(String[] args) {
        
        Stream.of("H", "e", "l", "l", "o", ",", " ", "W", "o", "r", "l", "d", "!")
        .reduce((a,b)->a+b)
        .ifPresent(s -> System.out.print(s));
    
    }
}
