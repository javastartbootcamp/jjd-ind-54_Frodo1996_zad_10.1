package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        BooksArray booksArray = new BooksArray("a", 1);
        booksArray.foundAndAddUniqueBook();
//        booksArray.createBook();
        booksArray.getInfoAboutUniqueBooks();
    }
}
