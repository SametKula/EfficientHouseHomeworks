package homeworkLessonSpace2;

import java.util.Scanner;

public class HomeworkDemo2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to coupons2candybar calculator(if )");
        //coupon value
        System.out.print("How many coupons do you have:");
        int coupons = keyboard.nextInt();


        //prizes
        int candyBarPrice = 10;
        int gumballPrice = 3;
        //calculating field
        int countOfCandyBar = coupons/candyBarPrice;
        int couponsAfterTakeCandyBar = coupons-(countOfCandyBar*candyBarPrice);
        int countOfGumball = couponsAfterTakeCandyBar/gumballPrice;
        int residuary =coupons- (countOfGumball*3+countOfCandyBar*10);

        //return
        System.out.printf("Candbar count is %d %nGumball count is %d %nResiduary is %d",countOfCandyBar,countOfGumball,residuary);
        /*terminal output is:
        Welcome to coupons2candybar calculator(enter value of coupons )
        enter coupons
        >>>54
        Candbar count is 5
        Gumball count is 1
        Residuary is 1*/






    }
}
