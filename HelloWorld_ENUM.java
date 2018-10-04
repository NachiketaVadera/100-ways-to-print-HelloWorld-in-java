// Way_12 : Using ENUM

public class HelloWorld_ENUM {
    public static void main(String[] args) {

        System.out.println(Message.HELLO_WORLD.getName());
    }
}

enum Message {
    HELLO_WORLD("Hello, World!");

    private String name;

    Message(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}