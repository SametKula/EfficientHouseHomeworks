package selfExercises;

public class EfficentHouseDateQoestion {
    public static void main(String[] args) {
        Dates date ;
        date = new Dates();

        date.day = 22;
        date.month = 9;
        date.year = 2022;

        int count = 0;

        while (!(date.day >= 10 && date.month >= 6 && date.year >= 2027)){
            date.day += 11;
            if (date.day > DateUtil.mounthsDays(date)){
                date.day -= DateUtil.mounthsDays(date);
                date.month++;
                if (date.month > 12){
                    date.year++;
                    date.month = 1;
                }
            }
            count++;
            System.out.printf("%02d || %02d || %d -------- %d%n",date.day,date.month,date.year,count);
        }

        System.out.println(count);





    }


}

class DateUtil {
    public static boolean isDateValid(Dates date) {
        return date.day >= 1 && date.day <= 31 && 1 <= date.month && date.month <= 12 && date.day <= mounthsDays(date);
    }

    public static int mounthsDays(Dates date) {
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
class Dates {
    public int day;
    public int month;
    public int year;

}
