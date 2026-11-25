public class NumberFormat {
    public static void main(String[] args) {
        try {
        String value = "abc";
        int number = Integer.parseInt(value);
        System.out.println(number);
        } 
        catch (NumberFormatException e) {
            System.out.println("is out !");
        } finally {
System.out.println("Finally");
        }
    }
}
