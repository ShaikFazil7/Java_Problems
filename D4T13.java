
import java.util.*;

public class D4T13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Rahul", 85);
        students.put("Fazil", 90);
        students.put("Arun", 75);
        students.put("Kiran", 80);
        students.put("Priya", 95);

        System.out.println("Student Marks: " + students);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        students.put(name, marks);
        System.out.println("Student record added successfully.");

        System.out.print("\nEnter student name to update: ");
        String updateName = sc.nextLine();

        if (students.containsKey(updateName)) {
            System.out.print("Enter new marks: ");
            int newMarks = sc.nextInt();
            sc.nextLine();

            students.put(updateName, newMarks);
            System.out.println("Marks updated successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();

        if (students.containsKey(searchName))
            System.out.println("Marks: " + students.get(searchName));
        else
            System.out.println("Student not found.");
        System.out.print("\nEnter student name to remove: ");
        String removeName = sc.nextLine();

        if (students.containsKey(removeName)) {
            students.remove(removeName);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("STUDENT MARKS LIST");

        for (String student : students.keySet()) {
            System.out.println(student + " : " + students.get(student));
        }

        int total = 0;

        for (int m : students.values()) {
            total += m;
        }

        if (!students.isEmpty()) {
            double average = (double) total / students.size();
            System.out.println("Average Marks: " + average);
        } else {
            System.out.println("No student records available.");
        }

    }
}
