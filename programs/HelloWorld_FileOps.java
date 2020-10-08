import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class HelloWorld_FileOps {
        public static void main(String[] args) {
                String fileName = "Target_File.txt";
                makeFile(fileName);
                writeFile("Hello, World!", fileName);
                System.out.println(readFile(fileName));
        }

        public static void makeFile(String filePath) {
                File file = new File(filePath);
                try {
                        if (!file.exists())
                                file.createNewFile();
                } catch(IOException ex) {
                        System.out.println(ex.getMessage());
                }
        }

        public static void writeFile(String data, String filePath) {
                try {
                        FileOutputStream fos = new FileOutputStream(filePath);
                        byte[] bytes = data.getBytes();
                        fos.write(bytes);
                        fos.close();
                } catch(IOException ex) {
                        System.out.println(ex.getMessage());
                }
        }

        public static String readFile(String filePath) {
                StringBuilder builder = new StringBuilder();
                try {
                        Scanner reader = new Scanner(new FileInputStream(filePath));
                        while (reader.hasNext()) {
                                builder.append(reader.nextLine());
                        }
                        reader.close();
                        return builder.toString();
                } catch(IOException ex) {
                        return builder.append("ERROR: ").append(ex.getMessage()).toString();
                }
        }
}
