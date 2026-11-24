abstract class BankAccount
{
    abstract double calculateInterest();

    void displayAccountType()
    {
        System.out.println("Bank Account Details");
    }
}
class SavingsAccount extends BankAccount
{
    double balance;
    @Override 
    double calculateInterest()
    {
        return balance * 0.05;
    }
}

public class D2T22 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.balance=500;
        sa.displayAccountType();
        System.out.println("the calculated interest is:" + sa.calculateInterest());
    }
}
