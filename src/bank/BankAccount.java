package bank;

public class BankAccount {
    public static int nbCreatedAccounts = 0;
    private final int ACCOUNT_NUMBER;
    private double balance;
    protected String ownerName;

    public BankAccount(int accountNumber, double balance, String ownerName) {
        this.ACCOUNT_NUMBER = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        nbCreatedAccounts++;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    static int getNbCreatedAccounts() {
        return nbCreatedAccounts;
    }

    public final void displayAccountInfo() {

        System.out.println("Account number: " + ACCOUNT_NUMBER);
        System.out.println("Account name: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}
