package structural.composite;

import structural.composite.corporation.ECorp;
import structural.composite.developers.CppDeveloper;
import structural.composite.developers.Developer;
import structural.composite.developers.JavaDeveloper;
import structural.composite.team.Team;

public class Main {
    public static void main(String[] args) {
        ECorp eCorp = new ECorp();
        Team team1 = new Team("Team1");
        Team team2 = new Team("Team2");

        Developer JavaDeveloper1 = new JavaDeveloper("JavaDeveloper1");
        Developer JavaDeveloper2 = new JavaDeveloper("JavaDeveloper2");
        Developer cppDeveloper1 = new CppDeveloper("cppDeveloper1");
        Developer JavaDeveloper3 = new JavaDeveloper("JavaDeveloper3");
        Developer JavaDeveloper4 = new JavaDeveloper("JavaDeveloper4");
        Developer cppDeveloper2 = new CppDeveloper("cppDeveloper2");

        team1.addDeveloper(JavaDeveloper1);
        team1.addDeveloper(JavaDeveloper2);
        team1.addDeveloper(cppDeveloper1);
        team2.addDeveloper(JavaDeveloper3);
        team2.addDeveloper(JavaDeveloper4);
        team2.addDeveloper(cppDeveloper2);

        eCorp.addTeam(team1);
        eCorp.addTeam(team2);

        eCorp.createWorkProcess();
    }
}
