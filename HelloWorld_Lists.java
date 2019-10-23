import java.util.*;
public class HelloWorld_Lists {
  public static void main(String[] args) {
    String printer = "Hello, World!";
    Character[] array_p = convertor(printer);
    List<Character> list_char = new ArrayList<Character>();
     for (Character x : array_p ) {
       list_char.add(x);
     }
     for (char x : list_char) {
       System.out.print(x);
     }
  }
  public static Character[] convertor(String str) {
    int len = str.length();
    Character ch[] = new Character[len];
    for(int i=0;i<len;i++) {
      ch[i] = str.charAt(i);
    }
    return ch;
  }
}
