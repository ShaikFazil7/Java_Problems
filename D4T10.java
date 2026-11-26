import java.util.Scanner;
import java.util.TreeSet;
public class D4T10 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(80);
        scores.add(75);
        scores.add(70);
        scores.add(77);
        scores.add(88);

        System.out.println("Ascending Order : " + scores);

        System.out.println("First Score : " + scores.first());
        System.out.println("Last Score : " + scores.last());

        System.out.println("Enter the Score :");
        int score = sc.nextInt();

        System.out.println("Highest Score : " + scores.higher(score));

        System.out.println("Lowest Score : " + scores.lower(score));

        System.out.println("Display Score In Descending Order : " + scores.descendingSet());


    }    
}
