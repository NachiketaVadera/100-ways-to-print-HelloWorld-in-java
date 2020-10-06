/**
 * Prints Hello world by using while
 */

class HelloWorld_UsingWhile{

    /**
    * Entry point.
    *
    */

   public static void main(String[] args) {
       char[] chars = {'H','e','l','l','o',',',' ','W','o','r','l','d','!'}; 
       printHelloWorld(chars);
   }

   /**
    * Print the hello world on console from a character array using while
    * 
    */
   static void printHelloWorld(char[] chars){
       int i = 0;
       while(i < chars.length){
           System.out.print(chars[i]);
           i++;
       }
   }
}