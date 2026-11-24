class Rectangle
{
    private double Length;
    private double Width;
    public void getter()
    {

    }
    public void setter(double length,double width)
    {
        Length=length;
        Width=width;
    }
}
class Main2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setter(10.5, 5.2);
        r.getter();
        }
}
