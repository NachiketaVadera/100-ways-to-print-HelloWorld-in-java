public class HelloWorld_Builder {

    private String interjection;

    private String object;

    public static HelloWorld_Builder builder() {
        return new HelloWorld_Builder();
    }

    public HelloWorld_Builder interjection(String interjection) {
        this.interjection = interjection;
        return this;
    }

    public HelloWorld_Builder object(String object) {
        this.object = object;
        return this;
    }

    public SplitHelloWorld getHelloWorld() {
        return new SplitHelloWorld(() -> interjection, () -> object);
    }

    public static void main(String[] args) {
        System.out.println("Builder: ");
        SplitHelloWorld builderHelloWorld = HelloWorld_Builder.builder()
                .interjection("Hello")
                .object("World").getHelloWorld();
        System.out.println(builderHelloWorld.helloWorld());
    }
}

    class SplitHelloWorld {

    private HelloWorldInterjection helloWorldInterjection;

    private HelloWorldObject helloWorldObject;

    private static final String separator = " ";

    private static final String terminator = "!";

    public SplitHelloWorld(HelloWorldInterjection helloWorldInterjection, HelloWorldObject helloWorldObject) {
        this.helloWorldInterjection = helloWorldInterjection;
        this.helloWorldObject = helloWorldObject;
    }

    public String helloWorld() {
        return helloWorldInterjection.interjection() + separator + helloWorldObject.object() + terminator;
    }

    public interface HelloWorldInterjection {

        String interjection();
    }

    public interface HelloWorldObject {

        String object();
    }
}
