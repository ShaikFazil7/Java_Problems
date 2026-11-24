//using getter and setter methods to access the private variables of a class//
class car
{
    private int speed=100;
    public void getter()
    {
        System.out.println(speed);
    }
    public void setter(int Speed)
    {
        speed=Speed;
    }
}
class Encapsulation
{
    public static void main(String[] args)
    {
        car c=new car();
        c.getter();
        c.setter(1000);
        c.getter();
    }
}