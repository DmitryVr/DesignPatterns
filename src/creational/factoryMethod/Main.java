package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car = factory.getCar(RoadType.OFF_ROAD);

        car.drive();
        car.stop();
    }
}
