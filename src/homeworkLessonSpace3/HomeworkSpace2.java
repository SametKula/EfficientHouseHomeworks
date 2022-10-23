package homeworkLessonSpace3;

import java.util.Scanner;

public class HomeworkSpace2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOne, numberTwo, numberTheree;
        numberOne = keyboard.nextInt();
        numberTwo = keyboard.nextInt();
        numberTheree = keyboard.nextInt();
        System.out.printf("ortanca sayi : %d", mid(numberOne, numberTwo, numberTheree));
    }

    public static int mid(int numberOne, int numberTwo, int numberTheree) {
        int highest = highOne(numberOne, highOne(numberTwo, numberTheree));
        int lowest = lowOne(numberOne, lowOne(numberTwo, numberTheree));
        return differentOne(highest, lowest, numberOne, numberTwo, numberTheree);
    }

    public static int highOne(int numberOne, int numberTwo) {
        if (numberOne >= numberTwo) return numberOne;
        else return numberTwo;
    }

    public static int lowOne(int numberOne, int numberTwo) {
        if (numberOne >= numberTwo) return numberTwo;
        else return numberOne;
    }

    public static int differentOne(int highest, int lowest, int numberOne, int numberTwo, int numberTheree) {
        if (highest == numberOne || highest == numberTwo) {
            if (lowest == numberOne || lowest == numberTwo) {
                return numberTheree;
            }
        }
        if (highest == numberOne || highest == numberTheree) {
            if (lowest == numberOne || lowest == numberTheree) {
                return numberTwo;
            }
        }

        if (highest == numberTheree || highest == numberTwo) {
            if (lowest == numberTheree || lowest == numberTwo) {
                return numberOne;
            }
        }
        return 0;
    }
}
