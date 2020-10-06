import java.util.HashMap;
import java.util.Map;

public class HelloWorld_Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("helloWorld", "Hello World!");

        for (String key: map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
