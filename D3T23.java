import java.util.Scanner;
public class D3T23 {
    String PassangerName;

    D3T23()
    {
        PassangerName = "fazil";
    }

    void character(int position)
    {
       try {
           System.out.println("position of the char : " + PassangerName.charAt(position));
       }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid char position");
       }
    }

    public static void main(String[] args) {
        D3T23 TicketBooking = new D3T23();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a charater position : ");

        int position =sc.nextInt();

        TicketBooking.character(position);
    }
}
