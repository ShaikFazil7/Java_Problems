import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
        {
            LinkedHashSet<String> course = new LinkedHashSet<>();
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