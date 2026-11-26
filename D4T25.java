import java.util.LinkedHashSet;

public class D4T25 {
    public static void main(String[] args) {

        LinkedHashSet<String> products = new LinkedHashSet<>();

        products.add("Mobile");
        products.add("Laptop");
        products.add("Headphones");
        products.add("Smart Watch");
        products.add("Keyboard");

        products.add("Mouse");

        products.add("Laptop");

        System.out.println("Recently Viewed Products:");
        System.out.println(products);

        if (products.contains("Headphones")) {
            System.out.println("\nHeadphones was viewed.");
        } else {
            System.out.println("\nHeadphones was not viewed.");
        }

        products.remove("Keyboard");

        System.out.println("\nAfter removing Keyboard:");
        System.out.println(products);

        System.out.println("\nTotal Unique Products Viewed: "
                + products.size());
    }
}