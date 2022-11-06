package homeworkLessonSpace5;

public class Question6 {
    public static void main(String[] args) {
        finobacciNumber(0);
    }


    public static void finobacciNumber(int loopTimes) {
        System.out.println(finobacciLoop(loopTimes));

    }

    public static int finobacciLoop(int x) {
        int a = 1, b = 1;


        for (int i = 1; x > i ; i++) {

            int c = a + b;
            System.out.println(a*10 + " + " + b*10 + " = " + c*10 +" populasyon pound cinsinden");
            a = b;
            b = c;
        }

        return b*10;

    }



}
