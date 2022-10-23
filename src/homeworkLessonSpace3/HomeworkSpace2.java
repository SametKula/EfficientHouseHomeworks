package homeworkLessonSpace3;


public class HomeworkSpace2 {
    public static void main(String[] args) {

        //Main Running method
        run();


    }

    public static void run() {
        //Scanner class
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        //declerations
        int x, y, z;

        //runtime actions and input area
        System.out.print("number one:");
        x = keyboard.nextInt();

        System.out.print("number two:");
        y = keyboard.nextInt();

        System.out.print("number there:");
        z = keyboard.nextInt();

        //display output
        System.out.printf("ortanca sayi : %d", midleNumberFinder(x, y, z));
    }

    //finder of midle number
    public static int midleNumberFinder(int x, int y, int z) {
        //if stantment for y is midle a number
        if (x <= y & y <= z || y >= z && y <= x)
            return y;

        //if stantment for x is midle a number
        if (y <= x & x <= z || x >= z && x <= y)
            return x;

        //otherwise ofcourse z is midle number
        return z;

    }
}
