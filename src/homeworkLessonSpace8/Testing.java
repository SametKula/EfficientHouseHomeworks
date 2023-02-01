package homeworkLessonSpace8;



public class Testing {
    public static void run() {
        java.util.Random rd = new java.util.Random();

        //PrintThings<Double> db = new PrintThings<Double>(PossibilitiesUtil.multipleCoinFlip(rd,13,13,"heads"));

        System.out.println(PossibilitiesUtil.twoDiceChance(100000,rd) * 100);
    }

}
