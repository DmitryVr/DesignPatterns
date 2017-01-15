package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Messager.getInstance().showMessage();
        Messager.getInstance().addMessage("Message 1");
        Messager.getInstance().addMessage("Message 2");
        Messager.getInstance().addMessage("Message 3");
        Messager.getInstance().showMessage();
    }
}
