package JavaCodes.Codes;

public class Exception_Handling {
    public static void main(String[] args) {

        System.out.println("=== Exception Handling ===");

        // Example 1: Divide by Zero
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Finally block runs always.");
        }

        // Example 2: Array Out of Bounds
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        } finally {
            System.out.println("Finally block runs always.");
        }

        // Example 3: Number Format
        try {
            int num = Integer.parseInt("abc");
            System.out.println("Parsed: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert text to number!");
        } finally {
            System.out.println("Finally block runs always.");
        }

    }
}
