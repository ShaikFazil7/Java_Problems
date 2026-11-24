//Encapsulation//
class Student
{
    private String name="Fazil";
    private int rollno=100;
    public String getName()
    {
        System.out.println("Name is:"+name);
        return name;
    }
    public int getRollno()
    {
        System.out.println("Roll No is:"+rollno);
        return rollno; 
    }
}
class Main {
    public static void main(String[] args){
Student s=new Student();
s.getName();
s.getRollno();
    }
}
