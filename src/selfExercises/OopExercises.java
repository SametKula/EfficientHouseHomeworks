package selfExercises;

public class OopExercises {

}

class App {
    public static void main(String[] args) {

    }
}

class Library {
    public static void nameAdjuster(Book book, String name) {
        book.name = name;
    }

    public static void ratingAdjuster(Book book, int incraserNumber) {
        book.rating += incraserNumber;
    }

    public static void nameAdjuster(Book book, int paperCount) {
        book.paperCount = paperCount;
    }

    public static void changeWriterStatus(Book book) {
        System.out.println("writer status changed to ->" + (book.isWriterAlive ? "Dead" : "Alive"));
        book.isWriterAlive = !book.isWriterAlive;
    }

    public static int readedCount(Book book) {
        return book.whatTimesRead;
    }

    public static void adjustReadedCount(Book book, int readedCount) {
        book.whatTimesRead = readedCount;
    }

    public static void rentBook(Book book, int day, int month, int year) {
        Date newDate;
        newDate = new Date();

        newDate.day = day;
        newDate.month = month;
        newDate.year = year;

        if (DateValidator.isDateValid(newDate)) {
            System.out.println("your rent proces is done have a nice day");
            book.date = newDate;
        } else
            System.out.println("please enter valid date");

    }
}

class Book {
    public String name;
    public int paperCount;
    public boolean isWriterAlive;
    public int rating;
    public int whatTimesRead;
    public boolean isAvailable;
    public Date date;
}

class Date {
    public int day;
    public int month;
    public int year;

}

class DateValidator {
    public static boolean isDateValid(Date date) {
        return date.day >= 1 && date.day <= 31 && 1 <= date.month && date.month <= 12 && date.day <= giveRealDay(date);
    }

    public static int giveRealDay(Date date) {
        int day = 31;

        switch (date.month) {
            case 4, 6, 9, 11 -> day = 30;
            case 2 -> {
                day = 29;
                if (isLeapYear(date))
                    day++;
            }
        }
        return day;
    }

    public static boolean isLeapYear(Date date) {
        return date.year % 4 == 0 && date.year % 100 != 0 || date.year % 400 == 0;
    }
}
