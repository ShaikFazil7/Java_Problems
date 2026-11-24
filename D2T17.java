//Create a class named Student with fields name (String) and marks (double).

//Task: Write a parameterized constructor Student(String name, double marks) that uses the this keyword to assign the passed arguments to the instance variables. Add a showResult() method to print the student's name and marks.
//Test: In a Main class, create two Student objects with different names and marks, and call showResult() on each.

class Student
{
    String name;
    double marks;
    Student(String name, double marks)
    {
        this.name=name;
        this.marks=marks;
    }
    void showResult()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }
}

public class D2T17 {
    public static void main(String[] args) {
         Student s1 = new Student("Fazil", 85.5);
         Student s2 = new Student("mushu", 92.0);

        s1.showResult();
        s2.showResult();
    }
}
