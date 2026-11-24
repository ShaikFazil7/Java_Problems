class Course
{
    String courseName;
    int duration;
    double fee;

    Course(String courseName, int duration, double fee)
    {
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourse()
    {
        System.out.println("the name of the course is:" + courseName);
        System.out.println("the time duration is:" + duration);
        System.out.println("the fee is:" + fee);
    }

}

public class D2T30 
{
    public static void main(String[] args)
    {
        Course c1 = new Course("Java", 5, 5000);
        Course c2 = new Course("python" , 4 , 4000);
        c1.displayCourse();
        c2.displayCourse();
    }    
}
