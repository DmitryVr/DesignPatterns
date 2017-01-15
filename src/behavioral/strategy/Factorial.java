package behavioral.strategy;

public class Factorial implements MathEffect {
    @Override
    public void doMathEffect(int number) {
        int f = 1;
        for (int i = 2; i <= number; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
