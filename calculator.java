import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Num:");
        int a=sc.nextInt();
        System.out.println("Enter Sec Num:");
        int b=sc.nextInt();
        System.out.println("Enter Your choice:");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
