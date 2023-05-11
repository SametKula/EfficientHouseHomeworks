package homeworkLessonSpace12.homeworkCapitalize;

public class Capitalize {
    public static String capitalize(String text){
        int i;

        if (text.isBlank())
            return text;

        for (i = 0; i < text.length() ; i++)
            if (Character.isLetter(text.charAt(i)))
                break;

        return text.substring(0,i) + Character.toUpperCase(text.charAt(i)) + text.substring(i + 1);
    }
    public static String capitalizeAllSentences (String text){
        String result = "" , temp = "";

        for (;;){
            int firstQuestionMark = text.indexOf("?"), firstDot = text.indexOf("."), tempTarget;

            if (firstQuestionMark == -1 && firstDot != -1)
                tempTarget = firstDot;
            else if (firstQuestionMark != -1 && firstDot == -1)
                tempTarget = firstQuestionMark;
            else if (firstQuestionMark != -1 && firstDot != -1)
                tempTarget = Math.min(firstQuestionMark,firstDot);
            else
                break;

            result += capitalize(text.substring(0,tempTarget + 1));
            text = text.substring(tempTarget + 1);
        }
        result += capitalize(text.equals("") ? " ": text);
        return result;
    }

    public static void main(String[] args) {

    }

}
