package homeworkLessonSpace5;

public class Question1 {
    public static void main(String[] args) {
        run();
    }


    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("enter your number to take root :");
        int input = kb.nextInt();

        displayBybylonianRoot(input);
    }

    public static void displayBybylonianRoot(int input){
        System.out.printf("%nyour number's root is : %.1f ",babylonianAalgorithm(input));
    }

    public static double babylonianAalgorithm(int n) {
        double r, guess = n / 2;

        r = n / guess;

        for (; r < guess; guess = (guess + r) / 2)
            r = n / guess;

        return guess;
    }
}
