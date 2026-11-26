
import java.util.Scanner;

class D3T32 {

    String patientName;
    int age;
    String appointmentTime;
    String[] availableSlots = {
        "09:00 AM", "10:30 AM", "12:00 PM"
    };

    void bookAppointment() {

        Scanner sc = new Scanner(System.in);

        patientName = "Rahul";
        age = 25;
        appointmentTime = "10:30 AM";

        try {

            if (patientName == null) {
                throw new NullPointerException(
                    "Patient name is missing"
                );
            }

            System.out.println("Patient Name: " + patientName);
            System.out.println("Name Length: " + patientName.length());

            System.out.println("Patient Age: " + age);

            if (age <= 0) {
                throw new IllegalArgumentException(
                    "Age must be greater than zero"
                );
            }

            System.out.println("Appointment Time: " + appointmentTime);

            System.out.print("Enter appointment slot position: ");
            int position = sc.nextInt();

            System.out.println(
                "Selected Appointment Slot: " +
                availableSlots[position]
            );

            System.out.println("Appointment Booked Successfully");

        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "ArrayIndexOutOfBoundsException: Invalid appointment slot"
            );
        }
        finally {
            System.out.println(
                "Appointment Booking Process Completed"
            );
        }
    }

    public static void main(String[] args) {

        D3T32 appointment = new D3T32();

        appointment.bookAppointment();
    }
}
