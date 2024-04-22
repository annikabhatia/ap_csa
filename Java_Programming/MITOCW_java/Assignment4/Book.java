import java.util.ArrayList;

public class Book {

    String title;
    ArrayList<Book> Books;

    // Creates a new Book
    public Book(String bookTitle) {
        title = bookTitle;
        Books = new ArrayList<Book>(); 
    }
   
    // Marks the book as rented
    public void borrowed() {
        
    }
   
    // Marks the book as not rented
    public void returned() {
        // Implement this method
    }
   
    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
    }
   
    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        //example.rented();
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 
