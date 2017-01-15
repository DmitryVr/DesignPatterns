package structural.facade.facade;

import structural.facade.parts.*;

public class HumanFacade {
    private World world = new World();
    private Kindergarten kindergarten = new Kindergarten();
    private School school = new School();
    private University university = new University();
    private Work work = new Work();
    private Shop shop = new Shop();
    private TV tv = new TV();
    private Marriage marriage = new Marriage();
    private Children children = new Children();
    private PensionFund pensionFund = new PensionFund();
    private Death death = new Death();

    public void badTrip(long i) {
        world.born(i);
        kindergarten.goToKindergarten(i);
        school.goToSchool(i);
        university.goToUniversity(i);
        work.goToWork(i);
        shop.goToShop(i);
        tv.watchTV(i);
        marriage.getMarried(i);
        children.createChildren(i);
        pensionFund.getPension(i);
        death.die(i);
    }
}
