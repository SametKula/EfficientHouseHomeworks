package homeworkLessonSpace5.questionsRefactoredVersinios.lastestVersion;

public class Q1 {
    public static void main(String[] args) {
        run();

    }


    public static void run() {
        for (int i = 1 ; i < 100; i++ )
            System.out.println(babylonianAalgorithm(i) + "▬▬▬▬▬▬▬" + i);
    }

    public static double babylonianAalgorithm(int n) {
        double guess = n / 2, lastGuess, r = 2;

        if (n < 0)
            n = -n;

        if (n == 1)
            return 1;

        do {
            lastGuess = guess;
            r = n / guess;
            guess = (guess + r) / 2;
        } while (lastGuess - guess > 0.0000001);

        return guess ;
    }
}
