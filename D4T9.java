
import java.util.*;

public class D4T9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> employees = new TreeSet<>();

        employees.add(105);
        employees.add(101);
        employees.add(103);
        employees.add(102);
        employees.add(104);

        System.out.println("Employee IDs: " + employees);

        System.out.print("Enter employee ID to add: ");
        int id = sc.nextInt();
        employees.add(id);

        System.out.print("Enter employee ID to remove: ");
        int removeId = sc.nextInt();
        employees.remove(removeId);

        System.out.println("Smallest ID: " + employees.first());
        System.out.println("Largest ID: " + employees.last());

        System.out.print("Enter an ID to find higher and lower: ");
        int searchId = sc.nextInt();

        System.out.println("Higher ID: " + employees.higher(searchId));
        System.out.println("Lower ID: " + employees.lower(searchId));

        System.out.print("Enter starting ID: ");
        int start = sc.nextInt();

        System.out.print("Enter ending ID: ");
        int end = sc.nextInt();

        System.out.println("IDs in range: " + employees.subSet(start, true, end, true));

        System.out.println("IDs below " + end + ": " + employees.headSet(end));

        System.out.println("IDs from " + start + ": " + employees.tailSet(start));

        System.out.println("Final Employee IDs: " + employees);

    }
}
