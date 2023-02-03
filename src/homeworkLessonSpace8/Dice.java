package homeworkLessonSpace8;


public class Dice {
    public int dice;

    public void roll(){
        java.util.Random r = new java.util.Random();
        dice = r.nextInt(6) + 1;
    }
    public int getDice(){
        return dice;
    }
}
