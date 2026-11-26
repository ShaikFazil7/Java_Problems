import java.util.TreeMap;
import java.util.Scanner;

public class D4T17 {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println(" SORTED STUDENT DATABASE");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student Name");
            System.out.println("3. Remove Student");
            System.out.println("4. Display Records in Ascending Order");
            System.out.println("5. Display Records in Descending Order");
            System.out.println("6. Display First and Last Roll Number");
            System.out.println("7. Display Records Within Roll Number Range");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student roll number: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    students.put(rollNo, name);

                    System.out.println("Student record added successfully.");
                    break;

                case 2:
                    System.out.print("Enter roll number to update: ");
                    int updateRoll = sc.nextInt();
                    sc.nextLine();

                    if (students.containsKey(updateRoll)) {
                        System.out.print("Enter new student name: ");
                        String newName = sc.nextLine();

                        students.put(updateRoll, newName);

                        System.out.println("Student name updated successfully.");
                    } else {
                        System.out.println("Student record not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter roll number to remove: ");
                    int removeRoll = sc.nextInt();

                    if (students.containsKey(removeRoll)) {
                        students.remove(removeRoll);

                        System.out.println("Student record removed successfully.");
                    } else {
                        System.out.println("Student record not found.");
                    }
                    break;

                case 4:
                    if (students.isEmpty()) {
                        System.out.println("Student database is empty.");
                    } else {
                        System.out.println("\n----- ASCENDING ORDER -----");

                        for (Integer roll : students.keySet()) {
                            System.out.println(roll + " : "
                                    + students.get(roll));
                        }
                    }
                    break;

                case 5:
                    if (students.isEmpty()) {
                        System.out.println("Student database is empty.");
                    } else {
                        System.out.println("\n----- DESCENDING ORDER -----");

                        for (Integer roll : students.descendingKeySet()) {
                            System.out.println(roll + " : "
                                    + students.get(roll));
                        }
                    }
                    break;

                case 6:
                    if (students.isEmpty()) {
                        System.out.println("Student database is empty.");
                    } else {
                        System.out.println("First Roll Number: "
                                + students.firstKey());

                        System.out.println("Last Roll Number: "
                                + students.lastKey());
                    }
                    break;

                case 7:
                    if (students.isEmpty()) {
                        System.out.println("Student database is empty.");
                    } else {
                        System.out.print("Enter starting roll number: ");
                        int startRoll = sc.nextInt();

                        System.out.print("Enter ending roll number: ");
                        int endRoll = sc.nextInt();

                        System.out.println("\n----- RECORDS WITHIN RANGE -----");

                        TreeMap<Integer, String> range =
                                new TreeMap<>(students.subMap(
                                        startRoll,
                                        true,
                                        endRoll,
                                        true
                                ));

                        if (range.isEmpty()) {
                            System.out.println("No records found in this range.");
                        } else {
                            for (Integer roll : range.keySet()) {
                                System.out.println(roll + " : "
                                        + range.get(roll));
                            }
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting Student Database...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);

    }
}