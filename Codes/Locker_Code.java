package JavaCodes.Codes;
import java.util.Scanner;

class Locker_Pin {
    private int pin = 1234;

    private boolean isOpen = false;

    public void openLocker(int enteredPin) {
        if (enteredPin == pin) {
            isOpen = true;
            System.out.println("Locker is opened");
        } else {
            System.out.println("Invalid pin");
        }
    }

    public void checkStatus() {
        if (isOpen) {
            System.out.println("Locker is opened");
        } else {
            System.out.println("Locker is closed");
        }
    }

}

public class Locker_Code {
    public static void main(String[] args) {
        Locker_Pin locker = new Locker_Pin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN to open locker: ");
        int userPin = sc.nextInt();
        locker.openLocker(userPin);
        locker.checkStatus();

        sc.close();
    }
}
