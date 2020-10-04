package dependencyinjection;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @author Alessandro Arosio - 03/10/2020 15:44
 */
public class BeanFactory {
    private static BeanFactory instance ;
    private static MessageRenderer renderer;
    private static MessageProvider provider;

    static {
        instance = new BeanFactory();
    }

    private BeanFactory() {
        final String FILENAME = "dependencyinjection/bean.properties";
        final Properties props = new Properties();

        try {
            props.load(Files.newInputStream(Paths.get(FILENAME)));
            final String rendererClass = props.getProperty("renderer.class");
            final String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BeanFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
