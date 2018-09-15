import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld_RandomUntilCorrect {
        public static void main(String[] args) {
                Character[] charObjectArray = getCharacterArray("!eoro,l llWdH");
                List<Character> charList = Arrays.asList(charObjectArray);
                while (!charList.toString().equals("Hello, World!")) {
                        Collections.shuffle(charList);
                        System.out.println(charList.toString());
                }
                System.out.println("Got it right! : " + charList.toString());
        }

        public static Character[] getCharacterArray(String string) {
                int size = string.length();
                Character[] array = new Character[size];
                for (int i = 0;i < size ;i++) {
                        array[i] = new Character(string.charAt(i));
                }
                return array;
        }
}
