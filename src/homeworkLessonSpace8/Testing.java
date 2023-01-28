package homeworkLessonSpace8;



public class Testing {
    public static void run() {
        // double temp = PossibilitiesUtil.diceChance(5 ,  216, new java.util.Random())*100;


        double temp = PossibilitiesUtil.diceThing(6, new java.util.Random(), 3,1);

        System.out.println(temp);
    }

}
