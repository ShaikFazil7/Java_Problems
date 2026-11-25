import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Learn java");
        tasks.add("Leran sql");
        tasks.add("Learn React");

        tasks.addFirst("Smart training");
        tasks.add(1, "Build Projects");

        System.out.println(tasks);

        tasks.removeFirst();
        tasks.remove(1);

        System.out.println("After removal : " + tasks);
    }
}
