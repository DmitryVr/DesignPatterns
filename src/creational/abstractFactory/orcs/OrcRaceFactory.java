package creational.abstractFactory.orcs;

import creational.abstractFactory.interfaces.Archer;
import creational.abstractFactory.interfaces.Priest;
import creational.abstractFactory.interfaces.RaceFactory;
import creational.abstractFactory.interfaces.Warrior;

public class OrcRaceFactory implements RaceFactory {
    @Override
    public Warrior getWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Archer getArcher() {
        return new OrcArcher();
    }

    @Override
    public Priest getPriest() {
        return new OrcPriest();
    }
}
