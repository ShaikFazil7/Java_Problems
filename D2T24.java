abstract class Delivery
{
    public void acceptOrder()
    {
        System.err.println("Delivery order accepted");
    }
    abstract void deliverProduct();
}

class FoodDelivery extends Delivery
{
    void deliverProduct()
    {
        System.err.println("Food order delivered to customer");
    }
}

class ParcelDelivery extends Delivery
{
    void deliverProduct()
    {
        System.err.println("Parcel delivered successfully");
    }
}


public class D2T24 
{
    public static void main(String[] args) {
        FoodDelivery fd = new FoodDelivery();
        ParcelDelivery pd = new ParcelDelivery();
        fd.acceptOrder();
        pd.acceptOrder();
        fd.deliverProduct();
        pd.deliverProduct();
    }
}
