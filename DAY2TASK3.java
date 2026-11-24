class Bank
{
    double getInterestRate()
    {
        return 0.0;
    }
}
class SBI extends Bank
{
@Override
    double getInterestRate()
    {
        return 6.5;
    }
}
class HDFC extends SBI
{
@Override
   double getInterestRate()
    {
        return 7.0;
    }
}

public class DAY2TASK3 {
    public static void main(String[] args)
    {
        Bank b=new Bank();
        b=new SBI();
        System.out.println(b.getInterestRate());
        b=new HDFC();
        System.out.println(b.getInterestRate());
    }
}




