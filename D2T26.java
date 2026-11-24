interface Alert
{
   void sendAlert(String message);
}

class EmailAlert implements Alert
{
    @Override
   public void sendAlert(String message)
    {
        System.out.println("Email Alert: " + message);
    }
}

class MobileAlert implements Alert
{
    @Override
   public void sendAlert(String message)
    {
        System.out.println("Mobile Alert: " + message);
    }
}
public class D2T26 
{
    public static void main(String[] args)
    {
       Alert email = new EmailAlert();
        Alert mobile = new MobileAlert();
        email.sendAlert("Your Mail is Changed");
        mobile.sendAlert("Your mobile No. is Updated");
    }
}
