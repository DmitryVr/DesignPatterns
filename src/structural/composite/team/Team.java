package structural.composite.team;

import structural.composite.developers.Developer;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("\nTeam " + teamName + " creates project...\n");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
