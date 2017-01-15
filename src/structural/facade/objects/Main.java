package structural.facade.objects;

import structural.facade.facade.HumanFacade;

public class Main {
    public static void main(String[] args) {
        HumanFacade humanFacade = new HumanFacade();

        humanFacade.badTrip(6543068217l);
    }
}
