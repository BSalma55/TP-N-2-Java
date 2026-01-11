import java.util.ArrayList;
import java.util.Scanner;
public class ProductManagementApp {
        public static void main(String[] args) {

            ArrayList<Product> products = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            // Add products
            products.add(new Product(1,"Laptop", 8000));
            products.add(new Product(2, "Mouse", 150));
            products.add(new Product(3, "Keyboard", 300));

            // Display products
            System.out.println("List of products:");
            for (Product p : products) {
                System.out.println(p);
            }

            // Delete a product by index
            System.out.print("\nEnter index to delete: ");
            int deleteIndex = sc.nextInt();
            if (deleteIndex >= 0 && deleteIndex < products.size()) {
                products.remove(deleteIndex);
                System.out.println("Product deleted.");
            } else {
                System.out.println("Invalid index.");
            }

            // Modify a product by index
            System.out.print("\nEnter index to modify: ");
            int modifyIndex = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (modifyIndex >= 0 && modifyIndex < products.size()) {
                System.out.print("New name: ");
                String newName = sc.nextLine();
                System.out.print("New price: ");
                double newPrice = sc.nextDouble();

                products.get(modifyIndex).setName(newName);
                products.get(modifyIndex).setPrice(newPrice);
                System.out.println("Product modified.");
            } else {
                System.out.println("Invalid index.");
            }

            // Search product by name
            sc.nextLine(); // clear buffer
            System.out.print("\nEnter product name to search: ");
            String searchName = sc.nextLine();

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

            sc.close();
        }
    }


