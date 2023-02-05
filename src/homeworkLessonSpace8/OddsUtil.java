package homeworkLessonSpace8;

public class OddsUtil {
    public static double sameTwoDiceOddsRatio(int loopTime, java.util.Random r){
        Dice diceOne = new Dice();
        Dice diceTwo = new Dice();
        int count = 0;

        diceOne.roll(r);
        System.out.println(diceOne.previousValue);

        for (int i = 0; i < loopTime; i++){
            diceTwo.roll(r);
            if (diceTwo.getDiceValueUpOnTheFace() == diceOne.getDiceValueUpOnTheFace())
                count++;
            System.out.println(diceTwo.previousValue);

        }

        return (double)count / loopTime;
    }
    public static double randomTwoDiceRatio(int loopTimes, java.util.Random r){
        Dice diceOne = new Dice();
        Dice diceTwo = new Dice();
        int count = 0;

        for (int i = 0; i < loopTimes; i++)
            if(diceOne.getDiceValueUpOnTheFace() == diceTwo.getDiceValueUpOnTheFace())
                count++;


        return (double)count / loopTimes;
    }
    public static double coinFlipRatios(int loopTime, java.util.Random r) {
        Coin coin = new Coin();
        int count = 0;

        for (int i = 0; i < loopTime; i++){
            coin.flipCoin(r);
            if (coin.coinsValue.equals("tails"))
                count++;
            System.out.printf("coin fliped and it's a %s%n", coin.coinsValue);
        }

        return (double)count / loopTime;
    }
}
