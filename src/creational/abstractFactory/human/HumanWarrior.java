package creational.abstractFactory.human;

import creational.abstractFactory.interfaces.Warrior;

public class HumanWarrior implements Warrior {
    @Override
    public void bump() {
        System.out.println("Human Warrior bump!");
    }
}
