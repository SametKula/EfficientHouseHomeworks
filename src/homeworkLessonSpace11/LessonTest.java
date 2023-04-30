package homeworkLessonSpace11;

public class LessonTest {
    public static void main(String[] args) {
        System.out.print(leftPad("maawiut", 8, '2'));
    }
    static public String leftPad (String str, int totalLenght, char addingChar){
        int addingLengt = totalLenght - str.length();

        return addingLengt < 0 ? str : (addingChar + "").repeat(addingLengt) + str;
    }

    static public String leftPad (String str, int totalLenght){
        return leftPad(str, totalLenght,' ');
    }

    static public String rightPad (String str, int totalLenght, char addingChar){
        int addingLengt = totalLenght - str.length();

        return addingLengt < 0 ? str :  str + (addingChar + "").repeat(addingLengt) ;
    }

    static public String rightPad (String str, int totalLenght){
        return rightPad(str, totalLenght,' ');
    }
}
