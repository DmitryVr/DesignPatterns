package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("Batman");
        Subscriber subscriber2 = new Subscriber("Joker");
        Subscriber subscriber3 = new Subscriber("Hulk");

        Publisher publisher = new Publisher();

        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);

        publisher.createNewMessage("Dark Knight 4");

        publisher.addObserver(subscriber3);
        publisher.createNewMessage("Dark Knight 5");
    }
}
