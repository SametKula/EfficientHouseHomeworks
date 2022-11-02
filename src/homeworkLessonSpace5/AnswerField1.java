package homeworkLessonSpace5;

public class AnswerField1 {
    public static void main(String[] args) {
        run();
    }


    public static void run() {
        System.out.println(babylonianAalgorithm(25));
    }

    public static int babylonianAalgorithm(int n) {
        int r, guess = n / 2;

        r = n / guess;

        for (; r != guess; guess = (guess + r) / 2)
            r = n / guess;

        return guess;
    }
}
