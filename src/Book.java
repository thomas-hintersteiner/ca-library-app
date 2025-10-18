public class Book {
    private String title;
    private Author author;
    private int year;
    private String isbn;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = "";
    }

    public Book(String title, Author author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return "Title: " + this.title + " (Year: " + this.year + ", ISBN: " + this.isbn + "), Autor: " + this.author.getInfo();
    }
}
