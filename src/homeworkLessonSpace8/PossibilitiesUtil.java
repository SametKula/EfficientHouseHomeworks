package homeworkLessonSpace8;


public class PossibilitiesUtil {

    public static double diceChance (int a, int loopTimes, java.util.Random rd){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = throwDice(rd);

            if (a == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int loopTimes, java.util.Random rd){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = throwDice(rd);

            if (a == temp || b == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int c, int loopTimes, java.util.Random rd){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = throwDice(rd);

            if (a == temp || b == temp || c == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int c, int d,int loopTimes, java.util.Random rd){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = throwDice(rd);

            if (a == temp || b == temp || c == temp || d == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int c, int d, int f, int loopTimes,java.util.Random rd){
         int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = throwDice(rd);

            if (a == temp || b == temp || c == temp || d == temp || f == temp)
                count++;

        }

        return count / (double)loopTimes;
    }

    public static double diceChance (int a, int b, int c, int d, int f, int g, int loopTimes, java.util.Random rd ){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = throwDice(rd);

            if (a == temp || b == temp || c == temp || d == temp || f == temp || g == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static int throwDice (java.util.Random rd){
        return rd.nextInt(6) + 1;
    }
    public static double twoDiceChance (int looptimes ,java.util.Random rd) {
        int count = 0;

        for (int i = 0; i < looptimes; i++)
            if (throwDice(rd) == throwDice(rd))
                count++;

        return count / (double)looptimes;
    }


    //yasaklanan java kullanimi
/**
* this method give odds ratio of given numbers possiblates to all sequence
*/
    public static double diceOddsRatio(int loopTimes, java.util.Random rd, int... ints){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = throwDice(rd);

            for (int j : ints)
                if (j == temp)
                    count++;

        }

        return count / (double)loopTimes;
    }

    public static String doCoinFlip (java.util.Random rd){
        return rd.nextBoolean() ? "heads" : "tails";
    }

    public static double coinFlipRatio(int loopTimes, String coinFace, java.util.Random rd) {
        int count = 0;

        if (!coinFace.equalsIgnoreCase("tails") ||  !coinFace.equalsIgnoreCase("heads"))
            System.err.println("you should use heads or tails");


        for (int i = 0; i < loopTimes; i++)
            if (doCoinFlip(rd).equalsIgnoreCase(coinFace))
                count++;

        return count / (double)loopTimes;
    }


}
