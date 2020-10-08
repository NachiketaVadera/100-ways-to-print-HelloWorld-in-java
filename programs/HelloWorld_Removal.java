/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldbyremoval;

/**
 *
 * @author Alex
 */
public class HelloWorld_Removal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String HelloWorld = "";
        HelloWorld += reduceTo(generateAlphabet(), 'H');
        HelloWorld += reduceTo(generateAlphabet(), 'e');
        HelloWorld += reduceTo(generateAlphabet(), 'l');
        HelloWorld += reduceTo(generateAlphabet(), 'l');
        HelloWorld += reduceTo(generateAlphabet(), 'o');
        HelloWorld += ", ";
        HelloWorld += reduceTo(generateAlphabet(), 'W');
        HelloWorld += reduceTo(generateAlphabet(), 'o');
        HelloWorld += reduceTo(generateAlphabet(), 'r');
        HelloWorld += reduceTo(generateAlphabet(), 'l');
        HelloWorld += reduceTo(generateAlphabet(), 'd');
        HelloWorld += "!";
        System.out.println(HelloWorld);

    }

    private static String generateAlphabet() {
        String alphabet = "";
        for (char c = 'a'; c <= 'z'; c++) 
        {
            alphabet += c; 
        }
        for (char c = 'A'; c <= 'Z'; c++) 
        {
            alphabet += c; 
        }
        return alphabet;
    }

    private static String reduceTo(String reducableString, char c) {
        String newString = "";
        for(int i = 0; i<reducableString.length(); i++)
        {
            if(reducableString.charAt(i) == c)
            {
                newString += c;
            }
        }
        return newString;
    }
    
}
