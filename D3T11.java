class inputCleaner
{
    String username="  javaDeveloper  ";
} 

public class D3T11 {
    public static void main(String[] args) {
        inputCleaner ic = new inputCleaner();

        System.out.println("Triling:" + ic.username.trim());
        System.out.println("Original lenght:" + ic.username.length());

        String cleanedString = ic.username.trim();

        System.out.println("Cleaned length:"+ cleanedString.length());

         System.out.println("Cleaned username:"+ cleanedString);
    }
}
