package pl.javastart.task;

import java.util.Scanner;

public class BooksArray extends Book {
    private static final int MAX_ARRAY_SIZE = 3;
    Book[] books = new Book[MAX_ARRAY_SIZE];

    public BooksArray(String title, int pages) {
        super(title, pages);
    }

    public Book createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Tytuł");
        setTitle(scanner.nextLine());
        System.out.println("Podaj ilość stron");
        setPages(scanner.nextInt());
        scanner.nextLine();
        return new Book(getTitle(), getPages());
    }

    public void foundAndAddUniqueBook() {
        System.out.println("Podaj informację o trzech unikalnych książkach");
        for (int i = 0; i < books.length; i++) {
            books[i] = createBook();
            Book book = books[i];
            if (books[i].equals(book)) {
                System.out.println("Dupilkat");
            } else {
                books[i] = new Book(getTitle(), getPages());
            }
        }
    }

    public void getInfoAboutUniqueBooks() {
        System.out.println(books[0].toString());
        System.out.println(books[1].toString());
        System.out.println(books[2].toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}