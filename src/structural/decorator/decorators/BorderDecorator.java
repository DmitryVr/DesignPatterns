package structural.decorator.decorators;

import structural.decorator.objects.Component;

/**
 * рисует границу
 */
public class BorderDecorator extends Decorator {
    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        // здесь нужно получать component (он protected)
        // и что-то с ним делать
        System.out.println(" ... add border");
    }
}
