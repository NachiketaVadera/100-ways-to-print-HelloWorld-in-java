import java.util.Scanner;
import java.io.IOException;

public class ExecSysCommand {
        public static void main(String[] args) {
                try {
                        Process shell = Runtime.getRuntime().exec("cmd /C echo Hello, World!");  // windows | use echo text for UNIX
                        Scanner inputStream = new Scanner(shell.getInputStream());
                        while (inputStream.hasNext()) {
                                System.out.println(inputStream.nextLine());
                        }
                } catch (IOException ioEx) {
                        System.out.println(ioEx.getMessage());
                }
        }
}
