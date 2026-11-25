class MessageBuilder
{
    String firstname = "java";
    String lastname = "Developer";
}

public class D3T17 
{
    public static void main(String[] args) {
        MessageBuilder mb = new MessageBuilder();
        System.out.println("to combines:" + mb.firstname.concat(" ").concat(mb.lastname));
        String Combined =mb.firstname.concat(" ").concat(mb.lastname);
        System.out.println("Welcome , " + Combined);
    }    
}
