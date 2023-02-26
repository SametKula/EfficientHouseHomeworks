package homeworkLessonSpace9;

public class OverLoadUtil {
    public static void changeTaxOwnersName(SoccerTeam taxOwner, String newName) {
        taxOwner.name = newName;
    }
    public static void changeTaxOwnersName(PideSaloon taxOwner, String newName) {
        taxOwner.name = newName;
    }
    public static void changeTaxOwnersName(PetStore taxOwner, String newName) {
        taxOwner.name = newName;
    }
    public static void disaplayTaxOwner(SoccerTeam taxOwner) {
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|\n", "Team Name", "TaxNumber", "Favorite Player", "Gain for per year", "Team's Players");
        System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");
        System.out.printf("|%20s|%20s|%20s|%20d|%20d|\n", taxOwner.name.toUpperCase(), taxOwner.taxNumber, taxOwner.bestPlayerName, taxOwner.gainByYear, taxOwner.playerCountTheyHave);
        System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");


    }

    public static void disaplayTaxOwner(PideSaloon taxOwner) {
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|\n", "Team Name", "TaxNumber", "Coking Pide ratio", "Worker Count", "Popularty");
        System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|\n", taxOwner.name.toUpperCase(), taxOwner.taxNumber, taxOwner.cookingPideRatio, taxOwner.workerCount, taxOwner.popularity);
        System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");
    }
    public static void disaplayTaxOwner(PetStore taxOwner) {
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|\n", "Team Name", "TaxNumber", "Animals count", "Have They Storage");
        System.out.print("+--------------------+--------------------+--------------------+--------------------+\n");
        System.out.printf("|%20s|%20s|%20s|%20s|\n", taxOwner.name.toUpperCase(), taxOwner.taxNumber, taxOwner.animalsTheyHave, taxOwner.areTheyHaveStorage);
        System.out.print("+--------------------+--------------------+--------------------+--------------------+\n");
    }
    public static void disaplayTaxOwner(SoccerTeam... teams) {
        System.out.printf("|%20s|%20s|%20s|%20s|%20s|\n", "Team Name", "TaxNumber", "Favorite Player", "Gain for per year", "Team's Players");
        System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");

        for (SoccerTeam team : teams) {
            System.out.printf("|%20s|%20s|%20s|%20d|%20d|\n", team.name.toUpperCase(), team.taxNumber, team.bestPlayerName, team.gainByYear, team.playerCountTheyHave);
            System.out.print("+--------------------+--------------------+--------------------+--------------------+--------------------+\n");
        }


    }
}
