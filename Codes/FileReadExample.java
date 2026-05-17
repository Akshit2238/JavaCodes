import java.io.FileReader;
public class FileReadExample {
    public static void main(String args[]) throws Exception {
        try {
            FileReader fr = new FileReader("test.txt");
            int i;
            while ((i = fr.read()) != -1) System.out.print((char) i);
            fr.close();
        } catch (Exception e) { System.out.println("File not found."); }
    }
}
