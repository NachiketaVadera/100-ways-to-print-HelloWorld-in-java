import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Argument --shutdown-immediately can be used to shutdown right after the file is generated, --no-delete can be used
 */

public class HelloWorld_UsingTXTFile {
    // Creates a hello world text file that auto-deletes itself after 30 seconds
    public static void main(String[] args) throws InterruptedException {
        if (!(hasArg(args, "--no-delete"))) {
            //Delete all generated files on process exit
            Runtime.getRuntime().addShutdownHook(new Thread(() -> TextFile.CACHE.forEach(f -> {
                if (f.exists()) {
                    f.delete();
                }
            })));
        }
        System.out.println("Generating text file...");
        File tf = TextFile.generate("hello-world");
        if (tf != null) {
            System.out.println("Generated file! Path: " + tf.getAbsolutePath());
        } else {
            System.out.println("Could not generate file!");
        }
        if (!(args.length > 0 && hasArg(args, "--shutdown-immediately"))) {
            Thread.sleep(30000);
        }
    }
    private static boolean hasArg(String[] arr, String arg) {
        if (arr.length > 0) {
            return Arrays.stream(arr).anyMatch(str -> str.equalsIgnoreCase(arg));
        }
        return false;
    }
    /** class that provides needed api, as well as providing extra as examples */
    private static final class TextFile {
        //CACHE is used to delete files on exit
        public static final List<File> CACHE = new ArrayList<>();
        //can generate files async if you need the main thread to stay active
        public static CompletableFuture<File> generateAsync(String name) {
            return CompletableFuture.supplyAsync(() -> generate(name));
        }
        //sync generation of text files
        public static File generate(String name) {
            File f = new File( name + ".txt");
            try {
                if (!f.exists()) {
                    f.createNewFile();
                }
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Hello World!");
                bw.flush();
                CACHE.add(f);
                return f;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return null;
        }

    }

}