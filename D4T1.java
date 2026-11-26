
import java.util.ArrayList;
import java.util.Scanner;

public class D4T1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Fazil");
        students.add("Arun");
        students.add("Kiran");
        students.add("Suresh");
        students.add("Ravi");
        students.add("Priya");
        students.add("Sneha");
        students.add("Manoj");
        students.add("Anil");

        System.out.println("===== STUDENT NAME LIST =====");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ". " + students.get(i));
        }

        System.out.print("\nEnter position to add a student: ");
        int position = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new student name: ");
        String newName = sc.nextLine();

        if (position >= 0 && position <= students.size()) {
            students.add(position, newName);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Invalid position.");
        }

        System.out.print("\nEnter student name to remove: ");
        String removeName = sc.nextLine();

        if (students.remove(removeName)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.print("\nEnter index to update student name: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 0 && index < students.size()) {

            System.out.print("Enter new student name: ");
            String updatedName = sc.nextLine();

            students.set(index, updatedName);

            System.out.println("Student name updated successfully.");

        } else {
            System.out.println("Invalid index.");
        }

        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();

        if (students.contains(searchName)) {
            System.out.println("Student found in the list.");
        } else {
            System.out.println("Student not found in the list.");
        }

        System.out.println("\nTotal Number of Students: " + students.size());

        System.out.println("\n===== FINAL STUDENT LIST =====");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ". " + students.get(i));
        }

        sc.close();
    }
}
