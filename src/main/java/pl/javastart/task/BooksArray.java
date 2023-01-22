package pl.javastart.task;

import java.util.Scanner;

public class BooksArray {
    private static final int MAX_ARRAY_SIZE = 3;
    Book[] books = new Book[MAX_ARRAY_SIZE];

    public void addUniqueBook() {
        System.out.println("Podaj informację o trzech unikalnych książkach");
        for (int i = 0; i < books.length;) {
            Book book = createBook();
            if (isDuplicate(book, books)) {
                System.out.println("Duplikat");
            } else {
                books[i] = book;
                i++;
            }
        }
    }

    public Book createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Tytuł");
        String title = scanner.nextLine();
        System.out.println("Podaj ilość stron");
        int pages = scanner.nextInt();
        scanner.nextLine();
        return new Book(title, pages);
    }

    public void getInfoAboutUniqueBooks() {
        System.out.println(books[0].toString());
        System.out.println(books[1].toString());
        System.out.println(books[2].toString());
    }

    public boolean isDuplicate(Book book, Book[] books) {
        for (Book book1 : books) {
            if (book.equals(book1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}