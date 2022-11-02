package homeworkLessonSpace5;

public class AnswerField1 {
    public static void main(String[] args)
    {
        run();
    }



    public static void run()
    {
        System.out.println(bybolianAlgoritim(25));
    }
    //double yapılacak biryer
    public static int bybolianAlgoritim(int n)
    {
        int r , guess = n/2;

        r = n / guess;

        for ( ;r != guess ; guess = (guess + r) /2)
            r = n/guess;

        return guess;
    }
}
