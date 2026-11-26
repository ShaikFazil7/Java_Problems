import java.util.TreeMap;

public class D4T27 {
    public static void main(String[] args) {

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(105, "HR");
        employees.put(102, "IT");
        employees.put(103, "Finance");
        employees.put(101, "Marketing");
        employees.put(104, "Sales");

        System.out.println("Employee Records:");
        System.out.println(employees);

        employees.put(103, "IT");

        System.out.println("\nAfter Updating Department:");
        System.out.println(employees);

        int id = 102;

        if (employees.containsKey(id)) {
            System.out.println("\nEmployee " + id + " Department: "
                    + employees.get(id));
        } else {
            System.out.println("Employee not found.");
        }

        employees.remove(104);

        System.out.println("\nAfter Removing Employee:");
        System.out.println(employees);

        System.out.println("\nAscending Order:");
        System.out.println(employees);

        System.out.println("\nFirst Employee ID: " + employees.firstKey());
        System.out.println("Last Employee ID: " + employees.lastKey());

        System.out.println("\nDescending Order:");
        System.out.println(employees.descendingMap());

        System.out.println("\nEmployees Between 102 and 105:");
        System.out.println(employees.subMap(102, true, 105, true));
    }
}