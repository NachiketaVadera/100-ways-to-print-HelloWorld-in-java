import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class HelloWorldFromMorseCode {
    private static final Map<String, String> MORSE_DICTIONARY = new HashMap<String, String>(){
        {
            put(" ", "");
            put("/", " ");
            put(".-", "a");
            put("-...", "b");
            put("-.-", "c");
            put("-..", "d");
            put(".", "e");
            put("..-.", "f");
            put("--.", "g");
            put("....", "h");
            put("..", "i");
            put(".---", "j");
            put("-.", "k");
            put(".-..", "l");
            put("--", "m");
            put("-.", "n");
            put("---", "o");
            put(".--.", "p");
            put("--.-", "q");
            put(".-.", "r");
            put("...", "s");
            put("-", "t");
            put("..-", "u");
            put("...-", "v");
            put(".--", "w");
            put("-..-", "x");
            put("-.--", "y");
            put("--..", "z");
        }
    };

    private static String capitalizeFirstLetters(final String words){
        return Stream.of(words.trim().split("\\s"))
                .filter(word -> word.length() > 0)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
        
    }

    private static String morseToEnglish(final String morseSequence) {
        final List<String> morseSequenceAsList = Arrays.asList(morseSequence.toLowerCase().split(" "));
        return morseSequenceAsList.stream().map(morseChar -> {
            return (MORSE_DICTIONARY.get(morseChar) == null) ? "" : MORSE_DICTIONARY.get(morseChar);
        }).collect(Collectors.joining());
    }

    public static void main(final String[] args) {
        System.out.println(capitalizeFirstLetters(morseToEnglish(".... . .-.. .-.. --- / .-- --- .-. .-.. -..")));
    }
}

