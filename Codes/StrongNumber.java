public class StrongNumber {
    public static void main(String[] args) {
        int n = 145, sum = 0, temp = n;
        while (temp != 0) {
            int d = temp % 10;
            int f = 1;
            for (int i = 1; i <= d; i++) f *= i;
            sum += f;
            temp /= 10;
        }
        System.out.println(n + " is Strong: " + (sum == n));
    }
}
