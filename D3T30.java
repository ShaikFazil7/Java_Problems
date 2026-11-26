import java.util.Scanner;
class D3T30
{ 
    String studentName;
    int age;
    String marks;
    String[] subjects;

    void Studentdetails()
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the Student Name:");
            String studentname =sc.nextLine();

            if(studentName==null)
            {
                throw new NullPointerException("Student name cannot be Null ! Enter valid name 🤩 ");
            }

            System.out.println("Enter Age :");
            int age = sc.nextInt();

            if(age==0)
            {
                throw new NumberFormatException("Age should not be Zero !");
            }

            System.out.println("Enter the Marks :");
            String marks =sc.nextLine();

            int Mark = Integer.parseInt(marks);
            System.out.println( "Marks" + Mark);

            System.out.println("Enter the subjects : ");
            String subject = sc.nextLine();

        for (int i = 0; i < n; i++) {
                System.out.print("Enter subject " + (i + 1) + ": ");
                subjects[i] = sc.nextLine();
            }
            System.out.print("Enter subject position: ");
            int position = Integer.parseInt(sc.nextLine());

            System.out.println("Selected Subject: " +
                               subjects[position]);

            System.out.println("Student Registration Completed");

        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number entered");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid subject position");
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        D3T30 student = new D3T30();
        student.Studentdetails();
    }

    }