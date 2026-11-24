package DAY1HOMEWORK;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0, sum = 0, digit;

        while (temp > 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (n == rev)
            System.out.println("it is a Palindrome");
        else
            System.out.println("it is not a Palindrome");

        if (n == sum)
            System.out.println("it is an Armstrong number");
        else
            System.out.println("it is not an Armstrong number");

        sc.close();
       }
}
