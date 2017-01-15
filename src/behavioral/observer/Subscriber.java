package behavioral.observer;

/**
 * подписчик
 */
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void event(String message) {
        System.out.println("Dear " + name + " new message for you: " + message);
    }
}
