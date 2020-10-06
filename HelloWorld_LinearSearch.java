

class HelloWorld_LinearSearch {
    public static void main(String [] args){
        String a = "Hello World";

        char ch = 'r';

        int i;

        for ( i = 0; i < a.length(); i++){
            if (a.charAt(i) == ch){
                
                System.out.println("Character found");
                break;
            }
            else {
                System.out.println("Character Not Found ");
                break;
            }

        }
    }
}