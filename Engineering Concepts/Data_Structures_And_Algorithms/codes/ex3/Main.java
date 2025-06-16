import java.util.*;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 550.50),
            new Order(2, "Bob", 320.00),
            new Order(3, "Charlie", 790.25),
            new Order(4, "David", 130.00)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        System.out.println("\nSorted by Bubble Sort:");
        Sorting.bubbleSort(orders);
        for (Order o : orders) System.out.println(o);

        Order[] orders2 = {
            new Order(1, "Alice", 550.50),
            new Order(2, "Bob", 320.00),
            new Order(3, "Charlie", 790.25),
            new Order(4, "David", 130.00)
        };

        System.out.println("\nSorted by Quick Sort:");
        Sorting.quickSort(orders2, 0, orders2.length - 1);
        for (Order o : orders2) System.out.println(o);
    }
}