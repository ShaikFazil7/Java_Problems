import java.util.LinkedHashSet;
import java.util.Scanner;
public class D4T12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Integer> visitors = new LinkedHashSet<>();

        visitors.add(102);
        visitors.add(105);
        visitors.add(101);
        visitors.add(106);
        visitors.add(103);
        visitors.add(104);

        System.out.println("Visitors IDs : " + visitors);

        System.out.println("Enter the visitors IDs : ");
        int id = sc.nextInt();

        if(visitors.add(id))
        {
            System.out.println("Visitor added Successfully : ");
        }
        else
        {
            System.out.println("Visitors already Visited : ");
        }

        System.out.println("Remove the visitors ID : ");
        int removeid = sc.nextInt();

        if(visitors.remove(removeid))
        {
            System.out.println("Visitor is removed !");
        }
        else
        {
            System.out.println("Not Found ! ");
        }

        System.out.println("Enter the Visitors ID to Search : ");
        int visitorid=sc.nextInt();

        if(visitors.contains(visitorid))
        {
            System.out.println("Visitor visited successfully !");
        }
        else
        {
            System.out.println("Not visited");
        }

        System.out.println("Visited Arrival Order !");

        for(int visitor : visitors)
        {
            System.out.println(visitor);
        }


        System.out.println("Unique Visitors : " + visitors.size());


    }

}
