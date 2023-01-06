package selfExercises;

public class EfficentHouseDateQoestion {
    public static void main(String[] args) {
        Dates date1 ,date2;

        date1 = new Dates();
        date2 = new Dates();

        date1.day = 9;
        date1.month = 12;
        date1.year = 2022;

        date2.day = 21;
        date2.month = 1;
        date2.year = 2027;

        int asx = DateUtil.runSecondMethod(date1,date2);
        System.out.printf("days: %d",asx);
        System.out.printf("hm: %d%n",asx/11);


    }


}

class DateUtil {
    public static void runFirstMethod(){
        Dates date ;
        date = new Dates();

        date.day = 9;
        date.month = 12;
        date.year = 2022;

        int count = 0;

        while (!(date.day >= 10 && date.day < 21 && date.month >= 1 && date.year >= 2027)){
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
    public static int runSecondMethod(Dates date1 , Dates date2){
        Dates maxDate = date1 , minDate = date2;
        int resultDays = 0;

        if (date1.year - date2.year != MathUtil.absolute(date1.year - date2.year)){
            maxDate = date2;
            minDate = date1;
        }

        int yearCount = 0 , leapYearDays = 0;

        for(; minDate.year != maxDate.year; yearCount++, minDate.year++)
            if(isLeapYear(minDate.year))
                leapYearDays++;

        resultDays += yearCount*365 + leapYearDays;
        int fixer = 1;

        if(maxDate.month - minDate.month != MathUtil.absolute(maxDate.month - minDate.month)){
            maxDate = date1;
            minDate = date2;
            fixer = -1;
        }

        int monthCount = 0;
        for( ; minDate.month != maxDate.month; minDate.month++)
            monthCount += DateUtil.mounthsDays(minDate);

        resultDays += fixer*(monthCount + MathUtil.absolute(maxDate.day - minDate.day));

        return resultDays;
    }
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
class MathUtil {
    public static int absolute(int x){
        return x > 0 ? x : x * -1;
    }
}
class Dates {
    public int day;
    public int month;
    public int year;

}
