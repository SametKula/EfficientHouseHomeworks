package homerworkLessonSpace10.periousHomeworkRewriteWithCTOR.hwLs9;

import java.util.Random;

public class TaxFactory {
    public static void displayTaxPropities(CarStore taxOwner) {
        System.out.printf("tax owner's name %s and its tax number is %s", taxOwner.taxOwnerName, taxOwner.taxNumber);
    }
    public static void displayTaxPropities(Resturant taxOwner) {
        System.out.printf("tax owner's name %s and its tax number is %s", taxOwner.taxOwnerName, taxOwner.taxNumber);
    }

    public static void setTaxRatio(CarStore taxOwner){
        taxOwner.taxPaymentRatio = taxOwner.yearlyGain / 365.;
    }
    public static void setTaxRatio(Resturant taxOwner){
        taxOwner.taxPaymentRatio = taxOwner.yearlyGain / 365.;
    }

    public static String taxNameCreate() {
        Random rd = new Random();
        String str = "" + (char) (rd.nextInt(9) + 49);

        for (int i = 0; i < 8; i++)
            str = str + (char) (rd.nextInt(9) + 48);

        //its need a control condition because maybe this taxNumber alerayd have taken
        return str;
    }
}
