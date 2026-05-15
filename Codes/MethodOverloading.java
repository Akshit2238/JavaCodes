public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers: " + add(10, 20));
        System.out.println("Sum of 3 numbers: " + add(10, 20, 30));
    }
}
