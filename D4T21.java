import java.util.ArrayList;
import java.util.Collections;
public class D4T21 
{
    public static void main(String[] args)
    {
        ArrayList<String> stores = new ArrayList<>();

        stores.add("Java Programming");
        stores.add("Data Structures");
        stores.add("C++ Knowledge");
        stores.add("C Language");
        stores.add("HTML learns");
        System.out.println("The BookS Titles are : " + stores);

        stores.add("React Basis");

        System.out.println("\n Added one book :" + stores);

        stores.remove("C Language");
        System.out.println("\n After removing the Books!");
        System.out.println(stores);


        int index = stores.indexOf("Java Programming");

        if (index != -1) {
            stores.set(index, "Advanced Java Programming");
        }

        System.out.println("\n" +stores);

        String searchbook = "Data Structures";

        if(stores.contains("Data Structures"))
        {
            System.out.println("The book is available");
        }
        else
        {
            System.out.println("The stock is over");
            
        }


        System.out.println("\nAll Available Books:");

        for (String book : stores) {
            System.out.println(book);
        }

        System.out.println("\n displaying total no.of books : " + stores.size());

        Collections.reverse(stores);

        for(String Book : stores)
        {
            System.out.println(Book);
        }



    }    
}
