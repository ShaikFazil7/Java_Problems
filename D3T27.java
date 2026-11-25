class Manager
{

}
class developer
{

}
public class D3T27 {
    public static void main(String[] args)
    {
         Object obj = new developer();

        try {
            Manager m = (Manager) obj;
            System.out.println("Manager object created successfully");
        }
        catch (ClassCastException e) {
            System.out.println("Invalid Employee Role Conversion");
        }

        Object obj2 = new Manager();
        try {
            Manager m2 = (Manager) obj2;
            System.out.println("Manager object created successfully");
        }
        catch (ClassCastException e) {
            System.out.println("Invalid Employee Role Conversion");
        }
    }
}
