package homeworkLessonSpace3;


public class HomeworkSpace1 {
    public static void main(String[] args) {
        run();
    }

    //Runtime Method
    public static void run(){
        //Scanner class
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        //Declerations
        int x, y, z;

        //Ruinnging time actions
        System.out.print("number one:");
        x = keyboard.nextInt();

        System.out.print("number two:");
        y = keyboard.nextInt();

        System.out.print("number there:");
        z = keyboard.nextInt();

        //Method to usage console display
        display(x, y, z);
    }
    //Display area
    public static void display(int x, int y, int z) {
        //Declerations
        int _max, _min, _midle;

        //Calculate area
        _max = max(z, max(x, y));//Finding highiest number using max method

        _min = min(z, min(x, y));//Finding lowiest  number using min method

        _midle = x + y + z - (_max + _min);

        //Console output area                                        check equals or not
        System.out.printf("%d %s %d %s %d %n", _max, _max == _midle ? "=" : ">", _midle, _midle == _min ? "=" : ">", _min);
    }
    //max method for find highiest number around two numbers
    public static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }
    //min method for find lowiest number around two numbers
    public static int min(int x, int y) {
        if (x > y)
            return y;
        else
            return x;
    }


}
