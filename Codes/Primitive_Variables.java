package Codes;
import java.util.Scanner;

public class Primitive_Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int:");
        int a = sc.nextInt();
        System.out.println("Enter float:");
        float b = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Char:");
        char c = sc.nextLine().charAt(0);
        System.out.println("Enter True/False:");
        boolean d = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Int:" + a);
        System.out.println("Float:" + b);
        System.out.println("Char:" + c);
        System.out.println("Boolean:" + d);
        sc.close();
    }
}


