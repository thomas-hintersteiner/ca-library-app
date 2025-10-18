import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void listBooks() {
        //this.books.forEach(book -> System.out.println(book.getDescription()));

        for (Book book : this.books) {
            System.out.println(book.getDescription());
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
