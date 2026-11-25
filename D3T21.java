public class D3T21
{
    double balance = 1000;
    double withdrawalAmount = 0;

    void withdraw(double amount)
    {
        withdrawalAmount=amount;
        try {
            int time = (int) balance / (int) withdrawalAmount ;
            System.out.println("WithdrawalAmount : " + withdrawalAmount);
            System.out.println("No. of times : " + time);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Invalid WithdrawalAmount ! ");
        }
    }
    public static void main(String[] args) {

        D3T21 ATM = new D3T21();

        ATM.withdraw(1000);
        ATM.withdraw(500);
        ATM.withdraw(0);        
    }
}