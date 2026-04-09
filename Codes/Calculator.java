package Codes;
package lib.College;

import java.util.Scanner;

class Arithmatic_Function {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Arithmatic_Function obj = new Arithmatic_Function();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n = sc.nextInt();
        System.out.println("Enter the second number:");
        int m = sc.nextInt();
        System.out.println("Enter the operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulo");
        int choice = sc.nextInt();
        int result = 0;
        switch (choice) {
            case 1:
                result = obj.add(n, m);
                break;
            case 2:
                result = obj.subtract(n, m);
                break;
            case 3:
                result = obj.multiply(n, m);
                break;
            case 4:
                result = obj.divide(n, m);
                break;
            case 5:
                result = obj.modulo(n, m);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Result:" + result);
        sc.close();

    }
}
