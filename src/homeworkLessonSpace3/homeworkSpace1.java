package homeworkLessonSpace3;
import java.io.*;
import java.util.Scanner;

public class homeworkSpace1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOne , numberTwo , numberTheree , highest = 0, lowest = 0 , mid = 0;






        // 30 60 50
        //yanlış version
        /*if (numberOne > numberTwo)
        {
            if (numberOne > numberTheree)
            {
                highest = numberOne;
            }
            if (numberTwo > numberTheree)
            {
                lowest = numberTheree;
                mid = numberTwo;
            }
            else
            {
                lowest = numberTwo;
                mid = numberTheree;
            }
        }
        else //30 50 60
        {
            if (numberTwo > numberTheree)
            {
                highest = numberTwo;
            }
            if (numberOne > numberTheree)
            {
                lowest = numberTheree;
                mid = numberOne;
            }

            else
            {
                lowest = numberOne;
                mid = numberTheree;

            }
        }*/

        for (;;)
        {
            System.out.print(_resetConsoleOut+ "number one:");
            numberOne = keyboard.nextInt();
            System.out.print("number two:");
            numberTwo = keyboard.nextInt();
            System.out.print("number theree:");
            numberTheree = keyboard.nextInt();
            System.out.println("");
            calculator(numberOne,numberTwo,numberTheree);
        }









    }

    public static void calculator(int numberOne , int numberTwo , int numberTheree)
    {
        int highest ,lowest,midle;
        /*int highest = 0,mid = 0,lowest = 0;
        if (numberOne > numberTwo & numberOne > numberTheree)
        {
            highest = numberOne;
            if (numberTwo > numberTheree)
            {
                mid = numberTwo;
                lowest = numberTheree;
            }
            else
            {
                mid = numberTheree;
                lowest = numberTwo;
            }
        }
        else if (numberTwo > numberOne & numberTwo > numberTheree)
        {
            highest = numberTwo;
            if (numberOne > numberTheree)
            {
                mid = numberOne;
                lowest = numberTheree;
            }
            else
            {
                mid = numberTheree;
                lowest = numberOne;
            }
        }
        else if (numberTheree > numberTwo & numberTheree > numberOne)
        {
            highest = numberTheree;
            if (numberTwo > numberTheree)
            {
                mid = numberOne;
                lowest = numberTwo;
            }
            else
            {
                mid = numberTwo;
                lowest = numberOne;

            }
        }*/
        highest = highest(numberTheree , highest(numberOne,numberTwo));
        lowest = lowest(numberTheree, lowest(numberOne,numberTwo));
        midle = mid(numberOne,numberTwo,numberTheree);
        String str1 = highest+">"+midle+">"+lowest;
        str1 = str1.equals(highest+">"+midle+">"+lowest)? _greenConsoleOut +"Basarili" + _resetConsoleOut :_redConsoleOut+ "reddedildi"+_resetConsoleOut;
        // System.out.printf("en büyük : %d %nortanca : %d%nen küçük : %d %n", highest,mid,lowest);
        System.out.printf("%d %s %d %s %d    %s %n",highest ,highest==midle ? "=":">" , midle , midle==lowest ? "=":">" , lowest,str1);

    }
    public static int highest(int numberOne , int numberTwo )
    {
        return numberOne>numberTwo ? numberOne : numberTwo;
    }
    public static int lowest(int numberOne , int numberTwo )
    {
        return numberOne>numberTwo ? numberTwo : numberOne;
    }
    public static int mid(int numberOne , int numberTwo ,int numberTheree)
    {
        int highest , lowest;
        highest = highest(numberTheree , highest(numberOne,numberTwo));
        lowest = lowest(numberTheree, lowest(numberOne,numberTwo));
        if (highest == numberOne )
        {
            if (lowest == numberTwo)
                return numberTheree;
            else return numberTwo;
        }
        else if (highest == numberTwo)
        {
            if (lowest == numberOne)
                return numberTheree;
            else return numberOne;
        }
        else if (highest == numberTheree )
        {
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
