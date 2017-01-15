package structural.decorator.decorators;

import structural.decorator.objects.Component;

/**
 * рисует цвет
 */
public class ColorDecorator extends Decorator {
    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        // здесь нужно получать component (он protected)
        // и что-то с ним делать
        System.out.println(" ... add color");
    }
}
