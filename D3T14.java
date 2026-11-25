class Websitevalidator
{
    String url ="https://www.google.com";
}
public class D3T14 {
    public static void main(String[] args) {
        Websitevalidator wv = new Websitevalidator();
        System.out.println("to check the URl:" + wv.url.startsWith("https://"));
        if(wv.url.startsWith("https://"))
        {
            System.out.println("Secure Website URl");
        }
        else
        {
            System.out.println("Invalid Wesite protocol");
        }
    }
}
