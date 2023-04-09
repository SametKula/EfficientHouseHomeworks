package homerworkLessonSpace10.interviewProject;

public class Tst {
    public static void main(String[] args)
    {
        //System.out.println(helloTo("Eren", 31, 3));
        System.out.println(getLongestPalindrom(" ahmet eren adaedipadakisikalipapilakisikada "));
    }
    public static String helloTo(String name, int day, int month){
        return String.format("hello %s (%d / %d)",name ,day, month);
    }
    public static String reverse(String text){
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--){
            result += text.charAt(i);
        }

        return result;
    }
    public static boolean isPalindrom(String str){
        return str.equals(reverse(str)) && str.length() > 1;
    }
    public static String getLongestPalindrom(String text){
        String result = "";

        for (int i = 0; i < text.length(); i++)
            for (int j = text.length(); j > i ; j--){
                String temp = text.substring(i, j);
                if (isPalindrom(temp) && result.length() < temp.length())
                    result = temp;
            }

        return result;
    }



}
