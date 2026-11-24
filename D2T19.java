//Create a class named Rectangle with fields length (double) and width (double).

//Task: Write three overloaded constructors:
//Rectangle() — sets length = 1.0 and width = 1.0.
//Rectangle(double side) — sets both length and width to side (for a square).
//Rectangle(double length, double width) — sets length and width to the given values.
//Add a calculateArea() method that prints "Area: " + (length * width).
//Test: Instantiate three Rectangle objects using all three constructors and call calculateArea() on each.

class Rectangle
{
    double length , width;
    
    Rectangle()
    {
        length=1.0;
        width=1.0;
    }

    Rectangle(double side)
    {
        length = side;
        width = side;
    }
    
    Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }
}

public class D2T19 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(5.0);

        Rectangle r3 = new Rectangle(4.0, 6.0);

        r1.calculateArea();
        r2.calculateArea();
        r3.calculateArea();
    }
}
