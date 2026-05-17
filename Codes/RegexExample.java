import java.util.regex.*;
public class RegexExample {
    public static void main(String args[]) {
        System.out.println(Pattern.matches(".s", "as")); // true
        System.out.println(Pattern.matches(".s", "mst")); // false
    }
}
