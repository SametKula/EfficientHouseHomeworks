package homeworkLessonSpace5;

public class Question6 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.print("enter your days: ");
        int input = kb.nextInt();


        displayIncrasePopulation(input);
    }


    public static void displayIncrasePopulation(int loopTimes) {
        System.out.printf("your poplation become will %d entitys", populationIncraseLoop(loopTimes));
    }

    public static int populationIncraseLoop(int x) {
        int a = 1, b = 1;

        x /=5;

        for (int i = 1; x > i ; i++) {
            int c = a + b;

            a = b;
            b = c;
        }

        return b*10;
    }



}
