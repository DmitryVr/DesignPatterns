package structural.decorator;

import structural.decorator.decorators.BorderDecorator;
import structural.decorator.decorators.ColorDecorator;
import structural.decorator.objects.Component;
import structural.decorator.objects.TextView;
import structural.decorator.objects.Window;

public class Main {
    public static void main(String[] args) {
        // декораторы можно вкладывать друг в друга
        Component componentWindow = new ColorDecorator(new BorderDecorator(new Window()));
        componentWindow.draw();

        Component componentTextView = new ColorDecorator(new TextView());
        componentTextView.draw();
    }
}
