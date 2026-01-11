import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display the list of products");
            System.out.println("2. Search for a product by id");
            System.out.println("3. Add a new product");
            System.out.println("4. Delete a product by id");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    List<Product> all = metier.getAll();
                    if (all.isEmpty()) {
                        System.out.println("The list is empty!");
                    } else {
                        all.forEach(System.out::println);
                    }
                    break;

                case 2:
                    System.out.print("Enter the product id: ");
                    long idSearch = sc.nextLong();
                    Product found = metier.findById(idSearch);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter id: ");
                    long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter stock: ");
                    int stock = sc.nextInt();
                    metier.add(new Product(id, name, brand, price, desc, stock));
                    System.out.println("Product added!");
                    break;

                case 4:
                    System.out.print("Enter the product id to delete: ");
                    long idDel = sc.nextLong();
                    metier.delete(idDel);
                    System.out.println("Product deleted if it existed!");
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
