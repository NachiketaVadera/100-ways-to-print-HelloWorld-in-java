public class HelloWorld_OtherRandom {

    /**
     * Main method: prints messages built from random characters
     * until the return String is "Hello, World!"
     */
    public static void main(String[] args) {
        //creates string with letters from alphabet, upper and lower case
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabet += alphabet.toUpperCase();

        //creates string that represents the final message
        //special characters like spaces and punctuation are added later
        String endResult = "HelloWorld";

        //creates letter and messages variables
        char letter = 0;
        String message = "";

        //iterates over all characters in endResult
        for(char c : endResult.toCharArray()){

            //repeats until the random letter matches the correct letter
            while(letter != c){
                //chooses random letter from alphabet string
                letter = alphabet.toCharArray()[(int)(Math.random() * alphabet.length())];

                //prints the saved message along with the new letter
                System.out.println(message + letter);
            }

            //once the random letter is correct, add letter to message
            message += letter;

            //adds comma and space after first word
            if (message.equals("Hello"))
                message += ", ";

            //adds exclamation mark at end of word
            if (message.equals("Hello, World"))
                System.out.println(message + "!");
        }
    }
}
