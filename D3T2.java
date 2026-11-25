class Fazil
{
     String name = "Shaik Fazil";
}

public class D3T2 {
    public static void main(String[] args) {
        Fazil f = new Fazil();
        System.out.println("Total Characters:" + f.name.length());
        System.out.println("First Character:" + f.name.charAt(0));
        System.out.println("Fifth character:" + f.name.charAt(4));
        System.out.println("Last Character:" + f.name.charAt(f.name.length()-1));
    }
}
