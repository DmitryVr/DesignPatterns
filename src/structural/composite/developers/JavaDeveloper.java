package structural.composite.developers;

public class JavaDeveloper extends Developer {
    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Java developer " + name + " writes Java code...");
    }
}
