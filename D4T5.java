import java.util.LinkedList;
import java.util.Scanner;

public class D4T5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> history = new LinkedList<>();

        history.add("www.google.com");
        history.add("www.youtube.com");
        history.add("www.facebook.com");
        history.add("www.instagram.com");
        history.add("www.wikipedia.org");

        System.out.println("===== BROWSER HISTORY =====");

        for (String website : history) {
            System.out.println(website);
        }

        System.out.print("\nEnter newly visited website: ");
        String newWebsite = sc.nextLine();

        history.add(newWebsite);

        System.out.println("Website added to history.");

        System.out.println("\n===== UPDATED BROWSER HISTORY =====");

        for (String website : history) {
            System.out.println(website);
        }

        System.out.println("\nRemoved Most Recently Visited Website: "
                           + history.removeLast());

        if (!history.isEmpty()) {
            System.out.println("\nFirst Visited Website: "
                               + history.getFirst());

            System.out.println("Last Visited Website: "
                               + history.getLast());
        }

        System.out.print("\nEnter website to search: ");
        String searchWebsite = sc.nextLine();

        if (history.contains(searchWebsite)) {
            System.out.println("Website was visited.");
        } else {
            System.out.println("Website was not visited.");
        }

        System.out.println("\n===== CURRENT BROWSER HISTORY =====");

        for (String website : history) {
            System.out.println(website);
        }

        System.out.print("\nDo you want to clear browser history? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {

            history.clear();

            System.out.println("Browser history cleared successfully.");

        } else {
            System.out.println("Browser history not cleared.");
        }

        System.out.println("\n===== FINAL BROWSER HISTORY =====");

        if (history.isEmpty()) {
            System.out.println("No browsing history available.");
        } else {
            for (String website : history) {
                System.out.println(website);
            }
        }

    }
}
