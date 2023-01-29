package homeworkLessonSpace8;



public class Testing {
    public static void run() {
        /*
         double temp = PossibilitiesUtil.diceChance(5 ,  216, new java.util.Random())*100;
        double temp = PossibilitiesUtil.diceOddsRatio(133, new java.util.Random(), 3);
        System.out.println(temp);
        */


        double temp = PossibilitiesUtil.coinFlipRatio(100000,"tails",new java.util.Random());

        System.out.println(temp);
    }

}
