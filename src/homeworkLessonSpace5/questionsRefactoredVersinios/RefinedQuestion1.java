package homeworkLessonSpace5.questionsRefactoredVersinios;

public class RefinedQuestion1 {
    public static void main(String[] args) {
        run();

    }


    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("welcome to babylonian algoritm app if you want exit enter 0");

        while (true) {
            System.out.print("enter your number to take root :");
            int input = kb.nextInt();

            if (input == 0) {
                System.out.println("thanks for using this app <3");
                break;
            }

            displayBybylonianRoot(input);

        }
    }

    public static void displayBybylonianRoot(int input) {
        if (input == 1) {
            System.out.printf("%nyour number's (%d) root is : %f %n%n", input, 1.0);
            return;
        }

        double inputsRoot = babylonianAalgorithm(input);

        System.out.printf("%nyour number's (%d) root is : %f %n%n", input, inputsRoot);
    }

    public static double babylonianAalgorithm(int n) {
        double guess = n / 2, lastGuess, r = 2;

        do {
            lastGuess = guess;
            r = n / guess;
            guess = (guess + r) / 2;
        } while ((lastGuess - guess) >= 0.01);

        return guess;
    }
}
