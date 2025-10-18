public class LibraryApp {
    static void main() {
        Author authorMax = new Author("Max Mustermann", "max@mustermann.at");
        Author authorRobert = new Author("Robert C. Martin", "unclebob@example.com");

        Book javaProfi = new Book("Der Java-Profi", authorMax, 2024);
        Book cleanCode = new Book("Clean Code", authorRobert, 2008);

        Library linz = new Library("Linz");
        linz.addBook(javaProfi);
        linz.addBook(cleanCode);

        linz.listBooks();

        Book foundBook = linz.findBookByTitle("Clean Code");
        if (foundBook != null) {
            System.out.println(foundBook.getDescription());
        }
    }
}
