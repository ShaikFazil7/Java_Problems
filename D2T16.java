//Create an interface named RemoteControl with an abstract method turnOn() and a default method batteryStatus() that prints "Remote battery is 100%".
//Task: Create two classes implementing RemoteControl:
//TV implementing turnOn() to print "TV is turned ON".
//AC implementing turnOn() to print "AC is turned ON".
//Test: In a Main class, create RemoteControl r1 = new TV(); and RemoteControl r2 = new AC();. Call turnOn() and batteryStatus() on both references.

interface RemoteControl
{
    void turnOn();

default void batteryStatus()
{
    System.out.println("Remote battery is 100%");
}
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }
}

class AC implements RemoteControl {
    public void turnOn() {
        System.out.println("AC is turned ON");
    }
}


public class D2T16
{
    public static void main(String[] args) {
        RemoteControl r1 = new TV();
        RemoteControl r2 = new AC();
        r1.turnOn();
        r2.turnOn();
        r1.batteryStatus();
        r2.batteryStatus();
    }
}
