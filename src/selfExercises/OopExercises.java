package selfExercises;

public class OopExercises {

}

class App {
    public static void main(String[] args) {

    }
}

class Library {
    public static void nameAdjuster(Book book, String name){
        book.name = name;
    }

    public static void ratingAdjuster(Book book,int incraserNumber){
        book.rating += incraserNumber;
    }

    public static void nameAdjuster(Book book, int paperCount){
        book.paperCount = paperCount;
    }

    public static void changeWriterStatus(Book book){
        System.out.println("writer status changed to ->" + !book.isWriterAlive);
        book.isWriterAlive = !book.isWriterAlive;
    }

    public static int readedCount(Book book){
        return book.whatTimesRead;
    }
    public static void adjustReadedCount(Book book ,int readedCount){
        book.whatTimesRead = readedCount;
    }
}

class Book {
    public String name;
    public int paperCount;
    public boolean isWriterAlive;
    public int rating;
    public int whatTimesRead;
}
