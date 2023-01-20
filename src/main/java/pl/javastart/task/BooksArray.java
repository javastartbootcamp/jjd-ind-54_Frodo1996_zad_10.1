package pl.javastart.task;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class BooksArray extends Book {
    private static final int MAX_ARRAY_SIZE = 3;
    Scanner scanner = new Scanner(System.in);
    String bothNew;
    String previous;
    Book[] books = new Book[MAX_ARRAY_SIZE];

    public void addInformationAboutBooks() {
        System.out.println("Podaj informację o trzech unikalnych książkach");
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.println("Podaj Tytuł");
            setTitle(scanner.nextLine());
            System.out.println("Podaj ilość stron");
            setPages(scanner.nextInt());
            scanner.nextLine();
            bothNew = getTitle() + getPages();
            if (bothNew.equals(previous)) {
                System.out.println("Dupilkat");
                i--;
            } else {
                previous = bothNew;
            }
        }
        System.out.println("Obiekty zapisane w tablicy:");
        System.out.println(books[0].toString());
        System.out.println(books[1].toString());
        System.out.println(books[2].toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", pages=" + getPages() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        BooksArray that = (BooksArray) o;
        return Objects.equals(scanner, that.scanner) && Objects.equals(bothNew, that.bothNew) &&
                Objects.equals(previous, that.previous) && Arrays.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), scanner, bothNew, previous);
        result = 31 * result + Arrays.hashCode(books);
        return result;
    }
}