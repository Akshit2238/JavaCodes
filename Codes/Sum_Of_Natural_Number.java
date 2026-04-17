import java.util.Scanner;

public class Sum_Of_Natural_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + number + " natural numbers is: " + sum);
        scanner.close();
    }
}


