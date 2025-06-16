import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Inventory");
            System.out.println("5. Search Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    Product p = new Product(id, name, qty, price);
                    inventory.addProduct(p);
                    break;

                case 2:
                    System.out.print("Enter Product ID to Update: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter New Quantity: ");
                    qty = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    price = scanner.nextDouble();
                    p = new Product(id, name, qty, price);
                    inventory.updateProduct(p);
                    break;

                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    id = scanner.nextInt();
                    inventory.deleteProduct(id);
                    break;

                case 4:
                    inventory.displayInventory();
                    break;

                case 5:
                    System.out.print("Enter Product ID to Search: ");
                    id = scanner.nextInt();
                    Product product = inventory.getProduct(id);
                    if (product != null) {
                        System.out.println(product);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
