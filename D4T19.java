import java.util.LinkedHashMap;

public class D4T19 {
    public static void main(String[] args)
    { 
        LinkedHashMap<Integer, String> values = new LinkedHashMap<>();
        
        values.put(101 , "fazil");
        values.put(102 , "moin");
        values.put(103 , "muzzu");
        values.put(104 , "arshil");

        values.put(103, "Muzzammil");

        System.out.println("Orders : " + values.get(101));

        if(values.containsKey(103))
        {
            System.out.println("This Order is Available ! ");
        }

        values.remove(101);

        System.out.println("all orders!");

        System.out.println(values);

    }
}
