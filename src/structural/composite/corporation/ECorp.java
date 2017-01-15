package structural.composite.corporation;

import structural.composite.team.Team;

import java.util.ArrayList;
import java.util.List;

public class ECorp {
    private List<Team> teams = new ArrayList<>();

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }

    public void createWorkProcess() {
        System.out.println("ECorp creates work process...\n");
        for (Team team : teams) {
            team.createProject();
        }
    }
}
