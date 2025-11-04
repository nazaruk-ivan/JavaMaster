package personalpetprojects.library;

public class Book {
    private String title;
    private String author;
    private final String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    String get_titleAuthor(){
        return "Title: " + title + "| Author: " + author;
    }

    public void setDetails(String title1, String author1){
        this.title = title1;
        this.author = author1;

        System.out.println("New title and author was set: "+ title1 + ", "+ author1 );
    }

    public void borrowBook(){
        this.isAvailable = false;
        System.out.println(title +" was borrowed.");
    }

    public void returnBook(){
        this.isAvailable = true;
        System.out.println(title +" was returned.");
    }

    public String getInfo(){
        return "Title: " + title + "| Author: " + author + "| ISBN " + ISBN + "| isAvailable: " + isAvailable;
    }





}
