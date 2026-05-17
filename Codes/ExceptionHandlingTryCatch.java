public class ExceptionHandlingTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(50 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        System.out.println("Rest of the code.");
    }
}
