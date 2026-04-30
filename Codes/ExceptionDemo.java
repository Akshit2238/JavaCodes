package lib.College.JavaCodes;
public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;

        int b;
        b = 0;
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }finally{
            System.out.println("finally");

        System.out.println("akt");
        }
    }
}
