package creational.abstractFactory.human;

import creational.abstractFactory.interfaces.Archer;
import creational.abstractFactory.interfaces.Priest;
import creational.abstractFactory.interfaces.RaceFactory;
import creational.abstractFactory.interfaces.Warrior;

public class HumanRaceFactory implements RaceFactory {
    @Override
    public Warrior getWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Archer getArcher() {
        return new HumanArcher();
    }

    @Override
    public Priest getPriest() {
        return new HumanPriest();
    }
}
