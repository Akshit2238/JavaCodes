package Codes;

import java.util.Scanner;

public class Swappping_Two_Number_WIthout_Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = input.nextInt();
        System.out.println("Enter Second Number:");
        int b = input.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swaping:");
        System.out.println("A:" + a);
        System.out.println("B:" + b);

        input.close();
    }
}
