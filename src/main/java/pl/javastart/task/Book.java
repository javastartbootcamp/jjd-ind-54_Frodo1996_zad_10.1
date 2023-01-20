package pl.javastart.task;

import java.util.Objects;

public class Book {
    private String title;
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Double.compare(book.pages, pages) == 0 && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages);
    }

    public void addInformationAboutBooks() {
    }
}
