/**
 * The type Hello world exception.
 */
public class HelloWorld_Exception {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        print();
    }

    /**
     * Print Hello World using exception handling
     */
    private static void print() {
       try {
           throw new Exception("Hello, World!");
       } catch (Exception ex){
           System.out.println(ex.getMessage());
       }
    }

}
