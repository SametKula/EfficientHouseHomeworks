package homeworkLessonSpace9;

public class Testing {
    public static void testRun(){
        System.out.println("Welcome to testing area");


        PideSaloon kasimpasa = TaxFactory.create(new PideSaloon(),"Kardesler Pide",13.4,23,122);

        OverLoadUtil.disaplayTaxOwner(kasimpasa);
    }
}
