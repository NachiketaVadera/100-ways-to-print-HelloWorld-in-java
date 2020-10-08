package dependencyinjection;

/**
 * @author Alessandro Arosio - 03/10/2020 15:40
 */
public class HelloWorldDependencyInjection {

    public static void main(String[] args) {
        final MessageRenderer mr = BeanFactory.getInstance().getMessageRenderer();
        final MessageProvider mp = BeanFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
