package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        DoMathEffect.doMath(new Factorial(), 4);

        DoMathEffect.doMath(new Summa(), 4);
    }
}
