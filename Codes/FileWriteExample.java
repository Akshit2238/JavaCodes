import java.io.FileWriter;
public class FileWriteExample {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Welcome to Java.");
            fw.close();
        } catch (Exception e) { System.out.println(e); }
        System.out.println("Success...");
    }
}
