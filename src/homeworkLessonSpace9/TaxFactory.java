package homeworkLessonSpace9;

import java.util.Random;

public class TaxFactory {
    public static SoccerTeam create(SoccerTeam team, String name, String bestPlayerName, int playerCount, int gainByPerYear){
        team.name = name;
        team.bestPlayerName = bestPlayerName;
        team.playerCountTheyHave = playerCount;
        team.gainByYear = gainByPerYear;
        team.taxNumber = taxNameCreate();

        return team;
    }
    public static PetStore create(PetStore petStore, String name, int animalsCount){
        return create(petStore,name,animalsCount,false);
    }

    public static PetStore create(PetStore petStore, String name, int animalsCount, boolean haveStrorage){
        petStore.name = name;
        petStore.animalsTheyHave = animalsCount;
        petStore.areTheyHaveStorage = haveStrorage;
        petStore.taxNumber = taxNameCreate();

        return petStore;
    }











    public static String taxNameCreate(){
        Random rd = new Random();
        String str = "" + (char)(rd.nextInt(9) + 49);

        for (int i = 0; i < 8; i++)
            str = str + (char)(rd.nextInt(9) + 48);

        //its need a control condition because maybe this taxNumber alerayd have taken
        return str;
    }
}
