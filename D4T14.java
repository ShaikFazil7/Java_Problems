
import java.util.*;

public class D4T14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Double> employees = new HashMap<>();

        employees.put(101, 25000.0);
        employees.put(102, 30000.0);
        employees.put(103, 45000.0);
        employees.put(104, 35000.0);
        employees.put(105, 50000.0);

        System.out.println("Employee Salaries: " + employees);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees.put(id, salary);

        System.out.println("Employee added successfully.");

        System.out.print("\nEnter Employee ID to update: ");
        int updateId = sc.nextInt();

        if (employees.containsKey(updateId)) {

            System.out.print("Enter New Salary: ");
            double newSalary = sc.nextDouble();

            employees.replace(updateId, newSalary);

            System.out.println("Salary updated successfully.");

        } else {
            System.out.println("Employee not found.");
        }

        System.out.print(" Enter Employee ID to search: ");
        int searchId = sc.nextInt();

        if (employees.containsKey(searchId)) {
            System.out.println("Employee Salary: " + employees.get(searchId));
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println(" EMPLOYEE SALARY LIST ");

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Salary: " + entry.getValue());
        }

        double highest = Collections.max(employees.values());

        System.out.println("\nHighest Salary: " + highest);

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {
            if (entry.getValue() == highest) {
                System.out.println("Highest Paid Employee ID: " + entry.getKey());
            }
        }

        double total = 0;

        for (double s : employees.values()) {
            total += s;
        }

        System.out.println("Total Salary Expenditure: " + total);

    }
}
