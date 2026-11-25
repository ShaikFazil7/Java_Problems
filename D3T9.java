class NameExtract
{
    String fullName="java full stack developer";
}
public class D3T9 {
 public static void main(String[] args) {
     NameExtract ne = new NameExtract();
     System.out.println("1st word: " + ne.fullName.substring(0, 4));
     System.out.println("2nd word: " + ne.fullName.substring(5, 9));
     System.out.println("remaining : " + ne.fullName.substring(10));

 }   
}
