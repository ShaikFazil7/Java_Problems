import java.util.Scanner;
public class D3T29 
{
    int balance = 10000;

    void withdraw(String amount)

    {
        try
        {
            int withdrawAmount=Integer.parseInt(amount);

            if(withdrawAmount <= 0)
            {
                throw new IllegalArgumentException(
                    "amount is greater than Zero"
                );
            }

            if(withdrawAmount > balance)
            {
                throw new IllegalArgumentException(
                    "insufficient balance"
                );
            }

            balance = balance - withdrawAmount;

            System.out.println("Transaction Successfull!");
            System.out.println("the balance : " + balance);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid amount!");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args)
    {
        D3T29 BankTransaction = new D3T29();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter withdraw amount");
        String amount=sc.nextLine();
        BankTransaction.withdraw(amount);
    }
}
