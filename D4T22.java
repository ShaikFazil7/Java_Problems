import java.util.LinkedList;

public class D4T22 {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.addLast("Fazil");
        queue.addLast("arshil");
        queue.addLast("moin");

        System.out.println("Waiting Customers:");
        System.out.println(queue);

        queue.addFirst("Emergency Customer");

        System.out.println("\nAfter adding emergency customer:");
        System.out.println(queue);

        System.out.println("\nAll Waiting Customers:");

        for (String customer : queue) {
            System.out.println(customer);
        }

        System.out.println("\nServing: " + queue.poll());

        System.out.println("Next Customer: " + queue.peek());

        queue.remove("Rahul");

        System.out.println("\nAfter removing fazil:");
        System.out.println(queue);

        System.out.println("\nTotal Waiting Customers: " + queue.size());

        System.out.println("\nServing Remaining Customers:");

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }

        System.out.println("\nQueue is empty: " + queue.isEmpty());
    }
}