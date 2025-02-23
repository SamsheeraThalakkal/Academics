
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {

    String name;
    double price;

    public Product(String n, double p) {
        name = n;
        price = p;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

}

public class ProductDemo {

    static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Sort Products by Name");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    sort();
                    break;
                case 3:
                    displayProducts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void sort() {
        Collections.sort(products, Comparator.comparing(Product::getName));
        System.out.println("Products sorted by name.\n");
        for (Product p : products) {
            System.out.println("Name: " + p.getName() + ", Price: " + p.getPrice());
        }
    }

    public static void addProduct(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        products.add(new Product(name, price));
        System.out.println("Product added successfully!");
    }

    public static void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        System.out.println("\nProduct List:\n");
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
}
