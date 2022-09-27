package Hmwk2;

public class HomeworkDemo3 {
    public static void main(String[] args) {
        //Strings
        String str1 = "walt";
        String str2 = "savitch";
        System.out.printf("Welcome to pig latininator %nEnter two strings to your want to transform %n----------------------%n>>> First string : %s %n>>> Second string : %s %n---------------------------+%n", str1, str2);
        //first string field
        String strFirstLetter = str1.charAt(0) + "";
        String strSecondLetter = str1.charAt(1) + "";
        str1 = str1.replaceFirst(strFirstLetter, "").concat(strFirstLetter + "ay");
        str1 = str1.replaceFirst(strSecondLetter, "");
        str1 = strSecondLetter.toUpperCase() + str1;
        //second string field
        String str2FirstLetter = str2.charAt(0) + "";
        String str2SecondLetter = str2.charAt(1) + "";
        str2 = str2.replaceFirst(str2FirstLetter, "").concat(str2FirstLetter + "ay");
        str2 = str2.replaceFirst(str2SecondLetter, "");
        str2 = str2SecondLetter.toUpperCase() + str2;
        //combine field
        String combinedStrings = str1.concat(" " + str2);
        //result
        System.out.println(combinedStrings);
        //System out is :
        /*
        Welcome to pig latininator
        Enter two strings to your want to transform
        ----------------------
        >>> First string : walt
        >>> Second string : savitch
        ---------------------------+
        Altway Avitchsay
         */


    }
}
