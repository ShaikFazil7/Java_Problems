
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D4T6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> prices = new ArrayList<>();

        prices.add(45000.0);
        prices.add(15000.0);
        prices.add(25000.0);
        prices.add(5000.0);
        prices.add(35000.0);
        prices.add(12000.0);
        prices.add(55000.0);
        prices.add(8000.0);
        prices.add(30000.0);
        prices.add(20000.0);

        System.out.println("===== PRODUCT PRICE LIST =====");

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(i + ". " + prices.get(i));
        }

        System.out.print("\nEnter index to update price: ");
        int index = sc.nextInt();

        if (index >= 0 && index < prices.size()) {

            System.out.print("Enter new price: ");
            double newPrice = sc.nextDouble();

            prices.set(index, newPrice);

            System.out.println("Price updated successfully.");

        } else {
            System.out.println("Invalid index.");
        }

        System.out.println("\n===== UPDATED PRICE LIST =====");

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }

        double highest = Collections.max(prices);

        System.out.println("\nHighest Price: " + highest);

        double lowest = Collections.min(prices);

        System.out.println("Lowest Price: " + lowest);

        double total = 0;

        for (int i = 0; i < prices.size(); i++) {
            total = total + prices.get(i);
        }

        double average = total / prices.size();

        System.out.println("Average Price: " + average);

        Collections.sort(prices);

        System.out.println("\n===== SORTED PRICE LIST =====");

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }

        System.out.print("\nEnter minimum price: ");
        double minRange = sc.nextDouble();

        System.out.print("Enter maximum price: ");
        double maxRange = sc.nextDouble();

        System.out.println("\n===== PRICES WITHIN RANGE =====");

        boolean found = false;

        for (int i = 0; i < prices.size(); i++) {

            if (prices.get(i) >= minRange &&
                prices.get(i) <= maxRange) {

                System.out.println(prices.get(i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No prices found in this range.");
        }

    }
}
