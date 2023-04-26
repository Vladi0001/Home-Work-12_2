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

}
