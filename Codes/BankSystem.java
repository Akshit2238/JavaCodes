class Account {
    int balance = 1000;
    void deposit(int amount) { balance += amount; }
    void show() { System.out.println("Balance: " + balance); }
}
public class BankSystem {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(500);
        a.show();
    }
}
