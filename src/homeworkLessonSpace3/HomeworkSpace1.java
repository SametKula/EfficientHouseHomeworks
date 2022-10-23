package homeworkLessonSpace3;

import java.util.Scanner;

public class HomeworkSpace1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOne, numberTwo, numberTheree, highest , lowest , mid ;
            System.out.print(_resetConsoleOut + "number one:");
            numberOne = keyboard.nextInt();
            System.out.print("number two:");
            numberTwo = keyboard.nextInt();
            System.out.print("number theree:");
            numberTheree = keyboard.nextInt();
            System.out.println("");
            calculator(numberOne, numberTwo, numberTheree);
    }

    public static void calculator(int numberOne, int numberTwo, int numberTheree) {
        int highest, lowest, midle;
        highest = highest(numberTheree, highest(numberOne, numberTwo));
        lowest = lowest(numberTheree, lowest(numberOne, numberTwo));
        midle = mid(numberOne, numberTwo, numberTheree);
        String str1 = highest + ">" + midle + ">" + lowest;
        str1 = str1.equals(highest + ">" + midle + ">" + lowest) ? _greenConsoleOut + "Basarili" + _resetConsoleOut : _redConsoleOut + "reddedildi" + _resetConsoleOut;
        System.out.printf("%d %s %d %s %d    %s %n", highest, highest == midle ? "=" : ">", midle, midle == lowest ? "=" : ">", lowest, str1);
    }
    public static int highest(int numberOne, int numberTwo) {
        return numberOne > numberTwo ? numberOne : numberTwo;
    }

    public static int lowest(int numberOne, int numberTwo) {
        return numberOne > numberTwo ? numberTwo : numberOne;
    }

    public static int mid(int numberOne, int numberTwo, int numberTheree) {
        int highest, lowest;
        highest = highest(numberTheree, highest(numberOne, numberTwo));
        lowest = lowest(numberTheree, lowest(numberOne, numberTwo));
        if (highest == numberOne) {
            if (lowest == numberTwo)
                return numberTheree;
            else return numberTwo;
        } else if (highest == numberTwo) {
            if (lowest == numberOne)
                return numberTheree;
            else return numberOne;
        } else if (highest == numberTheree) {
            if (lowest == numberTwo)
                return numberOne;
            else return numberTwo;
        }

        return 0;
    }

    public static final String _redConsoleOut = "\u001B[31m";
    public static final String _greenConsoleOut = "\u001B[32m";
    public static final String _resetConsoleOut = "\u001B[37m";


}
