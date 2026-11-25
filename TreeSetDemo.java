import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args)
        {
            TreeSet<String> course = new TreeSet<>();
            
            course.add("java");
            course.add("pyhton");
            course.add("React");
            course.add("java");

            System.out.println(course);

            System.out.println("contains java : " + course.contains("java"));

            course.remove("python");

            System.out.println("After removal : " + course);

        }
}