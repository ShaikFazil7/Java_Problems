import java.util.TreeSet;

public class D4T24 {
    public static void main(String[] args) {

        TreeSet<String> skills = new TreeSet<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("React");
        skills.add("SQL");
        skills.add("MongoDB");

        skills.add("HTML");
        skills.add("CSS");

        skills.add("Java");

        System.out.println("Technical Skills:");
        System.out.println(skills);

        skills.remove("CSS");

        System.out.println("\nAfter removing CSS:");
        System.out.println(skills);

        if (skills.contains("Python")) {
            System.out.println("\nPython skill is available.");
        } else {
            System.out.println("\nPython skill is not available.");
        }

        System.out.println("\nFirst Skill: " + skills.first());
        System.out.println("Last Skill: " + skills.last());

        System.out.println("\nSkills in Descending Order:");

        for (String skill : skills.descendingSet()) {
            System.out.println(skill);
        }
    }
}