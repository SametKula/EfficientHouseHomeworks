package homeworkLessonSpace5.questionsRefactoredVersinios;

public class RefinedQuestion2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {

        String rgbPalette = rgbInput();

        displayIsValid(rgbPalette);

    }

    public static String rgbInput( ){
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        String input = "", temp ,previousChar = " ";

        while (input.length() < 5) {
            System.out.print("enter your palette letter: ");
            temp = keyboard.next().trim();

            if (temp.equalsIgnoreCase(previousChar)){
                System.out.println("you can't enter previous one");
                continue;
            }

            if (!(temp.equalsIgnoreCase("R") || temp.equalsIgnoreCase("G") || temp.equalsIgnoreCase("B"))) {
                System.out.println("please use only R G B chars");
                continue;
            }


            previousChar = temp;
            input = input.concat(temp.toUpperCase().trim());
        }
        return input;
    }

    public static void displayIsValid(String input) {
        System.out.printf("The pallet which one the your entered is Valid  and your pattern is %s",input);
    }


}
