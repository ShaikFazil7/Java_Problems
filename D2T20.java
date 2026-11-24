//Create a class named Employee with fields id (int), name (String), and department (String).

//Task: Write three overloaded constructors using this(...) to avoid duplicate assignment code:
//Employee(int id, String name) — calls this(id, name, "General") to set a default department.
//Employee(int id, String name, String department) — initializes all three fields.
//Add a displayEmployee() method to print all details.
//Test: Create one Employee with two arguments and another with three arguments, then call displayEmployee() on both.


class Employee {
    int id;
    String name;
    String department;

    Employee() {
        this(0, "Unknown", "General");
    }

    Employee(int id, String name) {
        this(id, name, "General");
    }

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println();
    }
}
public class D2T20 {
    public static void main(String[] args) {
        Employee e1 = new Employee(100,"Fazil");
        Employee e2 = new Employee(101,"mushu");
        e1.displayEmployee();
        e2.displayEmployee();
    }
}
