package Codes;
package lib.College;

import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; n != 0; n /= 10, ++count)
            ;
        System.out.println("Number of digits: " + count);
        System.out.println(count);
    }
}
