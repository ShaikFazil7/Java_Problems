import java.util.InputMismatchException;
import java.util.Scanner;
public class D3T28 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
        System.out.println("Enter MArks for three subjects :");
        int subject1 =sc.nextInt();
        int subject2 =sc.nextInt();
        int subject3 =sc.nextInt();
        int total = subject1 + subject2 + subject3 ;
        double average = total / 3 ;
        System.out.println("Total Marks : " + total);
        System.out.println("Average MArks : " + average);
        }
        catch(InputMismatchException e)
        {
            System.out.println("please enter numeric marks only !");
        }
    }
}
