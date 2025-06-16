import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Chair", "Furniture"),
            new Product(103, "Book", "Stationery"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Table", "Furniture")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();

        System.out.println("\n---By Linear Search ---");
        Product result1 = Search.linearSearch(products, searchName);
        System.out.println(result1 != null ? result1 : "Product not found.");

        System.out.println("\n---By  Binary Search ---");
        Search.sortByName(products); // Ensure array is sorted
        Product result2 = Search.binarySearch(products, searchName);
        System.out.println(result2 != null ? result2 : "Product not found.");

        scanner.close();
    }
}
