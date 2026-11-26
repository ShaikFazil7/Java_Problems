
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Map;

public class D4T30 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Fazil", 85);
        students.put("vishnu", 72);
        students.put("muzzu", 95);
        students.put("John", 60);
        students.put("arshil", 95);

        TreeSet<Integer> marks = new TreeSet<>(students.values());

        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nHighest Marks: " + marks.last());
        System.out.println("Lowest Marks: " + marks.first());

        System.out.println("\nUnique Marks in Ascending Order:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("\nStudents Scoring Above 80:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > 80) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        int total = 0;
        for (int mark : students.values()) {
            total += mark;
        }
        double average = (double) total / students.size();
        System.out.println("\nClass Average: " + average);

        System.out.println("\nTop Performing Student(s):");
        int highest = marks.last();
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() == highest) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        int pass = 0, fail = 0;
        for (int mark : students.values()) {
            if (mark >= 40) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("\nPassed Students: " + pass);
        System.out.println("Failed Students: " + fail);
    }
}
