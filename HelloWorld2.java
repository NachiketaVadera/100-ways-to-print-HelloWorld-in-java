We can do it with enumeration.
An enumeration can define a set of values belonging to one category. For example, an enumeration for all months in a year. Another great use of enumeration is in writing testcases to accept different testing parameetrs. Each testing parameter is a category and it will contain a set of testing values. The name of the elements in enumeration can be printed out easily.
First declare an enumeration.
Code for declaring an enumeration is:
enum Message {
    HELLO_WORLD("Hello world");
     
    private String name;
    private Message(String name) {
        this.name = name;
    }
     
    public String getName() {
        return this.name;
    }
}
Then print out the message with below call
System.out.println(Message.HELLO_WORLD.getName());

