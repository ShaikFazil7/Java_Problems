import java.util.HashSet;

public class HashSetDemo
{
    public static void main(String[] args)
        {
            HashSet<String> course = new HashSet<>();
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