import java.util.function.Function;

public class HelloWorld_Exception {

    public static void main(String[] args) {
        print();
    }

    private static void print() {
       try {
           throw new Exception("Hello World");
       } catch (Exception ex){
           System.out.print(ex.getMessage());
       }
    }

}
