package behavioral.strategy;

public class Summa implements MathEffect {
    @Override
    public void doMathEffect(int number) {
        System.out.println( (1 + number) * number/2 );
    }
}
