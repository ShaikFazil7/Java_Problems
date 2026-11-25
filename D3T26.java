public class D3T26 {

    void setSalary(double salary) {

        if (salary <= 0) {
            throw new IllegalArgumentException(
                "Salary must be greater than zero"
            );
        }
        else {
            System.out.println("Employee Salary: ₹" + salary);
        }
    }

    public static void main(String[] args) {

        D3T26 emp = new D3T26();

        try {
            emp.setSalary(25000);
            emp.setSalary(50000);
            emp.setSalary(0);
            emp.setSalary(-1000);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
