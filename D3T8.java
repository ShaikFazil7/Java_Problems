class WordAnalyzer
{
    String word = "banana";
}
public class D3T8 {
    public static void main(String[] args) {
        WordAnalyzer wa = new WordAnalyzer();
        System.out.println(wa.word.indexOf("a"));
        System.out.println(wa.word.lastIndexOf("a"));
        System.out.println(wa.word.indexOf("n"));
       System.out.println("Last occurrence of n: " + wa.word.lastIndexOf('n'));
    }
    
}
