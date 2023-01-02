package selfExercises;

public class EfficentHouseDateQoestion {


}
class DateUtil {
    public static boolean isDateValid(Date date) {
        return date.day >= 1 && date.day <= 31 && 1 <= date.month && date.month <= 12 && date.day <= mounthsDays(date);
    }

    public static int mounthsDays(Date date) {
        int day = 31;

        switch (date.month) {
            case 4, 6, 9, 11 -> day = 30;
            case 2 -> {
                day = 29;
                if (isLeapYear(date.year))
                    day++;
            }
        }
        return day;
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
