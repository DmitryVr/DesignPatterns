package creational.factoryMethod;

/**
 * фабрика по созданию автомобилей
 */
public class Factory {
    // фабричный метод
    public Car getCar(RoadType roadType) {
        Car car = null;

        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
        }

        return car;
    }
}
