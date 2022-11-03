package homeworkLessonSpace5;

public class Question2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        rgbMethodRun();

    }
    //buralarda biraz düzenleme yapıcam gibi
    public static void rgbMethodRun() {

        displayIsValid(isValidType());

    }

    public static String rgbInputLoop ( ){
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        String input = "", temp;

        while (input.length() < 5) {
            temp = "";
            System.out.print("enter your  R G B color  : ");
            temp = keyboard.next();
            if (!(temp.equalsIgnoreCase("R") || temp.equalsIgnoreCase("G") || temp.equalsIgnoreCase("B"))) {
                System.out.println("please use only R G B chars");
                continue;
            }
            input = input.concat(temp.toUpperCase().trim());
        }
        return input;
    }

    public static void displayIsValid(boolean b) {
        if (b)
            System.out.println("your input type is valid");
        else
            System.out.println("your input type is invalid");

    }

    public static boolean isValidType() {
        String x = rgbInputLoop();
        for (int i = 0; i < x.length() - 1; i++)
            if (x.substring(i, i + 1).equals(x.substring(i + 1, i + 2)))
                return false;

        return true;
    }
}
