import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates use of ArrayList
 * to print Hello World. Elements within arraylist are iterated
 * using StringBuilder.
 * */
public class HelloWorld_Using_ArrayList {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add(",");
        myList.add(" ");
        myList.add("World!");

        StringBuilder sb = new StringBuilder();

        if(!myList.isEmpty()) {
            for (String str : myList) {
                sb.append(str);
            }
        }

        System.out.println(sb);
    }
}
