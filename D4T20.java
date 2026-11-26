import java.util.LinkedHashMap;
import java.util.Scanner;

public class D4T20 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> products = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        products.put("Mobile", 10);
        products.put("Laptop", 15);
        products.put("Drums", 5);
        products.put("Earbuds", 20);
        products.put("Gadgets", 12);
        products.put("Bags", 8);

        products.put("Mobile", 15);

        System.out.println("Daily Sales Report:");

        for (String product : products.keySet()) {
            System.out.println(product + " : " + products.get(product));
        }

        int total = 0;

        for (int quantity : products.values()) {
            total = total + quantity;
        }

        System.out.println("\nTotal Quantity Sold: " + total);

        String highestProduct = "";
        int highest = 0;

        for (String product : products.keySet()) {
            if (products.get(product) > highest) {
                highest = products.get(product);
                highestProduct = product;
            }
        }

        System.out.println("Highest Sales: "
                + highestProduct + " = " + highest);

    }
}