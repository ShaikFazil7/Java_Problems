import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public class D4T18 {
    public static void main(String[] args)
    {
        TreeMap<Integer , Integer> result = new TreeMap<>();

        result.put(101 , 85);
        result.put(102 , 80);
        result.put(103 , 75);
        result.put(104 , 80);
        result.put(105 , 95);

        result.put(105,93);

        System.out.println("All Results:");
        for (Map.Entry<Integer, Integer> e : result.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());

        System.out.println("Marks of Roll 103: " + result.get(103));

        System.out.println("First Entry: " + result.firstEntry());
        System.out.println("Last Entry: " + result.lastEntry());

        int high = Collections.max(result.values());
        int low = Collections.min(result.values());

        System.out.println("Highest Marks: " + high);
        System.out.println("Lowest Marks: " + low);

        System.out.println("Roll Numbers 103 to 108:");
        System.out.println(result.subMap(103, true, 108, true));

        System.out.println("Reverse Roll Number Order:");
        System.out.println(result.descendingMap());
    }
}
