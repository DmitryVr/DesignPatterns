package structural.adapter.adapter;

import structural.adapter.objects.Printer;

import java.util.List;

/**
 * адаптер
 */
public class PrinterAdapter implements ListPrinter {
    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);
        }
    }
}
