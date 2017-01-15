package creational.abstractFactory.human;

import creational.abstractFactory.interfaces.Archer;

public class HumanArcher implements Archer {
    @Override
    public void fire() {
        System.out.println("Human Archer fire!");
    }
}
