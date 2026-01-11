import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 1500.0));
        products.add(new Product(2, "Phone", 800.0));
        products.add(new Product(3, "Tablet", 400.0));

        System.out.println("List of products:");
        displayProducts(products);

        System.out.println("\nDeleting the product at index 1...");
        if (products.size() > 1) {
            products.remove(1);
        }
        displayProducts(products);

        System.out.println("\nModifying the product at index 0...");
        if (!products.isEmpty()) {
            Product p = products.get(0);
            p.setName("Gaming Laptop");
            p.setPrice(2000.0);
        }
        displayProducts(products);

        System.out.print("\nEnter the product name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Product found: " + p);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }

        scanner.close();
    }

    public static void displayProducts(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + " - " + products.get(i));
        }
    }
}
