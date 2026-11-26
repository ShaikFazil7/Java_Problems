
import java.util.LinkedHashMap;
import java.util.Map;

public class D4T28 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> orders = new LinkedHashMap<>();

        orders.put(101, "Preparing");
        orders.put(102, "Packed");
        orders.put(103, "Out for Delivery");
        orders.put(104, "Preparing");
        orders.put(105, "Delivered");

        orders.put(101, "Packed");
        orders.put(102, "Out for Delivery");
        orders.put(104, "Delivered");

        int searchId = 103;
        if (orders.containsKey(searchId)) {
            System.out.println("Order Status: " + orders.get(searchId));
        } else {
            System.out.println("Order not found");
        }

        orders.remove(105);

        System.out.println("\nAll Active Orders:");
        for (Map.Entry<Integer, String> entry : orders.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        int preparing = 0, packed = 0;
        int outForDelivery = 0, delivered = 0;

        for (String status : orders.values()) {
            switch (status) {
                case "Preparing":
                    preparing++;
                    break;
                case "Packed":
                    packed++;
                    break;
                case "Out for Delivery":
                    outForDelivery++;
                    break;
                case "Delivered":
                    delivered++;
                    break;
            }
        }

        System.out.println("\nOrder Status Count:");
        System.out.println("Preparing: " + orders.getOrDefault(106, "Not Found"));
        System.out.println("Preparing Count: " + preparing);
        System.out.println("Packed Count: " + packed);
        System.out.println("Out for Delivery Count: " + outForDelivery);
        System.out.println("Delivered Count: " + delivered);
    }
}
