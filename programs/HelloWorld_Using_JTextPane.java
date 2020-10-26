
import javax.swing.*;
import java.awt.print.PrinterException;

/**
 * This class demonstrates use of one of the Swing classes : JTextPane
 * On successful execution of this program, user will get a popup to print the output
 * on several options based on respective OS. In case of Windows OS, the output can be printed via :
 * Microsoft XPS document, Microsoft Print to PDF, etc.
 * Output is an HTML text containing : Hello, World!!
 * */
public class HelloWorld_Using_JTextPane {

    public static void main(String[] args) {
        JTextPane jtp = new JTextPane();
        jtp.setContentType("text/html");
        jtp.setText("<html><head><title>100-ways-to-print-HelloWorld-in-java</title></head><body><div><h1>Hello, World!!</h1></div></body></html>");
        try {
            jtp.print();
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }

}
