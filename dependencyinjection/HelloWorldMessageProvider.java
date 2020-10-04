package dependencyinjection;

/**
 * @author Alessandro Arosio - 03/10/2020 15:37
 */
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {

        return "Hello World!";
    }

}
