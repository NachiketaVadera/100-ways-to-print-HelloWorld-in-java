package dependencyinjection;

/**
 * @author Alessandro Arosio - 03/10/2020 15:38
 */
public interface MessageRenderer {
    void render();

    MessageProvider getMessageProvider();

    void setMessageProvider(MessageProvider provider);
}
