public class ThrowVsThrows {
    static void method() throws ArithmeticException {
        System.out.println("Inside method");
        throw new ArithmeticException("throwing arithmetic exception");
    }
    public static void main(String args[]) {
        try { method(); }
        catch (ArithmeticException e) { System.out.println("Caught in main: " + e); }
    }
}
