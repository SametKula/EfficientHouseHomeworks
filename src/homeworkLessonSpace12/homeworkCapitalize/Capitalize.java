package homeworkLessonSpace12.homeworkCapitalize;

public class Capitalize {
    public static String capitalize(String text){
        int i;

        for (i = 0; i < text.length() ; i++)
            if (Character.isLetter(text.charAt(i)))
                break;

        return text.substring(0,i) + Character.toUpperCase(text.charAt(i)) + text.substring(i + 1);
    }
    public static String capitalizeAllSentences (String text){
        String result = "" , temp = "";

        for (;;){
            int firstQuestionMark = text.indexOf("?"), firstDot = text.indexOf("."), tempTarget;

            if (firstQuestionMark > firstDot && firstDot != -1)
                tempTarget = firstDot;
            else if (firstQuestionMark < firstDot && firstQuestionMark != -1)
                tempTarget = firstQuestionMark;
            else
                break;

            result += capitalize(text.substring(0,tempTarget + 1));
            text = text.substring(tempTarget + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(capitalizeAllSentences("asdgnmsfadgjhdg .sadfsdaafasd? asadfsadffsdafasdasdf?asdasdasdasd."));
    }

}
