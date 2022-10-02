package homeworkLessonSpace2;

public class HomeworkDemo3v2 {
    public static void main(String[] args) {
        /*String str1 = "walt";
        String str2 = "disktrup";
        String str3 = "kamil";
        String str4 = "ulvi";
        String str5 = "mesken";
        String str6 = "kadir";
        String str7 = "namık";
        String str8 = "berke";*/
        //System.out.println(latinPiganator(str1,str2,str3,str4,str5,str6,str7,str8));
        String str = "    Hello word   ";
        String str1 = str.trim().toUpperCase().substring(0,str.trim().indexOf(' '));
        System.out.printf("%s", str1);
        

    }


    public static String latinPiganator(String... strings) {
        String latinPigWords = "";
        for (String string : strings) {
            String str3 = string.substring(1, 2).toUpperCase() + string.substring(2) + string.substring(0, 1).concat("ay");
            latinPigWords += str3.concat(" ");
        }




        return latinPigWords;
    }
}
