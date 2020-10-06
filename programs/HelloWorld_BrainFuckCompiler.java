import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: rsv
 * Date: 03.10.2020
 * Time: 22:04
 */
public class HelloWorld_BrainFuckCompiler {

    private static final String HELLO_WORLD_IN_BRAIN_FUCK =
            "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";

    private int[] storage = new int[1024];

    private int index = 0;

    public HelloWorld_BrainFuckCompiler(final String helloWorldCode) throws IOException {
        int indent = 0;
        int initialIndent;
        for (int i = 0; i < helloWorldCode.length(); i++) {
            char ch = helloWorldCode.charAt(i);
            switch (ch) {
                case '>':
                    index++;
                    break;
                case '<':
                    index--;
                    break;
                case '+':
                    storage[index]++;
                    break;
                case '-':
                    storage[index]--;
                    break;
                case '.':
                    System.out.print((char) storage[index]);
                    break;
                case ',':
                    storage[index] = System.in.read();
                    break;
                case '[':
                    initialIndent = indent;
                    indent++;
                    if (storage[index] == 0) {
                        while (indent != initialIndent) {
                            i++;
                            switch (helloWorldCode.charAt(i)) {
                                case '[':
                                    indent++;
                                    break;
                                case ']':
                                    indent--;
                                    break;
                            }
                        }
                    }
                    break;
                case ']':
                    initialIndent = indent;
                    indent--;
                    if (storage[index] != 0) {
                        while (indent != initialIndent) {
                            i--;
                            switch (helloWorldCode.charAt(i)) {
                                case '[':
                                    indent++;
                                    break;
                                case ']':
                                    indent--;
                                    break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    public static void main(final String[] args) throws IOException {
        new HelloWorld_BrainFuckCompiler(HELLO_WORLD_IN_BRAIN_FUCK);
    }
}
