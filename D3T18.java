class EmailValidation
{
    String email="student@gmail.com";
}

public class D3T18
{
    public static void main(String[] args) {
        EmailValidation ev = new EmailValidation();
        System.out.println("whether the email is empty: " + ev.email.isEmpty());
        System.out.println("Whether the mail contain @ : " + ev.email.contains("@"));
        System.out.println("whether the mail ends with .com :" + ev.email.endsWith(".com"));
        System.out.println("email starts with name student or not : " + ev.email.startsWith("student"));
        if(ev.email.startsWith("student"))
        {
            System.out.println("valid Email");
        }
        else
        {
            System.out.println("Invalid email");
        }
    }    
}
