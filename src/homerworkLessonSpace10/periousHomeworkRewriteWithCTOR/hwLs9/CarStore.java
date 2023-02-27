package homerworkLessonSpace10.periousHomeworkRewriteWithCTOR.hwLs9;

public class CarStore {
    String taxOwnerName;
    String taxNumber;
    int carsHave;

    public CarStore(String name, int carsCount){
        taxOwnerName = name;
        carsHave = carsCount;
        taxNumber = TaxFactory.taxNameCreate();
    }
}
