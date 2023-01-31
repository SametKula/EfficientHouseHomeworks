package homeworkLessonSpace8;


public class PossibilitiesUtil {

    public static double diceChance( java.util.Random rd , int loopTimes, int a) {
        int count = 0;

        for (int i = 0; i < loopTimes; i++) {
            int temp = throwDice(rd);

            if (a == temp)
                count++;

        }

        return count / (double) loopTimes;
    }

    public static double diceChance(java.util.Random rd, int loopTimes, int a, int b) {
        int count = 0;

        for (int i = 0; i < loopTimes; i++) {
            int temp = throwDice(rd);

            if (a == temp || b == temp)
                count++;

        }

        return count / (double) loopTimes;
    }

    public static double diceChance(java.util.Random rd, int loopTimes, int a, int b, int c) {
        int count = 0;

        for (int i = 0; i < loopTimes; i++) {
            int temp = throwDice(rd);

            if (a == temp || b == temp || c == temp)
                count++;

        }

        return count / (double) loopTimes;
    }

    public static double diceChance(java.util.Random rd, int loopTimes, int a, int b, int c, int d) {
        int count = 0;

        for (int i = 0; i < loopTimes; i++) {
            int temp = throwDice(rd);

            if (a == temp || b == temp || c == temp || d == temp)
                count++;

        }

        return count / (double) loopTimes;
    }

    public static double diceChance(java.util.Random rd, int loopTimes, int a, int b, int c, int d, int f) {
        int count = 0;

        for (int i = 0; i < loopTimes; i++) {
            int temp = throwDice(rd);

            if (a == temp || b == temp || c == temp || d == temp || f == temp)
                count++;

        }

        return count / (double) loopTimes;
    }

    public static double diceChance(java.util.Random rd, int loopTimes, int a, int b, int c, int d, int f, int g) {

        int count = 0;

        for (int i = 0; i < loopTimes; i++) {
            int temp = throwDice(rd);

            if (a == temp || b == temp || c == temp || d == temp || f == temp || g == temp)
                count++;

        }

        return count / (double) loopTimes;
    }

    public static double twoDiceChance(int looptimes, java.util.Random rd) {
        int count = 0;

        for (int i = 0; i < looptimes; i++)
            if (throwDice(rd) == throwDice(rd))
                count++;

        return count / (double) looptimes;
    } 

    public static double coinFlipRatio(int loopTimes, String coinFace, java.util.Random rd) {
        if (!coinFace.equalsIgnoreCase("tails") || !coinFace.equalsIgnoreCase("heads"))
            System.err.println("you should look for heads or tails");

        int count = 0;
        for (int i = 0; i < loopTimes; i++)
            if (flipCoin(rd).equalsIgnoreCase(coinFace))
                count++;

        return count / (double) loopTimes;
    }

    public static int throwDice(java.util.Random rd) {
        return rd.nextInt(6) + 1;
    }
    public static String flipCoin(java.util.Random rd) {
        return rd.nextBoolean() ? "heads" : "tails";
    }

    public static String coinValidator (String coinFace){
        if (coinFace.equalsIgnoreCase("heads"))
            return "heads";
        else if (coinFace.equalsIgnoreCase("tails"))
            return "tails";
        return "invalid";
    }
    public static double multipleCoinFlip (java.util.Random rd, int coinFlipTimes , int coinInSameTime,String wantedCoinFace){
        int wantedCoin = 0;


        if (coinValidator(wantedCoinFace).equals("invalid"))
            return 0;
        else
            wantedCoinFace = coinValidator(wantedCoinFace);

        for (int i = 0; i < coinFlipTimes; i++)
            for (int j = 0; j < coinInSameTime; j++)
                if (flipCoin(rd).equals(wantedCoinFace))
                    wantedCoin++;


        return wantedCoin / (double)coinFlipTimes*coinInSameTime;
    }



    /**
     * yasaklanan java kullanimi
     * this method give odds ratio of given numbers possiblates to all sequence
     */
    public static double diceOddsRatio(int loopTimes, java.util.Random rd, int... ints) {
        int count = 0;

        for (int i = 0; i < loopTimes; i++)
            for (int k = 0, throwedDice = throwDice(rd); k < ints.length; k++)
                if (ints[k] == throwedDice)
                    count++;

        return count / (double) loopTimes;
    }


}
