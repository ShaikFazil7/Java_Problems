class inputValidator
{
    String userInput=" ";
}

public class D3T13 {
    public static void main(String[] args) {
        inputValidator iv =  new inputValidator();
        System.out.println("to check white spaces:" + iv.userInput.isBlank());

        if(iv.userInput.isBlank())
        {
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Valid input");
        }
    }
}
