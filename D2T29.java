class Mobile
{
    String brand;
    double price;
     Mobile()
    {
        brand="Samsung";
        price=25000;
    }

    void displayDetails()
    {
        System.out.println("the brand name is:" + brand);
        System.out.println("the price  is:" + price);
    }

}

public class D2T29 
{
    public static void main(String[] args)
    {
        Mobile m = new Mobile();
        m.displayDetails();
    }    
}
