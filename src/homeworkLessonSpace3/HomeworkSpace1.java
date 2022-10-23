package homeworkLessonSpace3;


public class HomeworkSpace1 {

    public static void main(String[] args) {
        run();

    }

    public static void run(){
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        System.out.print("number one:");
        int x = keyboard.nextInt();

        System.out.print("number two:");
        int y = keyboard.nextInt();

        System.out.print("number there:");
        int z = keyboard.nextInt();

        display(x, y, z);
    }
    public static void display(int x, int y, int z) {

        int max = max(z, max(x, y));

        int min = min(z, min(x, y));

        int midle = x + y + z - (max + min);

        System.out.printf("%d %s %d %s %d %n", max, max == midle ? "=" : ">", midle, midle == min ? "=" : ">", min);
    }
    public static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }
    public static int min(int x, int y) {
        if (x > y)
            return y;
        else
            return x;
    }


}
