class Texteditor
{
    String sentence="I love python programming";
}
public class D3T10 {
    public static void main(String[] args) {
        Texteditor te = new Texteditor();
        System.out.println("Replacing"+ te.sentence.replace("python","java"));
    }
}
