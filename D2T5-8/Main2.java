class Employee
{
    double basesalary;

    double calculateSalary()
    {
        return basesalary;
    }
}
class SalesEmployee extends Employee
{
    
    double bonus;
    @Override

    double calculateSalary()
    {
        return basesalary + bonus;
    }
}
public class Main2 {
    public static void  main(String[] args)
    {
        Employee e = new Employee();
        e.basesalary = 50000;
        System.out.println("Employee Salary: " + e.calculateSalary());
        SalesEmployee s = new SalesEmployee();
        s.basesalary = 50000;
        s.bonus = 10000;
        System.out.println("Sales Employee Salary: " + s.calculateSalary());
    }
}
