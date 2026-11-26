import java.util.HashSet;

public class D4T23 {
    public static void main(String[] args) {

        HashSet<Integer> event1 = new HashSet<>();

        event1.add(101);
        event1.add(102);
        event1.add(103);
        event1.add(104);

        event1.add(102);

        System.out.println("Event 1 Registrations:");
        System.out.println(event1);

        event1.remove(104);

        System.out.println("\nAfter cancellation:");
        System.out.println(event1);

        if (event1.contains(103)) {
            System.out.println("\nStudent 103 is registered.");
        } else {
            System.out.println("\nStudent 103 is not registered.");
        }

        System.out.println("Total Registrations: " + event1.size());

        HashSet<Integer> event2 = new HashSet<>();

        event2.add(102);
        event2.add(103);
        event2.add(105);
        event2.add(106);

        System.out.println("\nEvent 2 Registrations:");
        System.out.println(event2);

        HashSet<Integer> bothEvents = new HashSet<>(event1);
        bothEvents.retainAll(event2);

        System.out.println("\nStudents registered for both events:");
        System.out.println(bothEvents);

        HashSet<Integer> allStudents = new HashSet<>(event1);
        allStudents.addAll(event2);

        System.out.println("\nAll Unique Registrations:");
        System.out.println(allStudents);

        System.out.println("Total Unique Students: " + allStudents.size());
    }
}