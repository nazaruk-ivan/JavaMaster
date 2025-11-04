package personalpetprojects.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println(book.get_titleAuthor() + " was added to the library.");
    }

    public void addUser(User user){
        users.add(user);
        System.out.println(user.getInfo() + " was added to the user list.");
    }

    public Book findBook(String title){
        for (Book book : books) {
            if (book.get_titleAuthor().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Book found: " + book.getInfo());
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public void printAllBooks(){
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }

        System.out.println("All books:");
        for (Book book: books){
            System.out.println(book.getInfo());
        }
    }

    public static class Statistics {
        public static void printStats(Library library) {
            System.out.println("\n===== Library Statistics =====");
            System.out.println("Total books: " + library.books.size());
            System.out.println("Total users: " + library.users.size());
            System.out.println("================================\n");
        }
    }
}
