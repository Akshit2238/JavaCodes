package Codes;
package lib.College;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0; // to find reverse
        int z; // used because the original value will become 0
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        z = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (rev == z) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
