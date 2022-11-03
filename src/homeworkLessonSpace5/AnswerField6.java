package homeworkLessonSpace5;

public class AnswerField6 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        int input1 = 1,input2 ;


        while (true) {

            System.out.print("\nplease enter your weight: ");
            input1 = keyboard.nextInt();

            if (input1 == 0)
                break;

            System.out.print("please enter your think to use days: ");
            input2 = keyboard.nextInt();
            System.out.println();

            displayIsRiskySodaPop(input1,input2);

        }
    }

    public static void displayIsRiskySodaPop(int weight, int days ){
        if (isPopSodaRisky(weight,days))
            System.out.println("its not risky for you <3");

        else
            System.out.println("its risky for you try low your usage day");

    }

    public static boolean isPopSodaRisky(int weight, int days) {

        for (int dose = 1; weight / dose > 10 ; dose++, --days,weight -= dose)
            if (days <= 0)
                return true;

        return false;
    }


}
