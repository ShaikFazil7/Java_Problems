abstract class Animal
{
    abstract void makeSound();
        void sleep()
        {
            System.out.println("Animal is sleeping");
        }
    
}
class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Dog barrks:Woof Woof!");
    }
}
public class D2T9 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
    }
}
