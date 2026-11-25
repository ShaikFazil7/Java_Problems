public class D3T1 {
    public static void main(String[] args) {
        //1
        String Name="fazil";
        System.out.println("the length is:"+ Name.length());
        //2
        System.out.println("Uppercase:" + Name.toUpperCase());
        String Place = "FAZIL";
        System.out.println("LowerCAse:" +Place.toLowerCase());
        //3
        String Age = "Young";
        System.out.println("Count of String:" +Age.length());
        //4
        String Character ="Programming";
        for(int i=0; i<Character.length();i++)
        {
            System.out.println(Character.charAt(i));
        }
        //5

        String s1="Mushu";
        String s2="fazil";
        System.out.println("String Equals :" + s1.equals(s2));


        
    }
}
