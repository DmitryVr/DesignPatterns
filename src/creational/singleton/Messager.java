package creational.singleton;

public class Messager {
    private static Messager messager;
    private static String message = "Message: \n";

    // статический метод
    public static synchronized Messager getInstance() {
        if (messager == null) {
            messager = new Messager();
        }
        return messager;
    }

    // закрытый конструктор
    private Messager() {
    }

    public void addMessage(String addMessage) {
        message += addMessage + "\n";
    }

    public void showMessage() {
        System.out.println(message);
    }
}
