package homeworkLessonSpace8;


public class PossibilitiesUtil {

    public static double diceChance (int a, int loopTimes, java.util.Random rd){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = rd.nextInt(6) + 1;

            if (a == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int loopTimes, java.util.Random rd){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = rd.nextInt(6) + 1;

            if (a == temp || b == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int c, int loopTimes, java.util.Random rd){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = rd.nextInt(6) + 1;

            if (a == temp || b == temp || c == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int c, int d,int loopTimes, java.util.Random rd){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = rd.nextInt(6) + 1;

            if (a == temp || b == temp || c == temp || d == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int c, int d, int f, int loopTimes,java.util.Random rd){
         int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = rd.nextInt(6) + 1;

            if (a == temp || b == temp || c == temp || d == temp || f == temp)
                count++;

        }

        return count / (double)loopTimes;
    }
    public static double diceChance (int a, int b, int c, int d, int f, int g, int loopTimes, java.util.Random rd ){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = rd.nextInt(6) + 1;

            if (a == temp || b == temp || c == temp || d == temp || f == temp || g == temp)
                count++;

        }

        return count / (double)loopTimes;
    }


    //yasaklanan java kullanimi
/**
* this method give odds ratio of given numbers possiblates to all sequence
*/
    public static double diceOddsRatio(int loopTimes, java.util.Random rd, int... ints){
        int count = 0;

        for (int i = 0; i < loopTimes; i++){
            int temp = rd.nextInt(6) + 1;

            for (int i1 : ints)
                if (i1 == temp)
                    count++;

        }

        return count / (double)loopTimes;
    }
}
