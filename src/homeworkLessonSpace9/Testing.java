package homeworkLessonSpace9;

public class Testing {
    public static void testRun(){
        System.out.println("Welcome to testing area");


        SoccerTeam kasimpasa = TaxFactory.create(new SoccerTeam(), "kasimpasa","icardi",14,10000);

        OverLoadUtil.disaplayTaxOwner(kasimpasa);
    }
}
