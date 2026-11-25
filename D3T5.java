class UsernameValidator {

    String username = "Admin";
    String enteredUsername = "ADMIN";

}
public class D3T5
{
    public static void main(String[] args)
    {
        UsernameValidator us  = new UsernameValidator();

        if (us.username.equalsIgnoreCase(us.enteredUsername)) {

            System.out.println("Valid Username");

        } else {

            System.out.println("Invalid Username");

        }
    }
}