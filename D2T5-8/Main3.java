class Payment{
   void pay(double amount)
   {
        System.out.println("Processing generic payment of ₹" + amount);
   }
}
class Creditcard extends Payment
{
    @Override
    void pay(double amount)
    {
        System.out.println("Payment done rupees " + amount + " with credit card");
    }
}
class UPI extends Payment
{
    @Override
    void pay(double amount)
    {
        System.out.println("Payment done rupees " + amount + " with UPI");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Payment p=new Payment();
        p.pay(1000);
        p=new Creditcard();
        p.pay(2000);
        p=new UPI();
        p.pay(3000);

    }
}
