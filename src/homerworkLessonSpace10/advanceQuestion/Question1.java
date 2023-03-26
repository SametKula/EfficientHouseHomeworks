package homerworkLessonSpace10.advanceQuestion;

public class Question1 {
    public static void main(String[] args) {

    }

    public static int wordsFirstPlace(String aBigString, String finderOne) {
        return aBigString.indexOf(finderOne);
    }

    public static String displayPlaces(String aBigString, String wanted) {
        int count = 0;
        String places = "";

        for (int i = 0; i < aBigString.length(); i++)
            if (wordsFirstPlace(aBigString.substring(i), wanted) == 0) {
                places += String.format("the number the number is %d%n",i);
                count++;
            }
        places += "and there are " + count + " wanted numbers";

        return places;
    }

    public static String reversed(String wanted){
        String result = "";

        for (int i = wanted.length() - 1; i >= 0; i--){
            result += wanted.charAt(i);
        }

        return result;
    }

}
