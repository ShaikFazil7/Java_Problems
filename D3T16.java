class StudentDetails
{
    String details ="fazil,20,java,70";
}
public class D3T16 {
    public static void main(String[] args) 
    {
        StudentDetails sd = new StudentDetails();

        String[] student = sd.details.split(",");

        System.out.println("Name:" + student[0]);
        System.out.println("Age:" + student[1]);
        System.out.println("Course:" + student[2]);
        System.out.println("Marks:" + student[3]);
    }
}
