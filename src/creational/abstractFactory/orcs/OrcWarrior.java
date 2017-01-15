package creational.abstractFactory.orcs;

import creational.abstractFactory.interfaces.Warrior;

public class OrcWarrior implements Warrior {
    @Override
    public void bump() {
        System.out.println("Orc Warrior bump!");
    }
}
