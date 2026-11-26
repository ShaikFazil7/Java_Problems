
import java.util.*;

public class D4T8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> products = new HashSet<>();

        products.add("Laptop");
        products.add("Mobile");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Headphones");

        System.out.println("Product Inventory: " + products);

        System.out.print("Enter product to add: ");
        String p = sc.nextLine();

        if (products.add(p))
            System.out.println("Product added.");
        else
            System.out.println("Duplicate product.");

        System.out.print("Enter product to remove: ");
        String r = sc.nextLine();

        if (products.remove(r))
            System.out.println("Product removed.");
        else
            System.out.println("Product not found.");

        System.out.print("Enter product to search: ");
        String s = sc.nextLine();

        if (products.contains(s))
            System.out.println("Product exists.");
        else
            System.out.println("Product not found.");

        System.out.println("Final Products: " + products);

        System.out.println("Total Unique Products: " + products.size());

    }
}
