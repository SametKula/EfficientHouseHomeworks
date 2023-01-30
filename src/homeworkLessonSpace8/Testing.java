package homeworkLessonSpace8;



public class Testing {
    public static void run() {
        java.util.Random rd = new java.util.Random();


        /*
         double temp = PossibilitiesUtil.diceChance(5 ,  216, new java.util.Random())*100;
        double temp = PossibilitiesUtil.diceOddsRatio(133, new java.util.Random(), 3);
        System.out.println(temp);
        */


        double temp = PossibilitiesUtil.diceOddsRatio(1000,rd,1,2,3);

        System.out.println(temp);
    }

}
