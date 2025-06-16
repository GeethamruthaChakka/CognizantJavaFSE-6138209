
// LibrarySearch.java
import java.util.*;

public class LibrarySearch {

    // Linear Search by Title
    public static Book linearSearchByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search by Title
    public static Book binarySearchByTitle(Book[] books, String title) {
        Arrays.sort(books, Comparator.comparing(b -> b.title));
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);

            if (cmp == 0)
                return books[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "Java Basics", "John Doe"),
                new Book(2, "Data Structures", "Jane Smith"),
                new Book(3, "Algorithms", "Alan Turing"),
                new Book(4, "Operating Systems", "Andrew Tanenbaum")
        };

        String searchTitle = "Data Structures";
        Book result = linearSearchByTitle(books, searchTitle);
        System.out.println("Linear Search Result: " + (result != null ? result : "Not Found"));

        result = binarySearchByTitle(books, searchTitle);
        System.out.println("Binary Search Result: " + (result != null ? result : "Not Found"));
    }
}
