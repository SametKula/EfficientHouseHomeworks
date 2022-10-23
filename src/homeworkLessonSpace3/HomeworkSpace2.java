package homeworkLessonSpace3;


public class HomeworkSpace2 {
    public static void main(String[] args) {

        run();

    }

    public static void run() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);


        System.out.print("number one:");
        int x = keyboard.nextInt();

        System.out.print("number two:");
        int y = keyboard.nextInt();

        System.out.print("number there:");
        int z = keyboard.nextInt();

        System.out.printf("ortanca sayi : %d", midleNumberFinder(x, y, z));
    }

    public static int midleNumberFinder(int x, int y, int z) {
        if (x <= y & y <= z || y >= z && y <= x)
            return y;

        if (y <= x & x <= z || x >= z && x <= y)
            return x;

        return z;

    }

}
