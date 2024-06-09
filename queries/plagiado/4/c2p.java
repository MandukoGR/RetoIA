import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", "1234567890"));
        library.addBook(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "0987654321"));

        Book book = library.findBookByTitle("1984");
        if (book != null) {
            System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }

        library.removeBook("1234567890");
        System.out.println("Book removed.");
    }
}
