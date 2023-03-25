package homerworkLessonSpace10.advanceQuestion;

public class Question1 {

    public static boolean isWordThereAre(String word, String aBiggerString) {
        return aBiggerString.contains(word);
    }

    public static int wordPlace(String word, String aBiggerString, int beginIndex) {
        return aBiggerString.indexOf(word, beginIndex);
    }

    public static int wordPlace(String word, String aBiggerString) {
        return wordPlace(word, aBiggerString, 0);
    }

    public static int wordPlace(int aInt, long aLong) {
        return wordPlace(aInt + "", aLong + "");
    }

    public static int howManyHaveWord(String word, String aBiggerWord) {
        int count = -1, lastFounded = 0;

        while (lastFounded != -1) {
            lastFounded = wordPlace(word, aBiggerWord, lastFounded + 1);
            count++;
        }

        return count;
    }

    public static String countsPlaces(String word, String aBiggerWord) {
        return "orders: " + 1 + "   count" + howManyHaveWord(word, aBiggerWord) + "   is word there in another :" + isWordThereAre(word, aBiggerWord);
    }

    public static void main(String[] args) {
        System.out.println(countsPlaces("is", "wird is long is asper isdfsg"));
    }
}
