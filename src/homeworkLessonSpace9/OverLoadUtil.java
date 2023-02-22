package homeworkLessonSpace9;

public class OverLoadUtil {
    public static void disaplayTaxOwner(SoccerTeam... teams) {
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|\n", "Team Name", "TaxNumber", "Favorite Player", "Gain for per year", "Team's Players");
        System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");

        for (SoccerTeam team : teams) {
            System.out.printf("|%20s|%20s|%20s|%20d|%20d|\n", team.name.toUpperCase(), team.taxNumber, team.bestPlayerName, team.gainByYear, team.playerCountTheyHave);
            System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");
        }


    }

    public static void disaplayTaxOwner(SoccerTeam team) {
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|\n", "Team Name", "TaxNumber", "Favorite Player", "Gain for per year", "Team's Players");
        System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");
        System.out.printf("|%20s|%20s|%20s|%20d|%20d|\n", team.name.toUpperCase(), team.taxNumber, team.bestPlayerName, team.gainByYear, team.playerCountTheyHave);
        System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");


    }
}
