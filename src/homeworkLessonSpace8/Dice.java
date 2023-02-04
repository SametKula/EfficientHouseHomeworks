package homeworkLessonSpace8;

public class Dice {
    public int previousValue;
    public int diceValueUpOnTheFace;

    public void roll(java.util.Random r ) {
        previousValue = diceValueUpOnTheFace;

        diceValueUpOnTheFace = r.nextInt(6) + 1;
    }

    public int getDiceValueUpOnTheFace() {
        return diceValueUpOnTheFace;
    }
}
