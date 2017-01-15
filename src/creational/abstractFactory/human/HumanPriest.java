package creational.abstractFactory.human;

import creational.abstractFactory.interfaces.Priest;

public class HumanPriest implements Priest {
    @Override
    public void heal() {
        System.out.println("Human Priest heal!");
    }
}
