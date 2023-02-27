package homerworkLessonSpace10.periousHomeworkRewriteWithCTOR.hwLs9;

public class CarStore {
    String taxOwnerName;
    String taxNumber;
    int carsHave;

    double taxPaymentRatio;
    int yearlyGain;

    public CarStore(String name, int carsCount, int gainForYear){
        taxOwnerName = name;
        carsHave = carsCount;
        yearlyGain = gainForYear;//╰(*°▽°*)╯
        taxNumber = TaxFactory.taxNameCreate();
    }


    public void changeName(String newName){
        taxOwnerName = newName;
    }
}
