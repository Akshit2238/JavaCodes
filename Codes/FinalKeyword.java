public class FinalKeyword {
    final int speedlimit = 90; // final variable

    void run() {
        // speedlimit = 400; // Compile time error
        System.out.println("Speed limit: " + speedlimit);
    }

    public static void main(String args[]) {
        FinalKeyword obj = new FinalKeyword();
        obj.run();
    }
}
