package homerworkLessonSpace10.periousHomeworkRewriteWithCTOR.hwLs9;

import java.util.Random;

public class TaxFactory <T> {


    public static String taxNameCreate() {
        Random rd = new Random();
        String str = "" + (char) (rd.nextInt(9) + 49);

        for (int i = 0; i < 8; i++)
            str = str + (char) (rd.nextInt(9) + 48);

        //its need a control condition because maybe this taxNumber alerayd have taken
        return str;
    }
}
