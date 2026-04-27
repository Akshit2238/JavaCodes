package JavaCodes.Codes;

import java.util.Scanner;

public class Inches_To_Meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in inches :");
        double a = sc.nextDouble();
        double meter = a * 0.0254;
        System.out.println("Inches into meter: " + meter);
        sc.close();
    }
}

