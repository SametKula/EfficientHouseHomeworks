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

    public static void ratingUpdater(Book book){

    }
}

class Book {
    public String name;
    public int paperCount;
    public boolean isWriterAlive;
    public int rating;
    public int whatTimesRead;
}
