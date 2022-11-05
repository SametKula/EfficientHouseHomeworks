package homeworkLessonSpace5;

public class Question6 {
    public static void main(String[] args) {
        finobacciNumber(25);
    }


    public static void finobacciNumber(int loopTimes){
        System.out.println(finobacciLoop(loopTimes));

    }

    public static int finobacciLoop(int x){
        int a = 1 , b = 1, c  = 0;

        x += 3;

        for (;x>0;){
            if (x != 0) {
                c = a + b;
                x--;
            }
            if (x != 0) {
                a = c + b;
                x--;
            }
            if (x != 0) {
                b = a + c;
                x--;
            }
        }
        return max(a,b,c);
    }

    public static int max(int x ,int b,int c){
        int max = x;
        max = b > x ? b : x ;
        max = c > x ? c : x ;
        max = c > b ? c : b ;
        return max;
    }

}
