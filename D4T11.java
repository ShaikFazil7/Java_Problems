
import java.util.*;

public class D4T11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> contacts = new LinkedHashSet<>();

        contacts.add("moin");
        contacts.add("Fazil");
        contacts.add("Arun");
        contacts.add("padma");
        contacts.add("mushu");

        System.out.println("Contact List: " + contacts);

        System.out.print("Enter contact to add: ");
        String name = sc.nextLine();

        if (contacts.add(name))
            System.out.println("Contact added successfully.");
        else
            System.out.println("Duplicate contact!");

        System.out.print("Enter contact to remove: ");
        String remove = sc.nextLine();

        if (contacts.remove(remove))
            System.out.println("Contact removed successfully.");
        else
            System.out.println("Contact not found.");

        System.out.print("Enter contact to search: ");
        String search = sc.nextLine();

        if (contacts.contains(search))
            System.out.println("Contact found.");
        else
            System.out.println("Contact not found.");

        System.out.println("Final Contact List:");

        for (String contact : contacts) {
            System.out.println(contact);
        }

    }
}
