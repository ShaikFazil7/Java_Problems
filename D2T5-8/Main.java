
class UserRegistration
{
    void register(String name, int userId)
    {
       System.out.println("User registerd name is: " + name + "and userID is:" +userId); 
    }
    void register(int userId, String name)
    {
        System.out.println("User registerd userID is: " + userId + "and name is:" +name);
    }

}

public class Main {
    public static void main(String[] args)
    {
        UserRegistration ur=new UserRegistration();
        ur.register("Fazil", 100);
        ur.register(100, "Fazil");
    }
}
