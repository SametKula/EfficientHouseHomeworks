package homeworkLessonSpace2;

public class HomeworkDemo2 {
    public static void main(String[] args) {
        System.out.println("Welcome to coupons2candybar calculator(if )");
        //coupon value
        int coupons = 54;
        System.out.printf("enter coupons %n>>>%d%n",coupons);

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
