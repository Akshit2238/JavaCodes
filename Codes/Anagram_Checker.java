package lib.College;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Anagram Checker ===");
        System.out.print("Enter first string : ");
        String str1 = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("\nResult: \"" + str1 + "\" and \"" + str2 + "\" ARE anagrams!");
        } else {
            System.out.println("\nResult: \"" + str1 + "\" and \"" + str2 + "\" are NOT anagrams.");
        }

        scanner.close();
    }
}
