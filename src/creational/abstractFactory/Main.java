package creational.abstractFactory;

import creational.abstractFactory.human.HumanRaceFactory;
import creational.abstractFactory.interfaces.Archer;
import creational.abstractFactory.interfaces.Priest;
import creational.abstractFactory.interfaces.RaceFactory;
import creational.abstractFactory.interfaces.Warrior;
import creational.abstractFactory.orcs.OrcRaceFactory;

public class Main {
    private static RaceFactory factory;

    public static void main(String[] args) {
        if (true) {
            factory = new HumanRaceFactory();
        } else {
            factory = new OrcRaceFactory();
        }

        Warrior warrior1 = factory.getWarrior();
        Warrior warrior2 = factory.getWarrior();
        Archer archer1 = factory.getArcher();
        Priest priest1 = factory.getPriest();

        warrior1.bump();
        warrior2.bump();
        archer1.fire();
        priest1.heal();
    }
}
