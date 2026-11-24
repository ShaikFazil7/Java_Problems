class Calculator
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    void add(float a,float b)
    {
        System.out.println(a+b);
    }
}
public class DAY2TASK {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(2.0f ,2.0f);
        cal.add(5, 5);
        cal.add(5, 5, 5);
       
    }
}
