
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D4T29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z0-9\\s]", "");

        String[] words = paragraph.trim().split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String mostFrequent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("\nMost Frequent Word: " + mostFrequent);
        System.out.println("Occurrence: " + maxCount);

        System.out.println("Unique Words: " + frequency.size());

        sc.close();
    }
}
