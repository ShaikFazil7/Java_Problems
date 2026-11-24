//Create two interfaces: Printable with a method printDocument() and Scannable with a method scanDocument().
//Task: Create a single class named SmartPrinter that implements both interfaces (implements Printable, Scannable). Implement printDocument() to print "Printing document..." and scanDocument() to print "Scanning document...".
//Test: In a Main class, instantiate a SmartPrinter object and call both printDocument() and scanDocument().


interface Printable
{
    void printDocument();

}

interface Scannable
{
    void scanDocument();
}
class SmartPrinter implements Printable , Scannable
{
    public void printDocument()
    {
        System.out.println("Printing document...");

    }
    public void scanDocumnet()
    {
        System.out.println("Scanning document...");
    }
}
public class D2T15 {
    public static void main(String[] args) {
        SmartPrinter sp = new SmartPrinter();
        sp.printDocument();
        sp.scanDocumnet();
    }
}
