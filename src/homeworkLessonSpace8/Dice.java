package homeworkLessonSpace8;

public class Dice {
    private static java.util.Random r;

    public Dice(){
        r = new java.util.Random();
        r.setSeed(42);
    }
    private int dice;

    public void roll(){
        this.dice = r.nextInt(6) + 1;
    }
    public int getDice(){
        return this.dice;
    }
}
