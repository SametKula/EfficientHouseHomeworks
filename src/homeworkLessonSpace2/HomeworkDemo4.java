package homeworkLessonSpace2;

public class HomeworkDemo4 {
    public static void main(String[] args) {
        //variables
        int firstWeight = 100;
        int desiredWeight = 90;
        int elapsedTime = 10;
        //system message
        System.out.printf("Welcome to soda pop risk calculator%nPlease enter your present weight ,the weight you want to be and probably time will pass%n>>>%d,%d,%d %n---------------------------%n",firstWeight,desiredWeight,elapsedTime);


        //risk calculator
        int result = (firstWeight-desiredWeight)/elapsedTime;
        //if else statement
        String finalResult = result==0?"you may die":"not risky";
        System.out.println(finalResult);
        /*System output is:
        Please enter your present weight ,the weight you want to be and probably time will pass
        >>>100,90,10
        ---------------------------
        not risky

         */



    }
}
