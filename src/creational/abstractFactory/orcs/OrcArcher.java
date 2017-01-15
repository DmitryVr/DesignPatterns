package creational.abstractFactory.orcs;

import creational.abstractFactory.interfaces.Archer;

public class OrcArcher implements Archer {
    @Override
    public void fire() {
        System.out.println("Orc Archer fire!");
    }
}
