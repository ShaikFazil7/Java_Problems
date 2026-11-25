import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args)
    {
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(101,"Rahul");
        students.put(102,"priya");
        students.put(103,"arun");

        System.out.println(students);
        System.out.println("Student 101 : " + students.get(101));
        students.put(102,"Sneha");
        students.remove(103);
        System.out.println("Updated Map : " + students);

    }
}
