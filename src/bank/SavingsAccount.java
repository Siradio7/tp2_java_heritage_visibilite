package bank;

public class SavingsAccount extends BankAccount {
    private float interestRate;

    public SavingsAccount(int accountNumber, double balance, String ownerName, float interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        this.deposit(this.getBalance() * this.interestRate);
    }
}
