
import java.util.ArrayList;
import java.util.Scanner;

public class D4T3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Rahul");
        employees.add("Fazil");
        employees.add("Arun");
        employees.add("Kiran");
        employees.add("Suresh");

        System.out.println(" EMPLOYEE ATTENDANCE LIST ");

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.print("Enter new employee name to add: ");
        String newEmployee = sc.nextLine();

        employees.add(newEmployee);

        System.out.println("Employee added successfully.");

        System.out.print("Enter employee name to remove: ");
        String removeEmployee = sc.nextLine();

        if (employees.remove(removeEmployee)) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println(" UPDATED ATTENDANCE LIST ");

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.print(" Enter employee name to search: ");
        String searchEmployee = sc.nextLine();

        if (employees.contains(searchEmployee)) {
            System.out.println("Employee is PRESENT.");
        } else {
            System.out.println("Employee is ABSENT.");
        }

        System.out.println("Total Present Employees: " + employees.size());

        System.out.println("REVERSE ATTENDANCE LIST");

        for (int i = employees.size() - 1; i >= 0; i--) {
            System.out.println(employees.get(i));
        }
    }
}
