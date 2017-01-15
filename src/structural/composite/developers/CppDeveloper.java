package structural.composite.developers;

public class CppDeveloper extends Developer {
    public CppDeveloper(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("C++ developer " + name + " writes C++ code...");
    }
}
