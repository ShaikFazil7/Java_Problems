
class StudentNameProcessor {
    String fullname = " Shaik Fazil ";
}

public class D3T19 {
    public static void main(String[] args) {

        StudentNameProcessor snp = new StudentNameProcessor();

        String name = snp.fullname.trim();

        System.out.println("Removing unnecessary Spaces: " + name);

        System.out.println("Uppercase: " + name.toUpperCase());

        System.out.println("To find length: " + name.length());

        int space = name.indexOf(" ");

        System.out.println("First Name: " + name.substring(0, space));

        System.out.println("Last Name: " + name.substring(space + 1));
    }
}
