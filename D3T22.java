public class D3T22 
{
    String Studentname;

    D3T22()
    {
        String StudentName = null;
    }
    void displayname(String name)
    {
        Studentname = name;
        try {
            System.out.println("Student Name :" + Studentname);
            System.out.println("length: " + Studentname.length());
        } catch (NullPointerException e) {
            System.out.println("Student name is not available");
        }
    }

    public static void main(String[] args) {
        D3T22 studentProfile = new D3T22();

        studentProfile.displayname("null");
        studentProfile.displayname("Fazil");
    }
}
