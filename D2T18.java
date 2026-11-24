//Create a class named Car with two fields: brand (String) and year (int).

//Task: Write a no-argument constructor Car() that initializes brand = "Toyota" and year = 2024. Add a displayDetails() method to print both fields.
//Test: In a Main class, instantiate a Car object using new Car() and call displayDetails() to verify that default values are assigned automatically.

class Car
{
    String brand;
    int year;

    Car()
    {
        brand="Toyota";
        year=2024;
    }
    void displayDetails()
    {
        System.out.println("Car Brand:"+ brand);
        System.out.println("Car Year: " + year);
    }
}
public class D2T18 {
    public static void main(String[] args) {
        Car c=new Car();
        c.displayDetails();
    }
}
