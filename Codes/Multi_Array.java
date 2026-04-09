package Codes;

import java.util.Scanner;

public class Multi_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row:");
        int m = sc.nextInt();
        System.out.print("Enter Column:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("These elements are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
