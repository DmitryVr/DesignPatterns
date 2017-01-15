package creational.abstractFactory.orcs;

import creational.abstractFactory.interfaces.Priest;

public class OrcPriest implements Priest {
    @Override
    public void heal() {
        System.out.println("Orc priest heal!");
    }
}
