
import java.util.Scanner;

public class Bitwise_Operator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.print("Enter Number a:");
            int a = sc.nextInt();
            System.err.print("Enter Number b:");
            int b = sc.nextInt();
            System.err.println("a&b = " + (a & b));
            System.err.println("a|b = " + (a | b));
            System.err.println("a<<1 = " + (a << 1));
            System.err.println("a>>2 = " + (a >> 2));
        }
    }
}
