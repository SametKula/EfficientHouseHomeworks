package homerworkLessonSpace10.advanceQuestion;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(displayPlaces("122122122333122333", "122"));
    }

    public static int wordsFirstPlace(String aBigString, String finderOne) {
        return aBigString.indexOf(finderOne);
    }

    public static String displayPlaces(String aBigString, String wanted) {
        int count = 0, countTemp = 0;
        String places = "", temp = aBigString;

//        for (int i = 0; i < aBigString.length(); i++)
//            if (wordsFirstPlace(aBigString.substring(i), wanted) == 0) {
//                places += String.format("the number the number is %d%n",i);
//                count++;
//            }
//        places += "and there are " + count + " wanted numbers";

        while(true){
            int wantedOrder = wordsFirstPlace(temp, wanted);

            countTemp += countTemp == 0 ? wantedOrder : wantedOrder + 1;
            if (wantedOrder == -1)
                break;

            places += "in this order there is a word " + countTemp + "\n";

            temp = temp.substring(wantedOrder + 1);

            count++;
        }

        return places + "  \nand there is wanted"+count;
    }

    public static String reversed(String wanted){
        String result = "";

        for (int i = wanted.length() - 1; i >= 0; i--){
            result += wanted.charAt(i);
        }

        return result;
    }

}
