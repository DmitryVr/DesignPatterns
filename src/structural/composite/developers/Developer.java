package structural.composite.developers;

public abstract class Developer {
    protected String name;

    public Developer(String name) {
        this.name = name;
    }

    abstract public void writeCode();
}
