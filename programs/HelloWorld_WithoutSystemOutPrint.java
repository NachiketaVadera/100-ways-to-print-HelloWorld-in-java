import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * The type Hello world without system out print.
 */
public class HelloWorld_WithoutSystemOutPrint {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        print();
    }

    /**
     * Print the hello world on console with out using System.out.print
     * @throws IOException
     */
    private static void print() throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
                FileOutputStream(FileDescriptor.out), "ASCII"), 512);
        out.write("Hello, World!");
        out.write('\n');
        out.flush();
    }

}
