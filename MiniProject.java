
import java.util.Scanner;

class Student {

    private int studentId;
    private String name;
    private String department;
    private int[] marks = new int[3];

    Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    void enterMarks(Scanner sc) {

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Subject " + (i + 1) + " Marks: ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                i--;
            }
        }
    }

    int calculateTotal() {

        int total = 0;

        for (int i = 0; i < 3; i++) {
            total = total + marks[i];
        }

        return total;
    }

    double calculateAverage() {

        return calculateTotal() / 3.0;
    }

    String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90)
            return "A+";
        else if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 60)
            return "C";
        else if (average >= 50)
            return "D";
        else
            return "Fail";
    }

    String calculateResult() {

        for (int i = 0; i < 3; i++) {

            if (marks[i] < 35) {
                return "FAIL";
            }
        }

        return "PASS";
    }

    void displayStudent() {

        System.out.println("\n===== STUDENT REPORT =====");

        System.out.println("Student ID   : " + studentId);
        System.out.println("Name         : " + name);
        System.out.println("Department   : " + department);

        System.out.println("Subject 1    : " + marks[0]);
        System.out.println("Subject 2    : " + marks[1]);
        System.out.println("Subject 3    : " + marks[2]);

        System.out.println("Total Marks  : " + calculateTotal());
        System.out.println("Average      : " + calculateAverage());
        System.out.println("Grade        : " + calculateGrade());
        System.out.println("Result       : " + calculateResult());
    }
}

public class MiniProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Student s = new Student(id, name, department);

        System.out.println("\nEnter Student Marks:");

        s.enterMarks(sc);

        s.displayStudent();

        sc.close();
    }
}
