import java.util.*;

public class HelloWorld_LinearSearch {
    private static final String ERROR_STRING = "Please provide a list of characters ("'h','e','l','l','o'") and the character to find ('l')";
    public static void main(String[] args) {
        try {
            // Returns TRUE
            List<Character> listOfNumbers = new ArrayList<Character>(Arrays.asList('h','e','l','l','o','w','o','r','l','d'));
            Character keyToSearch = 'r';
            InputOutputMethod(listOfNumbers, keyToSearch);

            // Returns FALSE
            keyToSearch = 'a';
            InputOutputMethod(listOfNumbers, keyToSearch);

            // Gives error as no input
            listOfNumbers = new ArrayList<Character>(Arrays.asList());
            InputOutputMethod(listOfNumbers, keyToSearch);
        }
        catch(Exception e) {
            System.out.println(ERROR_STRING);
        }
    }

    private static void InputOutputMethod(List<Character> listOfNumbers, Character keyToSearch) {
        if(listOfNumbers.size() >= 1){
            Boolean searched = linearSearch(listOfNumbers, keyToSearch);
            System.out.println(searched);
        }else{
            System.out.println(ERROR_STRING);
        }
    }

    private static Boolean linearSearch(List<Character> list, Character keyToSearch) {
        Boolean answer = false;
        for (Character number : list) {
            if(number == keyToSearch) {
                answer = true;
                break;
            }
        }
        return answer;
    }
}
