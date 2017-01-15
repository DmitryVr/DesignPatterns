package creational.abstractFactory.interfaces;

/**
 * раса (ru)
 */
public interface RaceFactory {
    Warrior getWarrior();
    Archer getArcher();
    Priest getPriest();
}
