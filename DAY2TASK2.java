class Printer
{
    void print(String Text)
    {
        System.out.println(Text);
    }
    void print(int number)
    {
        System.out.println(number);
    }
    void print(double decimal)
    {
        System.out.println(decimal);
    }
}
public class DAY2TASK2 
{
    public static void main(String[] args)
    {
        Printer p=new Printer();
        p.print("Hello");
        p.print(123);
        p.print(3.14);
    }
}
