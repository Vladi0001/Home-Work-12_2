import java.util.Objects;

public class Book {

    private String titleOfBooks;
    private String Author;
    private int yearOfPublication;

    public Book(String titleOfBooks, String Author, int yearOfPublication) {
        this.titleOfBooks = titleOfBooks;
        this.Author = Author;
        this.yearOfPublication = yearOfPublication;

    }

    public String getTitleOfBooks() {
        return this.titleOfBooks;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
//  HomeWork13
    public String toString() {
        return "Название книги - " + this.titleOfBooks + ". Автор - " + this.Author + ". Год написания - " + this.yearOfPublication;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(titleOfBooks, book.titleOfBooks) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfBooks, Author, yearOfPublication);
    }


}
