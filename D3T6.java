class EmailChecker
{
    String email="student@gmail.com";
}
public class D3T6 {
    public static void main(String[] args) {
        EmailChecker ec =new EmailChecker();
        if(ec.email.contains("@"))
        {
            System.out.println("@ is present");
        }
        else{
            System.out.println("@ is not");
        }

        if(ec.email.contains("gmail"))
        {
            System.out.println("Email contains gmail");
        }
        else{
            System.out.println("Email not contain gmail");
        }
    }
}
