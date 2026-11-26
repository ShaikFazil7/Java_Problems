
import java.util.HashSet;
import java.util.Scanner;

public class D4T7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> studentIds = new HashSet<>();

        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(104);
        studentIds.add(105);
        studentIds.add(106);
        studentIds.add(107);
        studentIds.add(108);
        studentIds.add(109);
        studentIds.add(110);

        System.out.println("===== STUDENT REGISTRATION LIST =====");

        for (Integer id : studentIds) {
            System.out.println(id);
        }

        System.out.print("\nEnter new student registration ID: ");
        int newId = sc.nextInt();

        if (studentIds.add(newId)) {
            System.out.println("Student registered successfully.");
        } else {
            System.out.println("Duplicate ID! Student already registered.");
        }

        System.out.print("\nEnter student ID to remove: ");
        int removeId = sc.nextInt();

        if (studentIds.remove(removeId)) {
            System.out.println("Student ID removed successfully.");
        } else {
            System.out.println("Student ID not found.");
        }

        System.out.print("\nEnter student ID to search: ");
        int searchId = sc.nextInt();

        if (studentIds.contains(searchId)) {
            System.out.println("Student ID exists in registration.");
        } else {
            System.out.println("Student ID does not exist.");
        }

        System.out.println("\n===== UPDATED REGISTRATION LIST =====");

        for (Integer id : studentIds) {
            System.out.println(id);
        }

        System.out.println("\nTotal Unique Registrations: "
                           + studentIds.size());

    }
}
