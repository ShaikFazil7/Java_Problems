import java.util.HashMap;
import java.util.Scanner;

public class D4T16 {

    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("PHONE CONTACT DIRECTORY");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Check Phone Number");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter contact name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    if (contacts.containsKey(name)) {
                        System.out.println("Contact already exists.");
                    } else {
                        contacts.put(name, phone);
                        System.out.println("Contact added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter contact name to update: ");
                    String updateName = sc.nextLine();

                    if (contacts.containsKey(updateName)) {
                        System.out.print("Enter new phone number: ");
                        String newPhone = sc.nextLine();

                        contacts.put(updateName, newPhone);
                        System.out.println("Phone number updated successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter contact name to search: ");
                    String searchName = sc.nextLine();

                    if (contacts.containsKey(searchName)) {
                        System.out.println("Contact Name: " + searchName);
                        System.out.println("Phone Number: "
                                + contacts.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter contact name to delete: ");
                    String deleteName = sc.nextLine();

                    if (contacts.containsKey(deleteName)) {
                        contacts.remove(deleteName);
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:
                    if (contacts.isEmpty()) {
                        System.out.println("Contact directory is empty.");
                    } else {
                        System.out.println(" ALL CONTACTS");

                        for (String contactName : contacts.keySet()) {
                            System.out.println(contactName + " : "
                                    + contacts.get(contactName));
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter phone number to check: ");
                    String checkPhone = sc.nextLine();

                    if (contacts.containsValue(checkPhone)) {
                        System.out.println("Phone number is already saved.");
                    } else {
                        System.out.println("Phone number is not saved.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting Phone Contact Directory...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);
    }
}