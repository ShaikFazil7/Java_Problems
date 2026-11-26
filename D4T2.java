
import java.util.ArrayList;
import java.util.Scanner;

public class D4T2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();

        cart.add("Laptop");
        quantity.add(2);

        cart.add("Mobile");
        quantity.add(1);

        cart.add("Headphones");
        quantity.add(3);

        cart.add("Keyboard");
        quantity.add(2);

        cart.add("Mouse");
        quantity.add(1);

        System.out.println("===== SHOPPING CART =====");

        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i) +
                " - Quantity: " + quantity.get(i));
        }

        System.out.print("\nEnter product name to remove: ");
        String removeProduct = sc.nextLine();

        int removeIndex = cart.indexOf(removeProduct);

        if (removeIndex != -1) {
            cart.remove(removeIndex);
            quantity.remove(removeIndex);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }

        System.out.print("\nEnter product name to update quantity: ");
        String updateProduct = sc.nextLine();

        int updateIndex = cart.indexOf(updateProduct);

        if (updateIndex != -1) {

            System.out.print("Enter new quantity: ");
            int newQuantity = sc.nextInt();
            sc.nextLine();

            if (newQuantity > 0) {
                quantity.set(updateIndex, newQuantity);
                System.out.println("Quantity updated successfully.");
            } else {
                System.out.println("Quantity must be greater than zero.");
            }

        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\n===== UPDATED SHOPPING CART =====");

        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i) +
                " - Quantity: " + quantity.get(i));
        }

        System.out.print("\nEnter product name to search: ");
        String searchProduct = sc.nextLine();

        if (cart.contains(searchProduct)) {
            System.out.println("Product exists in the cart.");
        } else {
            System.out.println("Product does not exist in the cart.");
        }

        int totalProducts = 0;

        for (int i = 0; i < quantity.size(); i++) {
            totalProducts = totalProducts + quantity.get(i);
        }

        System.out.println("\nTotal Different Products: " + cart.size());
        System.out.println("Total Product Quantity: " + totalProducts);

        System.out.print("\nDo you want to checkout? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {

            cart.clear();
            quantity.clear();

            System.out.println("Checkout completed successfully.");
            System.out.println("Shopping cart cleared.");

        } else {
            System.out.println("Checkout cancelled.");
        }

        System.out.println("\n===== FINAL CART =====");
        System.out.println("Total Products Remaining: " + cart.size());

        sc.close();
    }
}
