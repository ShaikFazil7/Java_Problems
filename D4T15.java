
import java.util.*;

public class D4T15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> products = new HashMap<>();

        products.put(101, 10);
        products.put(102, 5);
        products.put(103, 3);
        products.put(104, 8);
        products.put(105, 0);

        System.out.println("Product Inventory: " + products);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        products.put(id, quantity);

        System.out.println("Product added successfully.");

        System.out.print(" Enter Product ID to update: ");
        int updateId = sc.nextInt();

        if (products.containsKey(updateId)) {

            System.out.print("Enter new quantity: ");
            int newQuantity = sc.nextInt();

            products.put(updateId, newQuantity);

            System.out.println("Quantity updated successfully.");

        } else {
            System.out.println("Product not found.");
        }

        System.out.print(" Enter Product ID sold: ");
        int soldId = sc.nextInt();

        int current = products.getOrDefault(soldId, -1);

        if (current != -1) {

            System.out.print("Enter sold quantity: ");
            int sold = sc.nextInt();

            if (sold > 0 && sold <= current) {
                products.put(soldId, current - sold);
                System.out.println("Sale completed successfully.");
            } else {
                System.out.println("Invalid sold quantity.");
            }

        } else {
            System.out.println("Product not found.");
        }

        System.out.print("\nEnter Product ID to search: ");
        int searchId = sc.nextInt();

        if (products.containsKey(searchId)) {
            System.out.println("Available Quantity: " +
                               products.get(searchId));
        } else {
            System.out.println("Product not found.");
        }

        System.out.println(" PRODUCT INVENTORY ");

        for (Map.Entry<Integer, Integer> entry : products.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() +
                               " Quantity: " + entry.getValue());
        }

        System.out.println(" LOW STOCK PRODUCTS ");

        for (Map.Entry<Integer, Integer> entry : products.entrySet()) {

            if (entry.getValue() < 5) {
                System.out.println("Product ID: " + entry.getKey() +
                                   " Quantity: " + entry.getValue());
            }
        }

        products.values().removeIf(q -> q == 0);

        System.out.println(" FINAL INVENTORY ");
        System.out.println(products);

    }
}
