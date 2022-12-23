package homeworkLessonSpace6;

public class Question1 {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        starMaker(25);
    }

    public static void starMaker(int x){
        int count  = 1 , temp = 1;
        for (int i = 0; i < x ; i++) {
            for (int k = 0;k < x - temp ;k++)
                System.out.print(" ");

            for (int j = 0 ;j < count; j++)
                System.out.print("*");

            System.out.println();
            count += 2;
            temp++;
        }
        count -= 4;
        temp -= 2;
        for (int i = x; i > 0 ; i--) {
            for (int k = 0;k < x - temp ;k++)
                System.out.print(" ");

            for (int j = 0 ;j < count; j++)
                System.out.print("*");

            System.out.println();
            count -= 2;
            temp--;
        }


    }
}
