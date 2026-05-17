public class VarargsExample {
    static void display(String... values) {
        for (String s : values) {
            System.out.println(s);
        }
    }
    public static void main(String args[]) {
        display(); // zero arguments
        display("hello"); // one argument
        display("my", "name", "is", "varargs"); // four arguments
    }
}
