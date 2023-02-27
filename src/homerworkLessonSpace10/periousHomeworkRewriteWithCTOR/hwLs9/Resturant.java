package homerworkLessonSpace10.periousHomeworkRewriteWithCTOR.hwLs9;

public class Resturant {
    String taxOwnerName;
    String taxNumber;
    String foodNames;

    double taxPaymentRatio;
    int yearlyGain;

    public Resturant(String name, String havingFoodNames , int newNearlyGain){
        taxOwnerName = name;
        foodNames = havingFoodNames;
        yearlyGain = newNearlyGain;

        taxNumber = TaxFactory.taxNameCreate();
    }
}
