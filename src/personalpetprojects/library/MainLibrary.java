package personalpetprojects.library;

public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("1984", "George Orwell", "001", true);
        Book b2 = new Book("Dune", "Frank Herbert", "002", true);
        User u1 = new User("Ivan");
        User u2 = new User("Denys");

        library.addBook(b1);
        library.addBook(b2);
        library.addUser(u1);
        library.addUser(u2);

        b1.borrowBook();
        library.findBook("Dune");

        library.printAllBooks();
        Library.Statistics.printStats(library);
    }
}